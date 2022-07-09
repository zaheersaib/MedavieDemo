/* Zaheer - This was used just to test.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import Currency.Currency;
import Managers.FanManager;
import Models.Fan;

public class MedavieDemo {

	public static void main(String[] args) {
		
		Fan fan = new Fan();		
		FanManager fanManager = new FanManager(fan);
		String newLine = System.getProperty("line.separator"),input="";
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        System.out.println("A fan has been created for you."+newLine+"Enter 'S' to pull cord or 'D' to change direction. 'X' to exit. It is NOT case sensitive.");        
        
        try {
			do {
		
				input = br.readLine();
				
				switch(input.toUpperCase()) {
				  case "S":
					  fanManager.Pull(fan.getSpeedCord());					 
					  fanManager.PrintFanSettings();
					  break;
				  case "D":
					  fanManager.Pull(fan.getDirectionCord());
					  fanManager.PrintFanSettings();
					  break;
				  default:
				    System.out.println("Invalid Option");
				}
				
			} while(br.ready() || !input.equalsIgnoreCase("x"));
			
		} catch (IOException e) {
			System.out.println("ERROR: "+ e.getMessage());
		}
				
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
