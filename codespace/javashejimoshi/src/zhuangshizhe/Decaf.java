package zhuangshizhe;
//具体的某类饮料
public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf coffe";
	}
	@Override
	public double cost() {
		return 0.6;
	}

}
