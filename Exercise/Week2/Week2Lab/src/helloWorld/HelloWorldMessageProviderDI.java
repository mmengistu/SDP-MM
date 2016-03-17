package helloWorld;

public class HelloWorldMessageProviderDI implements MessageProvider {
	public String getMessage(){
		return "Hello World! Decoupled Interface";
	}

}
