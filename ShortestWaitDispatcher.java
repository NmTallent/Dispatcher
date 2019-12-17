package a3;

public class ShortestWaitDispatcher implements Dispatcher{
	private int indexShortestWait = 0;
	
	public ShortestWaitDispatcher() {}
	
	@Override
	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		for(int i = 0; i<availableDrivers.length;i++)
		{
			if((availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition())
					<(availableDrivers[indexShortestWait].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition()))))
			{
				indexShortestWait = i;
			}
		}
		return availableDrivers[indexShortestWait];
	}

}
