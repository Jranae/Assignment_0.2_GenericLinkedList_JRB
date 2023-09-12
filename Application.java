
public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList1 myList=new LinkedList1();
		System.out.println("LinkedList1 created as myList : ");
		
		Node1 aNode= new Node1();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node1();
		aNode.setData("Leah");
		myList.addNode(aNode);
		aNode=new Node1();
		aNode.setData(4.16);
		myList.addNode(aNode);
		
		Node1 tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
		System.out.println(myList.isEmpty());

}// end main
}//end LinkedList