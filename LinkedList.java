

public class LinkedList
{
    private Node first;
    private Node last;
    private Node current;

    public LinkedList()
    {
    first = null;
    last = null;
    current = null;
    }
    
    public boolean isEmpty()
    {
    return (first==null);
    }

    public void insertAtFront(Object insertItem)
    {
    Node newNode = new Node(insertItem);
    if (isEmpty())
    { 
    first = newNode;
    last = newNode;
    }
    else
    {
    newNode.next = first;
    first = newNode;
    }
}
public void insertAtBack(Object insertItem)
{
Node newNode = new Node(insertItem);
if (isEmpty())
{ first = newNode;
last = newNode;
}
else
{
last.next = newNode;
last = newNode;
}
}

public Object removeFromFront()
{
Object removeItem = null;
if (isEmpty())
{
return removeItem;
}
removeItem = first.data;
if ( first == last)
{
first = null;
last = null;
}
else
first = first.next;
return removeItem; }
public Object removeFromBack()
{
Object removeItem = null;
if (isEmpty())
{
return removeItem;
}
removeItem = last.data;
if ( first == last)
{
first = null;
last = null;
}
else
{
current = first;
while (current.next != last)
current = current.next;
last = current;
last.next = null;
}
return removeItem; }
public Object getFirst()
{
if (isEmpty())
return null;
else
{
current = first;
return current.data;
}
}
public Object getNext()
{
if (current == last)
return null;
else
{
current = current.next;
return current.data;
}
}
}

