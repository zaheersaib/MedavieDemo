/* Zaheer - Manager class for a fan. */

package Managers;

import Models.Cord;
import Models.DirectionCord;
import Models.Fan;
import Models.SpeedCord;

public class FanManager {
	
	public Fan fan;
	
	public FanManager() {
		fan = new Fan();
	}
	
	public FanManager(Fan fan) {
		this.fan  = fan;		
	}

	public Fan getFan() {
		return fan;
	}

	public void setFan(Fan fan) {
		this.fan = fan;
	}
	
	public void Pull(Cord cord) {
		
		try {
			if (cord instanceof SpeedCord) {
				fan.getSpeedCord().Pull();
			} else if (cord instanceof DirectionCord) {
				fan.getDirectionCord().Pull();
			}
		} catch (Exception ex) {
			System.out.println("Error: "+ex.getMessage() );
		}
			
	}
}
