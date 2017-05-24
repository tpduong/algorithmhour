/**
 *  For every element x in an array, start a new program that:
 *  Sleeps for x seconds
 *  Prints out x
 *  https://www.quora.com/What-is-the-strangest-sorting-algorithm
 */

function sleepSort(unsortedArray) {
  unsortedArray.forEach(function(num) {
    if(num >= 0) {
      setTimeout(function() {console.log(num)}, num);
    } else {
      console.log("error: ", num);
    }
  })
}

sleepSort([30,20,10,50, -70, -60, 'what is this?']);

