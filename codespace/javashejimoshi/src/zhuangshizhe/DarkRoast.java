package zhuangshizhe;
//具体的某类饮料
public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "DarkRoast coffe";
	}
	@Override
	public double cost() {
		return 0.7;
	}

}
