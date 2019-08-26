package zhuangshizhe;
//饮料抽象类
public abstract class Beverage {
	String description = "Unknown Beverage";
	public String getDdescription() {
		return description;
	}
	public abstract double cost();
}
