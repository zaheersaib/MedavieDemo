/* Zaheer - This was used just to test.*/

import Managers.FanManager;
import Models.Fan;

public class MedavieDemo {

	public static void main(String[] args) {
		
		Fan fan = new Fan();		
		FanManager fanManager = new FanManager(fan);
		
		System.out.println("Initial Speed " + fanManager.getFan().getSpeedCord().getSpeed());		
		//fanManager.getFan().getSpeedCord().Pull();
		fanManager.Pull(fan.getSpeedCord());
		
		//fan.directionCord.Pull();
		System.out.println("Initial Direction " + fanManager.getFan().getDirectionCord().getDirection());
		
		//fanManager.getFan().getSpeedCord().Pull();	
		System.out.println("Speed " + fanManager.getFan().getSpeedCord().getSpeed());
		
		fanManager.Pull(fan.getDirectionCord());
		System.out.println("Direction " + fanManager.getFan().getDirectionCord().getDirection());
		
		fanManager.Pull(fan.getSpeedCord());
		System.out.println("Speed " + fanManager.getFan().getSpeedCord().getSpeed());
		
		fanManager.Pull(fan.getSpeedCord());
		System.out.println("Speed " + fanManager.getFan().getSpeedCord().getSpeed());
		
		fanManager.Pull(fan.getDirectionCord());
		System.out.println("Direction " + fanManager.getFan().getDirectionCord().getDirection());
		
		fanManager.Pull(fan.getSpeedCord());		
		System.out.println("Speed " + fanManager.getFan().getSpeedCord().getSpeed());
		
		fanManager.Pull(fan.getSpeedCord());
		System.out.println("Speed " + fanManager.getFan().getSpeedCord().getSpeed());
		
		fanManager.Pull(fan.getDirectionCord());
		System.out.println("Direction " + fanManager.getFan().getDirectionCord().getDirection());
	}

}
