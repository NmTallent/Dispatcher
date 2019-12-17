package a3;

public class CompletedRideImpl implements CompletedRide {
	
	private RideRequest request;
	private Driver driver;
	private int waitTime;
	private int rideTime;
	private int totalTime;
	private double cost;
	private double price;
	private double profit;
	
	public CompletedRideImpl(RideRequest request, Driver driver) 
	{
		if(request == null)
		{
			throw new RuntimeException("null is not a valid input for request");
		}
		
		if(driver == null)
		{
			throw new RuntimeException("null is not a valid input for driver");
		}
		
		this.request = request;
		this.driver = driver;
		waitTime = driver.getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition());
		rideTime = (request.getClientPosition().getManhattanDistanceTo(request.getDestination()));
		totalTime = waitTime + rideTime;
		cost = (.5*rideTime)+(.1*waitTime);
		if(waitTime<25)
		{
			price = (2.5*rideTime);
		}
		if(waitTime>=25 && waitTime<=49)
		{
			price = (2*rideTime);
		}
		if(waitTime>=50 && waitTime<=99) 
		{
			price = rideTime;
		}
		if(waitTime>=100)
		{
			price = (.5*rideTime);
		}
		profit = price-cost;
	}

	@Override
	public RideRequest getRequest() {
		return request;
	}

	@Override
	public Driver getDriver() {
		return driver;
	}

	@Override
	public int getWaitTime() {
		// TODO Auto-generated method stub
		return waitTime;
	}

	@Override
	public int getTotalTime() {
		// TODO Auto-generated method stub
		return totalTime;
	}

	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public double getProfit() {
		return profit;
	}
	
	

}
