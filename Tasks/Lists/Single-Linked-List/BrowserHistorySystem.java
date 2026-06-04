class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}
class BrowserHistorySystem
{
    Node head;
    public void visitedPages(String data)
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
    public void visitNewPages(String data)
    {
        Node newNode=new Node(data);
       if(head==null)
       {
        head=newNode;
        return;
       }
       Node currentNode=head;
       int currentPosition=0;
       while(currentNode!=null && currentPosition<2)
       {
        currentNode=currentNode.next;
        currentPosition++;
       }
       if(currentNode==null)
       {
            System.out.println("Position is Not a valid");
       }
    }
    public void BrowsingHistoryDisplay()
    {
        Node currentNode=head;
        System.out.println("Browsing History:");
        while(currentNode!=null)
        {
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
    }
    public void searchPage(String data)
    {
        Node currentNode=head;
        while(currentNode!=null)
        {
            if(currentNode.data.equals(data))
            {
                System.out.println("Page Found: "+data);
                return;
            }
            currentNode=currentNode.next;
        }
        System.out.println("The Page is Invalid: "+data);
    }
    public void deletePage(String data)
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("History is Empty");
        }
        if(head.data.equals(data))
        {
            head=head.next;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null)
        {
            if(currentNode.next.data.equals(data))
            {
                currentNode.next=currentNode.next.next;
                return;
            }
            currentNode=currentNode.next;
        }
        System.out.println("Page Not Found to Delete: "+data);
    }
    
    public static void main(String args[])
    {
        BrowserHistorySystem history=new BrowserHistorySystem();
        history.visitedPages("www.google.com");
        history.visitedPages("www.facebook.com");
        history.visitedPages("www.twitter.com");
        history.BrowsingHistoryDisplay();
        history.searchPage("www.facebook.com");
        history.deletePage("www.instagram.com");
        history.BrowsingHistoryDisplay();
    }
}