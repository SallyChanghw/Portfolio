/**
 * This utility function should create a shallow copy of the reversed array,
 * filtered down to just the elements from the given array that pass the test
 * implemented by the provided callbackFn function.
 *
 * Parameters:
 *  array: The array will be a numeric array and can also be empty.
 *  callbackFn: A function to execute for each element in the array. It should
 *  return a truthy value to keep the element in the resulting array, and a falsy
 *  value otherwise. The function is called with the following
 *      arguments:
 *          element - The current element being processed in the array.
 *          index - The index of the current element being processed in the array.
 *  for example the callbackFn can filter odd or even numbers.
 *
 * @param {Array} array the array
 * @param {Function} callbackFn the callback function
 * @return {Array} the filtered and reversed array.
 */
// export const filterAndReverse = (array, callbackFn) => {
//     return array;
// }

export const filterAndReverse = (array, callbackFn) => {
  let filter_array=[];
  for(let i=0;i<array.length;i++){
      if(callbackFn(array[i])){
      filter_array.push(array[i]);
      }
  }
  return filter_array.reverse();
  
  // if(array.length===0){
  //   return [];
  // }

  // const fileter_array=array.filter(callbackFn);
  // return fileter_array.reverse();
}

  //Test Function

  // const isOdd = (num) => {
  //   if(num%2===1){
  //     return num;
  //   }
  // }
  
  // const isEven = (num) =>{
  //   if(num%2===0){
  //     return num;
  //   }
  // }


  //Testcase

  // const array = [];
  // const array = [1, 2, 3, 4, 5];
  // const ans = filterAndReverse(array, isOdd);
  // const ans = filterAndReverse(array, isEven);
  // console.log(ans);