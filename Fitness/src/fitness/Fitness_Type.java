package fitness;

public enum Fitness_Type {
	Spin(3000), Yoga(3000), Zumba(3000), Aquacise(3000),
	;
	
	private final double Cost;
	Fitness_Type(double Cost) {
	    this.Cost = Cost;
	  }

	  public double getCost() {
	    return Cost;
	  }

}
