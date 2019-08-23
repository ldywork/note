package zhuangshizhe;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDdescription() {
		return beverage.getDdescription() + " , Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.2;
	}

}
