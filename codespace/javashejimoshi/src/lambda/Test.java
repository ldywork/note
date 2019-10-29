package lambda;

public class Test {
	public static void main(String[] args) {
		doMethod( ()->{
			System.out.println("adfasdfa");
		});
	}
	public static void doMethod(ChuZi c) {
		c.methodA();
	}
}
