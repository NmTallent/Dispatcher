package a3;

public class PositionImpl  implements Position {

	private int x;
	private int y;
		
	public PositionImpl(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getManhattanDistanceTo(Position p) {
		return (Math.abs(x-p.getX()))+Math.abs(y-p.getY());
	}
	
	

	
}
