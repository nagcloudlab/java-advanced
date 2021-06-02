package com.example.door;

public class DoorEvent {

	private int doorNumber;
	private int floor;
	private DoorStatus status;

	public DoorStatus getStatus() {
		return status;
	}

	public void setStatus(DoorStatus status) {
		this.status = status;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

}
