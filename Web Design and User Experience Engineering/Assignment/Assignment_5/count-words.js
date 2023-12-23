/**
 * This function should count all the words in the input sentence and return a object
 * with the word as the key and count as the value.
 *
 * @param {String} the sentence
 * @return {Object} the kay value pair of word and its count
 */
// export const countWords = (sentence) => {
//     // This is just a sample output
//     return { 'hello': 5, 'world': 2 };
// }

export const countWords = (sentence) => {
    let words = sentence.split(/\s+/);
    let answer = {};

    for(let i=0; i<words.length; i++){
        let voc=words[i].replace(/[^a-zA-Z0-9']/g, '').toLowerCase();
        //answer[voc]===undefined
        if(voc in answer){
        answer[voc]+=1;
        }
        else{
        answer[voc]=1;
        }
    }
    return answer;
}

//Testcase

// console.log(countWords("hello world hello"));
// console.log(countWords("This is a .sample sentence.... It is a simple sample sentence."));