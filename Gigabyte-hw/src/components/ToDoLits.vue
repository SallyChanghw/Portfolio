<script setup>

import {ref, watch, computed, onMounted} from 'vue'

const isVisible = ref(false); // workspace
const overCount = ref(false);
const itemList = ref([]);
const itemID = ref(1); // count item
const currentID = ref(null); // for edit and point

// workspace input
const titleName = ref('');
const startDate = ref('');
const endDate = ref('');

const fileInput = ref(null);
const uploadImg = ref('');
const urlImg = ref('');
const contentText = ref('');
const maxLength = 200;

// sidebar img
const randomUrl = ref('https://picsum.photos/250/80');
function getRandomImage() {
    randomUrl.value = `https://picsum.photos/250/80?random=${Math.random()}`;
}

// add new item
function addItem(){

    // number limitation
    if(itemList.value.length >= 10){
        alert('You cannot add new items. (The total number is over 10)');
        overCount.value = true;
        return;
    }
    overCount.value = false;
    
    isVisible.value = true;
    itemList.value.push({
        id: itemID.value,
        title: '',
        start: '',
        end: '',
        img: '',
        content: ''
    });

    currentID.value = itemID.value;
    itemID.value++;
    
    // clear when adding new item
    titleName.value = '';
    startDate.value = '';
    endDate.value = '';
    uploadImg.value ='';
    urlImg.value = '';
    contentText.value = '';
}

// preview image
const previewUrl = computed(() => {
    if (urlImg.value.trim()){
        return urlImg.value;
    }
    if (uploadImg.value){
        return uploadImg.value;
    }
    return '';
})

// update bar title
watch([titleName, startDate, endDate, previewUrl, contentText], ([newTitle, newStart, newEnd, newUrl, newContent]) => {
    // date validation
    if(newStart && newEnd){
        if(newStart > newEnd){
            alert('Start Date cannot be later than End Date')
            startDate.value = '';
            endDate.value = '';
            return;
        }
        else if(newStart === newEnd){
            alert('Start Date cannot be the same as End Date')
            startDate.value = '';
            endDate.value = '';
            return;
        }
    }
    
    const item = itemList.value.find(i => i.id === currentID.value);
    if (item){
        // clear > reassign
        item.title = newTitle;
        item.start = newStart;
        item.end = newEnd;
        item.img = newUrl;
        item.content = newContent;
    }
})

// change upload input & button style
function fileUpload(){
    fileInput.value.click();
}

// read upload file
function onFileChange(e) {
    const file = e.target.files[0];
    const url = URL.createObjectURL(file);
    uploadImg.value = url;
    
    const item = itemList.value.find(i => i.id === currentID.value);
    if (item){
        item.img = url;
    }
}

// edit data
function edit(id){
    isVisible.value = true;
    const exist = itemList.value.find(i => i.id === id);

    if(exist){
        currentID.value = id;
        titleName.value = exist.title;
        startDate.value = exist.start;
        endDate.value = exist.end;
        contentText.value = exist.content;

        // confirm img input type
        if (exist.img?.startsWith('blob:')) {
            uploadImg.value = exist.img
            urlImg.value = ''
        }
        else {
            urlImg.value = exist.img || ''
            uploadImg.value = ''
        }
    }
}

// delete list
function deleteList(){
    const index = itemList.value.findIndex(i => i.id === currentID.value);
    if (index != -1){
        //delete item
        itemList.value.splice(index, 1);
        currentID.value = null;
        isVisible.value = false;
        titleName.value = '';
        startDate.value = '';
        endDate.value = '';
        urlImg.value = '';
        uploadImg.value = '';
    }
    if(itemList.value.length == 0){
        isVisible.value = false;
    }
}

//mobile

const showSidebar = ref(true)
const showOverlay = ref(false)

// const showSidebar = ref(true);
// hamburger menu
function openBar(){
    showSidebar.value = true;
    showOverlay.value = true;
}

function closeBar(){
    showSidebar.value = false;
    showOverlay.value = false;
}

onMounted(() => {
  checkWindowSize();
  window.addEventListener('resize', checkWindowSize);
});

function checkWindowSize() {
  if (window.innerWidth < 768) {
    showSidebar.value = false;
    showOverlay.value = false;
  } else {
    showSidebar.value = true;
    showOverlay.value = true;
  }
}

</script>


<template>
    <div class="page">
        <div class="bar" v-if="showSidebar">
            <div class="barTop">
                <div class="top">
                    <h1>Demo Todo List</h1>
                    <!-- closeIcon -->
                    <img class="mobileOnly" src="/src/assets/close.png" alt="" style=" margin-right: 15px;" @click="closeBar()">
                </div>
                
                <div class="all">
                    <div class="item">
                        <div class="newItem" v-for="eachItem in itemList" :key="eachItem.id" @click="edit(eachItem.id)">{{ eachItem.id + ". " +eachItem.title }}
                            <div class="point" :style="{visibility: currentID === eachItem.id ? 'visible' : 'hidden'}"></div>
                        </div>
                    </div>
                    <button class="addBtn" :style="{backgroundColor: overCount? '#ebebeb' : '#e7ffe9', cursor: overCount ? 'default' : 'pointer'}" @click="addItem()">Add item</button>
                </div>
            </div>
            <img class="changeImg" @click="getRandomImage()" :src="randomUrl" alt="picture" decoding="async">
        </div>

        <div :class="{overlay: showOverlay}"></div>

        <div class="work" :style="{ visibility: isVisible ? 'visible' : 'hidden'}">
            <div class="icon">
                <!-- hamburgerIcon -->
                <div class="hamburgerIcon">
                    <img class="mobileOnly" src="/src/assets/hamburger.png" alt="" @click="openBar()">
                </div>
                <div class="deleteIcon">
                    <img src="/src/assets/trash_icon.png" alt="" style="width: 20px; height: 20px;" @click="deleteList()">
                </div>
            </div>            

            <div class="TD">
                <div class="titleInput">
                    <p>Title</p>
                    <input type="text" v-model="titleName" placeholder="new item title" class="insideInput">
                </div>
                <div class="titleInput">
                    <p>Date</p>
                    <div class="dateInput">
                        <input type="date" v-model="startDate">
                        <div style="font-size: 18px;">~</div>
                        <input type="date" v-model="endDate">
                    </div>
                </div>
            </div>

            <div class="image">
                <div class="title">Image</div>
                <div class="info">
                    <div class="upload">
                        <input type="file" ref="fileInput" style="display:none" @change="onFileChange">
                        <button class="uploadBtn" @click="fileUpload">Upload Image</button>
                        <div style="margin: 20px 0px 20px 0px; font-size: 18px;">or</div>
                        <input type="text" v-model="urlImg" placeholder="請輸入圖片網址" class="insideInput">
                    </div>
                    
                    <div class="showImg" :style="{backgroundImage: previewUrl? `url(${previewUrl})` : ''}"></div>
                </div>

            </div>

            <div class="content">
                <div class="title">Content</div>
                <textarea v-model="contentText" name="content" id="" :maxlength="200">content...</textarea>
                <div class="textLimit">{{ contentText.length}} / {{ maxLength }}</div>
            </div>
        </div>
    </div>
</template>