
/**
 * Radix Sort:
 * 1. look at the one's place,
 * 2. add numbers to buckets that represent each digit (eg 8976 place 0 is 6, so it goes in bucket 6)
 * 3. combine the buckets in order back into a list
 * 4. repeat 1-3, looking at the next place until no numbers have that place
 * [12 35 21 15] -> 1:[21] 2:[12] 5:[35 15]
 * 1:[21] 2:[12] 5:[35 15] -> [21 12 35 15]
 * [21 12 35 15] -> 1:[12 15] 2:[21] 3:[35]
 * 1:[12 15] 2:[21] 3:[35] -> [12 15 21 35]
 *
 * https://www.youtube.com/watch?v=YXFI4osELGU
*/


function radixSort (unsortedArray) {
  // find largest number - O(n)
  var largestNum = findLargestNum(unsortedArray);

  // get the number of places - O(k)
  var places = getPlaces(largestNum);

  var intermediateArray = unsortedArray;
  //repeat k times
  for (var i = 1; i <= places; i++){
    // place each item in the intermediateArray into a bucket O(n)
    var buckets = bucketize(intermediateArray, Math.pow(10, i));

    // merge the buckets
    intermediateArray = combineBuckets(buckets);
  }

  return intermediateArray;
}

function findLargestNum(array) {
  return array.reduce(function(largest, num) {
    return largest > num ? largest : num;
  });
}

function getPlaces(number) {
  var places = 1;
  while (Math.floor(number/Math.pow(10,places)) > 0) {
    places++;
  }
  return places;
}

function bucketize(intermediateArray, place) {
  var buckets = {};
  intermediateArray.forEach(function(number) {
    var bucket = Math.floor((number%place)*(10/place));
    if(buckets[bucket]) {
      buckets[bucket].push(number);
    } else {
      buckets[bucket] = [number];
    }
  });
  return buckets;
}

function combineBuckets(buckets) {
  var combined = [];
  for (var i = 0; i < 10; i++) {
    if(buckets[i]) {
      combined = combined.concat(buckets[i]);
    }
  }
  return combined;
}

// examples
// console.log(radixSort([3,14,5,7,434,0]))


