package SingletonDesignPattern;

public class Singleton {
	
	private static Singleton singleton = null;
	
	public Singleton() {
		System.out.println("Object Created");
	}
	
	public static Singleton createObject() {
		if(singleton==null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			Singleton.createObject();
		}
	}

}
