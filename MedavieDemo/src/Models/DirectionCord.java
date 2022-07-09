/* Zaheer - Class for a direction cord. */

package Models;

import Interfaces.ICord;

public class DirectionCord extends Cord implements ICord {

	public static final int FORWARD=0,REVERSE=1;
	public int direction;
	
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public DirectionCord() {direction=FORWARD;}
	
	@Override
	public int Pull() {
		
		if(this.direction == FORWARD){
			this.direction = REVERSE;
		} else {
			this.direction = FORWARD;
		}
		return this.direction;
	}
}
