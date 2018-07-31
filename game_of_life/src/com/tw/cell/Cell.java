package com.tw.cell;


public class Cell {
	
	private boolean alive;
	public Cell(boolean alive) {
		this.alive = alive;
	}
	
	
	public boolean isAlive() {
		return this.alive;
	}
	
	public void kill() {
		this.alive = false;;
	}
	
	public void awake() {
		this.alive = true;;
	}

}
