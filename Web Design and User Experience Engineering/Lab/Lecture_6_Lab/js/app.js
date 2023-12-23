const root=document.getElementById('root');
let count=5;

const addArticle=(index,parent)=>{
    const article=document.createElement('article');
    parent.appendChild(article);
    article.innerHTML=`<h1>lorem ipsum</h1> ${index} <p>article content</p>`
    article.id=`article-${index}`;
    article.classList.add('blog');
    article.setAttribute('x-index',index);
}

const liveList=document.getElementsByTagName('article');
const staticList=document.querySelectorAll('.blog');
console.log(`(Before) LiveList Count: ${liveList.length} & StaticList count:${staticList.length}`);

for(let i=0; i<count; i++){
    addArticle(i, root);
}
console.log(`(After) LiveList Count: ${liveList.length} & StaticList count:${staticList.length}`);
