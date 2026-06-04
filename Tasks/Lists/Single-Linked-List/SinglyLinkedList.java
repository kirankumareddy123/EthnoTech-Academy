class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList
{
    Node head;

    public void insertBeginning(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null)
        {
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }
    public void insertAtPosition(int data,int position)
    {
        Node newNode=new Node(data);
       if(position==0)
       {
        newNode.next=head;
        head=newNode;
        return;
       }
       Node currentNode=head;
       int currentPosition=0;
       while(currentNode!=null && currentPosition<position-1)
       {
        currentNode=currentNode.next;
        currentPosition++;
       }
       newNode.next=currentNode.next;
       currentNode.next=newNode;
    }
    public void deleteAtBeginning()
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("List is Empty");
        }
        head=head.next;
    }
    public void deleteAtEnd()
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("List is Empty");
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node currentNode=head;
        while(currentNode.next.next!=null)
        {
            currentNode=currentNode.next;
        }
        currentNode.next=null;
    }
    public static void main(String args[])
	{
		SinglyLinkedList sl=new SinglyLinkedList();
        sl.insertBeginning(10);
        sl.insertEnd(20);
        sl.insertAtPosition(15,1);
        sl.deleteAtBeginning();
	}
    
}
