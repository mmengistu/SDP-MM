package helloWorldWithCommandLineArguments;

public class HelloWithCommandLineArguments {
	public static void main (String [] args){
		if (args.length > 1){
			System.out.println(args[0] + " " + args[1]);
		}else if (args.length > 0){
			System.out.println(args[0]);
		}else{
			System.out.println("Hello World! Sayanson is coming!");
		}
	}
}
