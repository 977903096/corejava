public class Animal{
	double weight;
	String name;
	public void voice(){
		System.out.println("�����ڽ�");
	}
}

class Bird extends Animal{
	String color;
	public void fly(){
		System.out.println("��");
	}

	public void voice(){
		System.out.println("���Ȳ��Ȳ���");
	}
}

class Dog extends Animal{
	String type;
	double weight=9;
	public void lookdoor(){
		System.out.println("����");
	}

	public void voice(){
		System.out.println("��������");
	}
}
class Person{
	public void yang(Animal an){
		an.voice();
	}	
}
//��̬
class Test1{
	public static void main(String[] args){
		Animal an = new Animal();
		Bird b = new Bird();
		Dog d = new Dog();
		Person p = new Person();
		p.yang(b);

		Person p2 = new Person();
		p2.yang(d);

		Person p3 = new Person();
		p.yang(an);
	}	
}
class TestCast{
	public static void main(String[] args){
		//Animal an = new Animal();
		
		//Animal an = new Dog();//��ʱ���anֻ�ܹ�ʹ�ø�����е����Ժͷ��� �����ܹ�ʹ���������е����Ժͷ���
		//an.voice();
			
		//Dog d = (Dog)new Bird();//���벻ͨ��
		

		//Animal an = new Animal();
		//an = new Dog();

		//Animal an = new Bird();
		//an = new Dog();

		//Animal an = new Bird();
		//Bird b = (Bird)an;
		//if(an instanceof Dog){
			//Dog d = (Dog)an;
		//}
		//boolean b = an instanceof Dog;
		//System.out.println(b);
	}
}