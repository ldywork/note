package zhuangshizhe;
//具体的某类饮料
public class HousBlend extends Beverage {
	public HousBlend() {
		description = "HousBlend coffe";
	}
	@Override
	public double cost() {
		return 0.8;
	}

}
