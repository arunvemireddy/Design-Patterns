package ProtoTypeDesignPattern;

public class Main {

	public static void main(String[] args) {
		Prototype prototypeA = new ConcretePrototypeA();
		Prototype prototypeB = new ConcretePrototypeB();
		
		Prototype copyA = prototypeA.clon();
		Prototype copyB = prototypeB.clon();
		
		System.out.println(copyA);
		System.out.println(copyB);
	}
}
