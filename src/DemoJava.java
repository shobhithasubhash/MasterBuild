import java.util.ArrayList;
import java.util.List;

public class DemoJava {
	
	static String strwelMsg = "";
	static String name = "winsun";
	static int valueage = 10;
	//constructor overloading 
	public DemoJava(String strMessage, String name) {
		this.strwelMsg = strMessage;
		this.name = name;
	}
	
	public DemoJava(String strMessage) {
		this.strwelMsg = strMessage;
		
	}
	
	public DemoJava(String name, int valueage) {
		this.name = name;
		this.valueage = valueage;
		
	}

	public static void main(String[] args) {
		System.out.println("welcome to java programmin language");
		
		DemoJava demoObj = new DemoJava("hello world", 10);
 
		
		System.out.println("demoObj ----->"+demoObj.strwelMsg+" :" +demoObj.name);
		
		DemoJava demoObj1 = new DemoJava("welcome to winsun");
		
		System.out.println("demoObj1 ----->"+demoObj1.strwelMsg+" :" +demoObj1.name);
		
		System.out.println("static ----->"+strwelMsg+" :" +name);
		System.out.println("Value of: "+valueage);	
		
	}
	
	

}
