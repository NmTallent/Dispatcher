package a3;

public class RideRequestImpl implements RideRequest {
	
	private Position clientPosition;
	private Position destination;
	private boolean isComplete = false;
	private CompletedRideImpl completedRide;

	public RideRequestImpl(Position clientPosition, Position destination) {
		
		if(clientPosition == null)
		{
			throw new RuntimeException("null is not a valid input for clientPosition");
		}
		
		if(destination == null)
		{
			throw new RuntimeException("null is not a valid input for destination");
		}
		
		this.clientPosition = clientPosition;
		this.destination = destination;
	}

	@Override
	public Position getClientPosition() {
		return clientPosition;
	}

	@Override
	public Position getDestination() {
		return destination;
	}

	@Override
	public boolean getIsComplete() {
		return isComplete;
	}

	@Override
	public CompletedRide complete(Driver driver) {
		
		if(driver == null)
		{
			throw new RuntimeException("null is not a valid input for driver");
		}
		
		if(!isComplete)
		{
			isComplete = true;
			completedRide = new CompletedRideImpl(this,driver);
			driver.getVehicle().moveToPosition(clientPosition);
			driver.getVehicle().moveToPosition(destination);
		}
		return completedRide;
		
	}

	@Override
	public int getRideTime() {
		return destination.getManhattanDistanceTo(clientPosition);
	}
	
	

}
