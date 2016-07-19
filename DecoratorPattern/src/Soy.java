
public class Soy extends CondimentDecorator {
	
	Beverage beverage;
	
	public  Soy(Beverage beverage) {
		description = "Soy";
	}
	@Override 
	public double cost() {
		return .45 + beverage.cost();
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

}
