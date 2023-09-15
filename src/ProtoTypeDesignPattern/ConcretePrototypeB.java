package ProtoTypeDesignPattern;

public class ConcretePrototypeB implements Prototype{

	@Override
	public Prototype clon() {
		// TODO Auto-generated method stub
		return new ConcretePrototypeB();
	}
	
	@Override
	public String toString() {
		return "ConcretePrototypeB";
	}

}
