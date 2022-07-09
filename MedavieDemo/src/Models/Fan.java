/* Zaheer - Class for a Fan with 2 cords.*/

package Models;

public class Fan {
	
	private SpeedCord speedCord;
	private DirectionCord directionCord;
	
	public Fan() {
		 speedCord = new SpeedCord();
		 directionCord = new DirectionCord();
	}
	
	public SpeedCord getSpeedCord() {
		return speedCord;
	}

	public void setSpeedCord(SpeedCord speedCord) {
		this.speedCord = speedCord;
	}

	public DirectionCord getDirectionCord() {
		return directionCord;
	}

	public void setDirectionCord(DirectionCord directionCord) {
		this.directionCord = directionCord;
	}
}
