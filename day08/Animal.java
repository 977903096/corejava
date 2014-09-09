public class Animal{
	double weight;
	String name;
	public void voice(){
		System.out.println("动物在叫");
	}
}

class Bird extends Animal{
	String color;
	public void fly(){
		System.out.println("飞");
	}

	public void voice(){
		System.out.println("布谷布谷布谷");
	}
}

class Dog extends Animal{
	String type;
	double weight=9;
	public void lookdoor(){
		System.out.println("看门");
	}

	public void voice(){
		System.out.println("汪汪汪汪");
	}
}
class Person{
	public void yang(Animal an){
		an.voice();
	}	
}
//多态
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
		
		//Animal an = new Dog();//此时这个an只能够使用父类具有的属性和方法 而不能够使用子类特有的属性和方法
		//an.voice();
			
		//Dog d = (Dog)new Bird();//编译不通过
		

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