const canvas = document.getElementById('canvas');
const ctx = canvas.getContext('2d');

const enter = document.getElementById('enter');
const screen = document.getElementById('screen');

const circleCanvas = document.getElementById('circleCanvas');
const circleCtx = circleCanvas.getContext('2d');

circleCtx.beginPath();
circleCtx.arc(18, 15, 8, 0, Math.PI * 2);
circleCtx.fillStyle = 'rgb(236, 112, 112)';
circleCtx.fill();

circleCtx.beginPath();
circleCtx.arc(48, 15, 8, 0, Math.PI * 2);
circleCtx.fillStyle = 'rgb(254, 171, 47)';
circleCtx.fill();

circleCtx.beginPath();
circleCtx.arc(78, 15, 8, 0, Math.PI * 2);
circleCtx.fillStyle = 'rgb(30, 200, 70)';
circleCtx.fill();

let screenContent = '';


const buttons = [
    { text: 'C', x: 0, y: 160, width: 80, height: 80 , color:'rgb(107, 109, 109)'},
    { text: '', x: 80, y: 160, width: 80, height: 80, color:'rgb(107, 109, 109)'},
    { text: '', x: 160, y: 160, width: 80, height: 80, color:'rgb(107, 109, 109)'},
    { text: '%', x: 240, y: 160, width: 80, height: 80, color:'rgb(107, 109, 109)'},
    { text: '/', x: 320, y: 160, width: 80, height: 80, color:'rgb(254, 171, 47)'},
    { text: '(', x: 0, y: 240, width: 80, height: 80, color:'rgb(162, 162, 162)'},
    { text: '7', x: 80, y: 240, width: 80, height: 80, color:'rgb(162, 162, 162)'},
    { text: '8', x: 160, y: 240, width: 80, height: 80, color:'rgb(162, 162, 162)'},
    { text: '9', x: 240, y: 240, width: 80, height: 80, color:'rgb(162, 162, 162)'},
    { text: '*', x: 320, y: 240, width: 80, height: 80, color:'rgb(254, 171, 47)'},
    { text: ')', x: 0, y: 320, width: 80, height: 80, color:'rgb(162, 162, 162)'},
    { text: '4', x: 80, y: 320, width: 80, height: 80, color:'rgb(162, 162, 162)'},
    { text: '5', x: 160, y: 320, width: 80, height: 80, color:'rgb(162, 162, 162)'},
    { text: '6', x: 240, y: 320, width: 80, height: 80, color:'rgb(162, 162, 162)'},
    { text: '-', x: 320, y: 320, width: 80, height: 80, color:'rgb(254, 171, 47)'},
    { text: 'Back', x: 0, y: 400, width: 80, height: 80, color:'rgb(162, 162, 162)'},
    { text: '1', x: 80, y: 400, width: 80, height: 80, color:'rgb(162, 162, 162)'},
    { text: '2', x: 160, y: 400, width: 80, height: 80, color:'rgb(162, 162, 162)'},
    { text: '3', x: 240, y: 400, width: 80, height: 80, color:'rgb(162, 162, 162)'},
    { text: '+', x: 320, y: 400, width: 80, height: 80, color:'rgb(254, 171, 47)'},
    { text: '0', x: 0, y: 480, width: 240, height: 80, color:'rgb(162, 162, 162)'},
    { text: '.', x: 240, y: 480, width: 80, height: 80, color:'rgb(162, 162, 162)'},
    { text: '=', x: 320, y: 480, width: 80, height: 80, color:'rgb(254, 171, 47)'},
];

function createButtons() {
    ctx.font = '26px Arial';

    buttons.forEach(button => {
    ctx.strokeStyle='rgb(78,80,81)';
    ctx.lineWidth=3;
    ctx.strokeRect(button.x, button.y, button.width, button.height);

    ctx.fillStyle = button.color;
    ctx.fillRect(button.x, button.y, button.width, button.height);

    const textX = button.x + (button.width - ctx.measureText(button.text).width) / 2;
    const textY = button.y + button.height / 2 + 10;

    ctx.fillStyle = 'white';
    ctx.fillText(button.text, textX, textY);
    });
}

function calculateClick(event) {
    const x = event.clientX - canvas.getBoundingClientRect().left;
    const y = event.clientY - canvas.getBoundingClientRect().top;

    buttons.forEach(button => {
        if (x >= button.x && x <= button.x + button.width && y >= button.y && y <= button.y + button.height) {
            if (screenContent === "Invalid Expression") {
                screenContent = '';
            }
            
            if (button.text === "=") {
                try {
                    enter.value = screenContent;
                    screenContent = calculateExpression(screenContent).toString();
                } catch (error) {
                    screenContent = "Invalid Expression";
                }
                screen.value = screenContent;
                screenContent = "";
            }
            else if (button.text === "Back") {
                screenContent = screenContent.slice(0, -1);
                screen.value = screenContent;
            }
            else if (button.text === "C") {
                screenContent = "";
                screen.value = screenContent;
                enter.value = "";
            }
            else if(button.text==='%'){
                screenContent = parseFloat(screenContent) / 100;
                screen.value = screenContent;
            }
            else {
                screenContent += button.text;
                screen.value = screenContent;
            }
        }
    });
}

function calculateExpression(expression) {
    // clean the expression ex:7+8
    const cleanExpression = expression.replace(/[^0-9()+\-*\/.%]/g, '');
    // console.log(cleanExpression);

    // ex:"7" "+" "8"
    const tokens = cleanExpression.match(/(\d+\.\d+|\d+|\+|\-|\*|\/|%|\(|\))/g);
    // console.log(tokens);

    //which operator should be calculated first
    const priority = { '+': 1, '-': 1, '*': 2, '/': 2};

    const output = [];
    const Operator = [];

    for (const text of tokens) {
        // check if the string starts with a digital number
        if (/^\d/.test(text)) {
            output.push(parseFloat(text));
        }
        else if (text === '(') {
            Operator.push(text);
        }
        else if (text === ')') {
            while (Operator.length > 0 && Operator[Operator.length - 1] !== '(') {
                output.push(Operator.pop());
            }
            if (Operator.length === 0) {
                throw new Error("Invalid Expression");
            }
            Operator.pop(); // Pop '('
        } 
        else if ('+-*/'.includes(text)) {
            while (
                Operator.length > 0 &&
                priority[text] <= priority[Operator[Operator.length - 1]]
            ) {
                output.push(Operator.pop());
            }
            Operator.push(text);
        }
    }

    while (Operator.length > 0) {
        if (Operator[Operator.length - 1] === '(') {
            throw new Error("Invalid Expression");
        }
        output.push(Operator.pop());
    }

    const Result = [];

    for (const text of output) {
        if (typeof text === 'number') {
            Result.push(text);
        }
        else if ('+-*/%'.includes(text)) {
            if (Result.length < 2) {
                throw new Error("Invalid Expression");
            }
            const b = Result.pop();
            const a = Result.pop();
            switch (text) {
                case '+':
                    Result.push(a + b);
                    break;
                case '-':
                    Result.push(a - b);
                    break;
                case '*':
                    Result.push(a * b);
                    break;
                case '/':
                    if (b === 0) {
                        throw new Error("Invalid Expression");
                    }
                    Result.push(a / b);
                    break;
            }
        }
    }

    if (Result.length !== 1) {
        throw new Error("Invalid Expression");
    }

    return Result[0];
}

canvas.addEventListener('click', calculateClick);
createButtons();

