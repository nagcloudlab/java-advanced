package com.example.door;

import java.util.ArrayList;

import com.example.fan.Fan;
import com.example.light.Light;

public class Door {

	private int floor;
	private int doorNumber;
	private DoorStatus status;
//
//	private ArrayList<DoorListener> doorListeners = new ArrayList<DoorListener>();

	public Door(int floor, int doorNumber) {
		super();
		this.floor = floor;
		this.doorNumber = doorNumber;
	}

//	public void addDoorListener(DoorListener doorListener) {
//		this.doorListeners.add(doorListener);
//	}
//
//	public void removeDoorListener(DoorListener doorListener) {
//		this.doorListeners.remove(doorListener);
//	}

	public void open() {
		
		this.status = DoorStatus.OPEN;

		DoorEvent doorEvent = new DoorEvent();
		doorEvent.setDoorNumber(this.doorNumber);
		doorEvent.setFloor(this.floor);
		doorEvent.setStatus(this.status);
//
//		for (DoorListener doorListener : doorListeners) {
//			doorListener.toggle(doorEvent); // sync
//		}
		
		// stream.emit(event);
		
		System.out.println("door opened...");

	}

	public void close() {

		System.out.println("door closed...");
		this.status = DoorStatus.CLOSE;

		DoorEvent doorEvent = new DoorEvent();
		doorEvent.setDoorNumber(this.doorNumber);
		doorEvent.setFloor(this.floor);
		doorEvent.setStatus(this.status);

//		for (DoorListener doorListener : doorListeners) {
//			doorListener.toggle(doorEvent);
//		}
		
		// stream.emit(event);
		
	}

}
