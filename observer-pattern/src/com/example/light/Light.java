package com.example.light;

import com.example.door.DoorEvent;
import com.example.door.DoorListener;
import com.example.door.DoorStatus;

public class Light implements DoorListener {

	@Override
	public void toggle(DoorEvent event) {
		DoorStatus doorStatus = event.getStatus();
		if (doorStatus.equals(DoorStatus.OPEN)) {
			System.out.println("Light on");
		}
		if (doorStatus.equals(DoorStatus.CLOSE)) {
			System.out.println("Light off");
		}
	}

}
