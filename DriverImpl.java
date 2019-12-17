package a3;

public class DriverImpl implements Driver {
	
	private String first;
	private String last;
	private int id;
	private Vehicle vehicle;
	
	public DriverImpl(String first, String last, int id, Vehicle vehicle) {
		if(first == null)
		{
			throw new RuntimeException("null is not a valid a valid input for first");
		}
		
		if(last == null)
		{
			throw new RuntimeException("null is not a valid a valid input for last");
		}
		
		if(vehicle == null)
		{
			throw new RuntimeException("null is not a valid a valid input for vehicle");
		}
		
		this.first = first;
		this.last = last;
		this.id = id;
		this.vehicle = vehicle;
	}

	@Override
	public String getFirstName() {
		return first;
	}

	@Override
	public String getLastName() {
		return last;
	}

	@Override
	public String getFullName() {
		return first + " " + last;
	}

	@Override
	public int getID() {
		return id;
	}

	@Override
	public Vehicle getVehicle() {
		return vehicle;
	}

	@Override
	public void setVehicle(Vehicle v) {
		
		if(v == null)
		{
			throw new RuntimeException("null is not a valid input for vehicle");
		}
		
		vehicle = v;
		
	}
	
	

}
