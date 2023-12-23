class NewPost{
    constructor(title, author, content, date){
        this.title=title;
        this.author=author;
        this.content=content;
        this.date=date;
    }
}

const allPosts=[];

const defaultPost=(post,parent)=>{
    const ogPost=document.createElement('div');
    ogPost.className = 'new';
    
    const defaultTitle=document.createElement('h2');
    defaultTitle.innerHTML=`<strong>Title:</strong> ${post.title}`;

    const defaultAuthor = document.createElement('p');
    defaultAuthor.innerHTML = `<strong>Author:</strong> ${post.author}`;

    const defaultContent = document.createElement('p');
    defaultContent.innerHTML = `<strong>Content:</strong> ${post.content}`;

    const defaultDate = document.createElement('p');
    defaultDate.innerHTML = `<strong>Create Date:</strong>${post.date}`;

    const editButton = document.createElement('button');
    editButton.innerHTML = `Edit`;

    editButton.setAttribute('editdata', 'false');

    ogPost.appendChild(editButton);
    ogPost.appendChild(defaultTitle);
    ogPost.appendChild(defaultAuthor);
    ogPost.appendChild(defaultContent);
    ogPost.appendChild(defaultDate);
    parent.appendChild(ogPost);

    editButton.addEventListener('click', () => {
        if (editButton.getAttribute('editdata') === 'false') {
            // Allow editing
            editButton.setAttribute('editdata', 'true');
            // Index of post in allPosts
            const index = allPosts.indexOf(post);
            editPost(index, editButton);
        }
    });  
}

const postsDiv = document.getElementById("postPage")

const fetchPosts=()=>{
    const postsURI='posts.json';
    const blog=new XMLHttpRequest();
    blog.open('GET', postsURI);
    blog.addEventListener('load',function(){
        if(this.status===200){
            const responseText=this.responseText;
            const postList=JSON.parse(responseText);
            postList.forEach((item)=>{
                const post =new NewPost(item.title, item.author, item.content, item.date);
                allPosts.push(post);
                defaultPost(post,postsDiv);
            });
        }
    });
    blog.send();
}

fetchPosts();


function createPost(){
    const title=document.getElementById("title").value;
    const author=document.getElementById("author").value;
    const content=document.getElementById("content").value;
    const date = new Date().toLocaleString();

    if (title && author && content) {
        const post = {
            title: title,
            author: author,
            content: content,
            date:date
        };

        allPosts.push(post);
        alert('Successfully create the post!');

        document.getElementById("title").value = '';
        document.getElementById("author").value = '';
        document.getElementById("content").value = '';
        displayPosts();
    }
    else{
        alert('Please check the blank!');
    }

}


function displayPosts() {
    const postsDiv = document.getElementById("postPage");
    postsDiv.innerHTML = '';

    for (let i = 0; i < allPosts.length; i++) {
        const post = allPosts[i];
        const postElement = document.createElement('div');
        postElement.className = 'new';

        const editButton = document.createElement('button');
        editButton.innerHTML = `Edit`;

        editButton.setAttribute('editdata', 'false');

        editButton.addEventListener('click', () => {
            if (editButton.getAttribute('editdata') === 'false') {
                // Allow editing
                editButton.setAttribute('editdata', 'true');
                editPost(i, editButton);
            }
        });

        postElement.appendChild(editButton);


        const titleElement = document.createElement('h2');
        titleElement.innerHTML = `<strong>Title:</strong> ${post.title}`;
        postElement.appendChild(titleElement);

        const authorElement = document.createElement('p');
        authorElement.innerHTML = `<strong>Author:</strong> ${post.author}`;
        postElement.appendChild(authorElement);

        const contentElement = document.createElement('p');
        contentElement.innerHTML = `<strong>Content:</strong> ${post.content}`;
        postElement.appendChild(contentElement);

        const dateElement = document.createElement('p');
        dateElement.innerHTML = `<strong>Create Date:</strong> ${post.date}`;
        postElement.appendChild(dateElement);

        postsDiv.appendChild(postElement);
    }
}

function editPost(index,editButton) {
    const post = allPosts[index];

    const popupElement = document.createElement('div');
    popupElement.className='Popup';

    const editElement = document.createElement('div');
    editElement.className='Edit';

    const editTitleElement = document.createElement('h2');
    editTitleElement.innerHTML = `<strong>Edit</strong>`;

    const lblAuthor=document.createElement('label');
    lblAuthor.innerHTML = `Author:`;
    const editＡuthorElement = document.createElement('input');
    editＡuthorElement.value= post.author;
    editＡuthorElement.style.display = 'block'

    const lblContent=document.createElement('label');
    lblContent.innerHTML = `Content:`;
    const editContentElement = document.createElement('textarea');
    editContentElement.value= post.content;
    editContentElement.style.display = 'block'

    const saveButton = document.createElement('button');
    saveButton.innerHTML = `Save`;

    const cancelButton = document.createElement('button');
    cancelButton.innerHTML = `Cancel`;


    editElement.appendChild(editTitleElement);
    editElement.appendChild(lblAuthor);
    editElement.appendChild(editＡuthorElement);
    editElement.appendChild(lblContent);
    editElement.appendChild(editContentElement);
    editElement.appendChild(saveButton);
    editElement.appendChild(cancelButton);
  
    popupElement.appendChild(editElement);
    document.body.appendChild(popupElement);

    document.body.style.overflow = 'hidden';
    

    saveButton.addEventListener('click', () => {
        post.author = editＡuthorElement.value;
        post.content = editContentElement.value;
        post.date=new Date().toLocaleString();

        alert('Successfully edit the post!');

        // Close the Popup
        popupElement.style.display = 'none';
        // Refresh the displayed posts

        displayPosts();
        editButton.setAttribute('editdata', 'false');
        document.body.style.overflow = 'auto';
    });

    cancelButton.addEventListener('click', () => {
        alert('Cancel to edit the post!');

        // Close the Popup
        popupElement.style.display = 'none';
        
        editButton.setAttribute('editdata', 'false');
        document.body.style.overflow = 'auto';
    });

}

document.getElementById("createButton").addEventListener("click", createPost);

displayPosts();




