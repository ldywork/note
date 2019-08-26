package zhuangshizhe;
//具体的某类饮料
public class Espresso extends Beverage {
	public Espresso() {
		description = "Espresso";
	}
	@Override
	public double cost() {
		return 0.9;
	}

}
