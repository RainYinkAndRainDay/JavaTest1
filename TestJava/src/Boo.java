
public class Boo {
	public Boo(int i) {}
	public Boo(String i) {}
	public Boo(String s, int i) {}
}

class SonOfBoo extends Boo{
	public SonOfBoo() {
		super("boo");
	}
	public SonOfBoo(int i) {
		super("Fred");
	}
	public SonOfBoo(String s) {
		super(42);
	}
	
	public static void main(String [] args)
	{
		SonOfBoo s1 = new SonOfBoo("56");
		System.out.println(s1);
	}
}

 