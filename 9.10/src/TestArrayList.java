import java.util.ArrayList;


public class TestArrayList {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList list = new ArrayList();
		list.add("hhh");
		list.add(9999);
		System.out.println(list);
		list.add(1,"fff");
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.get(1));
		System.out.println(list.size());
		list.set(1,"kkkkkk");
		System.out.println(list);
		System.out.println(list.toArray());
		System.out.println(list.indexOf("hhh"));
	}

}
