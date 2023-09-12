
public class Node1<T> {
	/** @param Stores data of the node
	 */
	T data; //Stores address of the node
	Node1 nextNode; 
	/**
	 * @param default constructor for Node1
	 */
	public Node1() {
		data = null;
		nextNode = null;
	}
	/**
	 * 
	 * @param data
	 * 
	 */
	public Node1(T data)
	{
		this.data = data;
		this.nextNode = null;
	}
	/**
	 * 
	 * @param Sets data
	 */
	public void setData(T data) {
		this.data=data;
	}
	/**
	 * @param get generic node
	 * @return this
	 */
	public Node1<T> getNode() {
		return this;
	}
	public void setNextNode(Node1 nextNode)
	{
		this.nextNode=nextNode;
	}
	
	
}//end nextNode1
