import java.util.LinkedList;


public class TestLinkedlist {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.offer("hhhh");
		list.offer("jjjj");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.peek());
		list.push("jlll");
		System.out.println(list);
		System.out.println(list.pop());
	}
}
