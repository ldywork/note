package zhuangshizhe;

public class SteamedMilk extends CondimentDecorator {
	Beverage beverage;
	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDdescription() {
		return beverage.getDdescription() + " , SteamedMilk";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.4;
	}

}
