package helloWorld;

public class HelloWorldDecoupledInterface {
	public static void main (String[] args){
		MessageRenderer mr = new StandardOutMessageRendererDI();
		MessageProvider mp = new HelloWorldMessageProviderDI();
		mr.setMessageProvider(mp);
		mr.render();
	}
}
