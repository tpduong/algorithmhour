var LinkedList = require'./LinkedList.js'

var linkedList = new LinkedList();

linkedList.addToTail(1);
linkedList.addToTail(2);
linkedList.addToTail(3);

console.log(linkedList);

linkedList.removeFromHead();

console.log(linkedList);

function LRUCache(size) {
  
}