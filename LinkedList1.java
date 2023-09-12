/**
 * 
 * @author jbeason
 *
 * @param <T>
 */
public class LinkedList1<T> {
	/**
	 *@param Head of the node
	 */
    private Node1 head;
    private int length;
    private Node1 tail;
    /**
     * 
     *@param constructor
     */
    public LinkedList1() { 
    	head = null;
    	length = 0;
    	tail = head;
    	}
 
    /**
     * 
     * @param Method isEmpty(): It will check whether a list is empty or not
     * 
     * @return false
     */
    public boolean isEmpty()
    {
        if (head == null) {
            return true;
        }
        else
        	return false;
    }
    /**
     * 
     * @param Method getList(): It is meant to get the linked list
     * @return head
     */
    public Node1 getList(){
    	return head;
    }
    /**
     * @param Method length(): It will return the length of the linked list
     * @return this.length
     */
    int length() { 
        return this.length; }
    
    // Method addNode(T data): This method adds a new element 
    public void addNode(Node1 aNode)
    {
        // Creating a new generic node
       
        if (isEmpty()) {
            head = aNode;
            tail = head;
            return;
        }
        tail.nextNode=aNode;
        tail=tail.nextNode;
        tail.nextNode=null;
        length++;
            }
            
    
    }
    
