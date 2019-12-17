package a3;

public class VehicleImpl implements Vehicle{
	
	private String make;
	private String model;
	private String plate;
	private Position position;
	private int mileage = 0;
	
	public VehicleImpl(String make, String model, String plate, Position position) 
	{
		
		if(make == null)
		{
			throw new RuntimeException("null is not a valid input for make");
		}
		
		if(model == null)
		{
			throw new RuntimeException("null is not a valid input for model");
		}
		
		if(plate == null)
		{
			throw new RuntimeException("null is not a valid input for plate");
		}
		
		if(position == null)
		{
			throw new RuntimeException("null is not a valid input for position");
		}
		
		this.make = make;
		this.model = model;
		this.plate = plate;
		this.position = position;
	}
	
	@Override
	public String getMake() {
		return make;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public String getPlate() {
		return plate;
	}

	@Override
	public int getMileage() {
		return mileage;
	}

	@Override
	public Position getPosition() {
		return position;
	}

	@Override
	public void moveToPosition(Position p) {
		
		if(p == null)
		{
			throw new RuntimeException("null is not a valid input for position p");
		}
		
		mileage += position.getManhattanDistanceTo(p);
		position = p;
		
	}
	
	
}
