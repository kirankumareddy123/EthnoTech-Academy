// Create a java program for social media feed navigation.
// Implement a free scrolling for next post,previous post,delete post,insert sponsor post.
class Node
{
    Node next;
    Node prev;
    String data;
	public Node(String data)
	{
		this.next=null;
		this.prev=null;
		this.data=data;
	}
}
public class DoubleLinkedList
{
	Node head;
	public void insert(String data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
		}
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void delete(String data)
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data.equals(data))
			{
				if(temp.prev!=null)
				{
					temp.prev.next=temp.next;
				}
				else
				{
					head=temp.next;
				}
				if(temp.next!=null)
				{
					temp.next.prev=temp.prev;
				}
				return;
			}
			temp=temp.next;
		}
		System.out.println("Post not found");
	}
	public void insertSponsorPost(String data,int position)
	{
		Node newNode=new Node(data);
		if(position==0)
		{
			newNode.next=head;
			if(head!=null)
			{
				head.prev=newNode;
			}
			head=newNode;
			return;
		}
		Node temp=head;
		int currentPosition=0;
		while(temp!=null && currentPosition<position-1)
		{
			temp=temp.next;
			currentPosition++;
		}
		if(temp==null)
		{
			System.out.println("Position out of bounds");
			return;
		}
		newNode.next=temp.next;
		newNode.prev=temp;
		if(temp.next!=null)
		{
			temp.next.prev=newNode;
		}
		temp.next=newNode;
		
	}
	public static void main(String args[])
	{
		DoubleLinkedList dll=new DoubleLinkedList();
		dll.insert("Post 1");
		dll.insert("Post 2");
		dll.insert("Post 3");
		System.out.println("Original Feed:");
		dll.display();
		
		System.out.println("\nInserting Sponsor Post at position 1:");
		dll.insertSponsorPost("Sponsor Post", 1);
		dll.display();
		
		System.out.println("\nDeleting Post 2:");
		dll.delete("Post 2");
		dll.display();
	}
    
}
