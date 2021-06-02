package com.example.fan;

import com.example.door.DoorEvent;
import com.example.door.DoorListener;
import com.example.door.DoorStatus;

public class Fan implements DoorListener{

	@Override
	public void toggle(DoorEvent event) {
		DoorStatus doorStatus=event.getStatus();
		if(doorStatus.equals(DoorStatus.OPEN)) {
			System.out.println("FAN on");
		}
		if(doorStatus.equals(DoorStatus.CLOSE)) {
			System.out.println("FAN off");
		}
	}
	
}
