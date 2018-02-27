/**
 You are a renowned thief who has recently switched from stealing precious metals to stealing cakes because of the insane profit margins. You end up hitting the jackpot, breaking into the world's largest privately owned stock of cakes—the vault of the Queen of England.
 While Queen Elizabeth has a limited number of types of cake, she has an unlimited supply of each type.

 Each type of cake has a weight and a value, stored in an object with two properties:

 weight: the weight of the cake in kilograms
 value: the monetary value of the cake in British shillings
 For example:

 // weighs 7 kilograms and has a value of 160 shillings
 {weight: 7, value: 160}

 // weighs 3 kilograms and has a value of 90 shillings
 {weight: 3, value: 90}

 You brought a duffel bag that can hold limited weight, and you want to make off with the most valuable haul possible.

 Write a function maxDuffelBagValue() that takes an array of cake type objects and a weight capacity, and returns the maximum monetary value the duffel bag can hold.

 For example:

 var cakeTypes = [
 {weight: 7, value: 160},
 {weight: 3, value: 90},
 {weight: 2, value: 15},
 ];

 var capacity = 20;

 maxDuffelBagValue(cakeTypes, capacity);
 // returns 555 (6 of the middle type of cake and 1 of the last type of cake)

 Weights and values may be any non-negative integer. Yes, it's weird to think about cakes that weigh nothing or duffel bags that can't hold anything. But we're not just super mastermind criminals—we're also meticulous about keeping our algorithms flexible and comprehensive.

 */

var cakeTypes = [
  {weight: 7, value: 160},
  {weight: 3, value: 90},
  {weight: 2, value: 15},
  {weight: 0, value: 15},

];

var capacity = 20;

function maxDuffelBagValue(cakeTypes, capacity){
  //write stuff here
  var cakeValuePerWeight = cakeTypes.map(function(cake) {
    return {
      weight: cake.weight,
      value: cake.value,
      valuePerWeight: (cake.value && cake.weight) ? cake.value / cake.weight : 0,
    }
  });

  cakeValuePerWeight.sort(function (a, b) {
    if (a.valuePerWeight < b.valuePerWeight) return 1;
    if (a.valuePerWeight > b.valuePerWeight) return -1;
    return 0;
  });

  var totalWeight = 0
  var bag = [];

  for (var i = 0; i < cakeValuePerWeight.length ; i++) {
    var remainingCapacity = capacity - totalWeight;

    if (cakeValuePerWeight[i].weight <= remainingCapacity && cakeValuePerWeight[i].valuePerWeight !== 0) {
      var count = Math.floor(remainingCapacity/cakeValuePerWeight[i].weight);
      bag.push({
        weight: cakeValuePerWeight[i].weight,
        value: cakeValuePerWeight[i].value,
        valuePerWeight: cakeValuePerWeight[i].valuePerWeight,
        count: count,
      });
      totalWeight = totalWeight + (cakeValuePerWeight[i].weight * count);
    }
  }
  console.log(bag)
  var bagValue = bag.reduce(function(acc, item) {
      acc += item.value * item.count;
      return acc;
    }, 0)
  console.log(bagValue)
}

maxDuffelBagValue(cakeTypes, capacity)