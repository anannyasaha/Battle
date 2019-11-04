public class DoublyLinkedList{
class Node{
  public Node next=null;
  public Node prev=null;
  public Move M;
  public int number;
  public Node(Move M,int number){
    this.M=M;
    this.number=number;
  }
}
public Node head;
public Node tail;
private int count=0;
public void insert(Move M,int number){

  Node newNode= new Node(M,number);
  if(count==0){
    head =newNode;  //if the list is empty then the first element is the head and tail.
    tail= newNode;
  }
  else{
    newNode.prev=tail;  //as new elements are being added after the previous element
    tail.next=newNode;  //prev node of new node have to be tail and next node of tail
    //has to be the new node.
    tail=newNode;}   //We are naming the new node as the tail.
count++;
}
public String toString(){
  Node current=this.head;
  String statement;
  statement="[ ";
  while(current!=tail){  //while loop will break if current node is tail

    statement=statement+"( Number-"+current.number+" Name-"+current.M.name;
    statement=statement+" Type-"+current.M.type+" Power-"+current.M.power+" Accuracy-"+current.M.accuracy+")\n  ";
    current=current.next; //changing the node
    if(current==tail)
      {statement=statement+"( Number-"+current.number+" Name-"+current.M.name;
      statement=statement+" Type-"+current.M.type+" Power-"+current.M.power+" Accuracy-"+current.M.accuracy+") ]";}

  }

return statement;
}
}
