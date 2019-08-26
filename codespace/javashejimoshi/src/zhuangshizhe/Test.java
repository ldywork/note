package zhuangshizhe;

public class Test {
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		espresso = new Mocha(espresso);
		espresso = new Mocha(espresso);
		espresso = new Soy(espresso);
		System.out.println(espresso.getDdescription());
		System.out.println(espresso.cost());
	}
}
