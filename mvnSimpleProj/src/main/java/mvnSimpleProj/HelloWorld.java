package mvnSimpleProj;

public class HelloWorld {
	public static void main(String args[]) {
		System.out.println(getGreetingMessage("John"));
	}
	
	public static String getGreetingMessage(String name) {
		return "Hello "+ name + "! Welcome to Java Programming";
	}
}