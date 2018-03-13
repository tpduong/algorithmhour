function LinkedList() {
  this.head = null;
  this.tail = null;
}

function Node(val) {
  this.value = val;
  this.next = null;
}

LinkedList.prototype.addToTail = function(val){
  var node = new Node(val);
  if(this.head ===  null) {
    this.head = node;
    this.tail = node;
  } else {
    this.tail.next = node;
    this.tail = node;
  }
};

LinkedList.prototype.removeFromHead = function() {
  if(this.head.next) {
    var oldHead = this.head;
    this.head = this.head.next;
    oldHead.next = null;
    return oldHead.val;
  }
  this.head = null;
  this.tail = null;
};

module.export = LinkedList;

// var linkedList = new LinkedList();
//
// linkedList.addToTail(1);
// linkedList.addToTail(2);
// linkedList.addToTail(3);
//
// console.log(linkedList);
//
// linkedList.removeFromHead();

// console.log(linkedList);
