// For example:
//
//   var myArray     = [3, 4, 6, 10, 11, 15];
// var alicesArray = [1, 5, 8, 12, 14, 19];
//
// console.log(mergeArrays(myArray, alicesArray));
// logs [1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19]

function mergeArrays(array1, array2) {
  var mergedArray = [];
  var array1Index = 0;
  var array2Index = 0;
  while (array1Index <= array1.length && array2Index <=array2.length) {
    console.log(array1Index+ array2Index)
    if (array1[array1Index] !== undefined && array2[array2Index] !== undefined) {
      if (array1[array1Index] < array2[array2Index] || array2[array2Index] === undefined) {
        mergedArray.push(array1[array1Index]);
        array1Index++;
      } else {
        mergedArray.push(array2[array2Index]);
        array2Index++;
      }
    }
    if (array1[array1Index] === undefined) {
      for (var i = array2Index; i < array2.length; i++) {
        mergedArray.push(array2[array2Index]);
      }
      break;
    } else if (array2[array2Index] === undefined) {
      for (var i = array1Index; i < array1.length; i++) {
        mergedArray.push(array1[array1Index]);
      }
      break;
    }
    console.log(mergedArray)
  }
  return mergedArray;
}

var myArray = [3, 4, 6, 10, 11, 15];
var alicesArray = [1, 5, 8, 12, 14, 19];

console.log(mergeArrays(myArray, alicesArray));