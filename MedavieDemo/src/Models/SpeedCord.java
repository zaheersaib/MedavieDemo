/* Zaheer - Class for a cord that controls speed*/

package Models;

import Interfaces.ICord;

public class SpeedCord extends Cord implements ICord {
	
	private int speed;	
	public static final int OFF=0,SLOW=1,MEDIUM=2,FAST=3;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public SpeedCord() {speed=OFF;}
	
	@Override
	public int Pull() {
		
		this.speed++;
		if (this.speed>3) {
			this.speed = OFF;
		}
		
		return this.speed;
	}

}
