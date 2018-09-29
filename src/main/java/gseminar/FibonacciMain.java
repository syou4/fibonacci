package gseminar;

public class FibonacciMain{

	private FibonacciSrties series = new FibonacciSrties();

	public void run(String[] args){
		if(args.length == 0){
			throw new RequiredValueMissingException("no arguments were given");
		}
		perform(args);
	}

	private void perform(String[] args){
		for (int i = 0; i < args.length; i++) {
			int value = Integer.valueOf(args[i]);
		}
	}

	public static void main(String[] args) {
		FibonacciMain main = new FibonacciMain();
		main.run(args);
	}
}