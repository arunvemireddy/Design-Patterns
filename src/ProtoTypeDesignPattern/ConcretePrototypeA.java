package ProtoTypeDesignPattern;

public class ConcretePrototypeA implements Prototype{

	@Override
	public Prototype clon() {
		// TODO Auto-generated method stub
		return new ConcretePrototypeA();
	}

	@Override
	public String toString() {
		return "ConcretePrototypeA";
	}

}
