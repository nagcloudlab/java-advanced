package com.example;

import java.util.concurrent.TimeUnit;

import com.example.door.Door;
import com.example.fan.Fan;
import com.example.light.Light;

public class App {

	public static void main(String[] args) throws Exception {

		Door door = new Door(1, 2);

		Light light = new Light();
		Fan fan = new Fan();

//		door.addDoorListener(light);
//		door.addDoorListener(fan);

		TimeUnit.SECONDS.sleep(3);
		door.open();
		TimeUnit.SECONDS.sleep(3);
		door.close();
		
//		door.removeDoorListener(fan);
//		
//		TimeUnit.SECONDS.sleep(3);
//		door.open();
//		TimeUnit.SECONDS.sleep(3);
//		door.close();

	}

}
