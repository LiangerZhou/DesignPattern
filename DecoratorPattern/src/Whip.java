
public class Whip extends CondimentDecorator{
	
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		description = "Whip";
	}

	@Override
	public double cost() {
		return .99 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

}
