
public class ConstructorOverloading {

	String strwelMsg;
	String name;
	int valueage;

	public ConstructorOverloading() {
		// TODO Auto-generated constructor stub
	}
	//constructor overloading with  no argument, one argument, two argument 
	//constructor overloading with  with defferent argument type and different argument position
	public ConstructorOverloading(String strMessage, String name) {
		this.strwelMsg = strMessage;
		this.name = name;
	}

	public ConstructorOverloading(String strMessage) {
		this.strwelMsg = strMessage;

	}

	public ConstructorOverloading(String name, int valueage) {
		this.name = name;
		this.valueage = valueage;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoJava demoObj = new DemoJava("hello world", 10);

		System.out.println("demoObj ----->" + demoObj.strwelMsg + " :" + demoObj.name);

		DemoJava demoObj1 = new DemoJava("welcome to winsun");

		System.out.println("demoObj1 ----->" + demoObj1.strwelMsg + " :" + demoObj1.name);

	}

}
