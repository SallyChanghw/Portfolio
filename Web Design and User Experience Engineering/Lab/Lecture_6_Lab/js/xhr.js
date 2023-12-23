class Person{
    #firstName;
    #lastName;
    #phone
    // static PI=3.14;

    constructor(firstName, lastName, phone){
        this.#firstName=firstName;
        this.#lastName=lastName;
        this.#phone=phone;

    }
    get firstName(){
        return this.#firstName;
    }

    get lastName(){
        return this.#lastName;
    }

    get phone(){
        return this.#phone;
    }
}

const addPerson=(person,parent)=>{
    const row=document.createElement('tr');
    const firstName=document.createElement('td');
    const lastName=document.createElement('td');
    const phone=document.createElement('td');
    row.appendChild(firstName);
    row.appendChild(lastName);
    row.appendChild(phone);
    parent.appendChild(row);
    firstName.textContent=person.firstName;
    lastName.textContent=person.lastName;
    phone.textContent=person.phone;
}

const tBody=document.getElementById('contact-list-tbl');
const personsURI='/data/persons.json';

const xhrPersons=()=>{
    
    const xhr=new XMLHttpRequest();
    xhr.open('GET', personsURI);
    xhr.addEventListener('load',function(){
        if(this.status===200){
            const responseText=this.responseText;
            const personList=JSON.parse(responseText);
            personList.forEach((item)=>{
                const person =new Person(item.firstName, item.lastName, item.phone);
                addPerson(person,tBody);
            });
        }
    });
    xhr.send();
}

const fetchPersons=async()=>{
    const response=await fetch(personsURI,{method:'GET'});
    const persons=await response.json();
    persons.forEach((item)=>{
        const person =new Person(item.firstName, item.lastName, item.phone);
        addPerson(person,tBody);
    });
}

fetchPersons();
