/**
 *  For every element x in an array, start a new program that:
 *  Sleeps for x seconds
 *  Prints out x
 *  https://www.quora.com/What-is-the-strangest-sorting-algorithm
 */

function sleepSort(unsortedArray) {
  unsortedArray.forEach(function(num) {
    setTimeout(function() {console.log(num)}, num)
  })
}

sleepSort([30,20,10,50]);
