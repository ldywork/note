package zhuangshizhe;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDdescription() {
		return beverage.getDdescription() + " , Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.3;
	}

}
