package com.tw.universe;

import java.util.Map;

import com.tw.cell.Cell;

public class Universe {
	
	Address aliveBoundary;
	Map<Address, Cell> map;
	public Universe(Map<Address, Cell> map, Address aliveBoundary) {
		
	}
	public int getLiveNeighbours(Address address) {
		return getHorizontalNeighbours(address) + getVerticalNeighbours(address)+ getLeftDiagonalNeighbours(address)+getRightDiagonalNeighbours(address);
	}
	private int getHorizontalNeighbours(Address address) {
		int aliveCount = 0;
		if(map.get(new Address(address.getRowNo()-1, address.getColNo())).isAlive()) {
			aliveCount++;
		}
		if(map.get(new Address(address.getRowNo()+1, address.getColNo())).isAlive()) {
			aliveCount++;
		}
		return aliveCount;
	}
	private int getVerticalNeighbours(Address address) {
		int aliveCount = 0;
		if(map.get(new Address(address.getRowNo(), address.getColNo()-1)).isAlive()) {
			aliveCount++;
		}
		if(map.get(new Address(address.getRowNo()+1, address.getColNo()+1)).isAlive()) {
			aliveCount++;
		}
		return aliveCount;
	}
	private int getLeftDiagonalNeighbours(Address address) {
		int aliveCount = 0;
		if(map.get(new Address(address.getRowNo()-1, address.getColNo()-1)).isAlive()) {
			aliveCount++;
		}
		if(map.get(new Address(address.getRowNo()+1, address.getColNo()+1)).isAlive()) {
			aliveCount++;
		}
		return aliveCount;
	}
	private int getRightDiagonalNeighbours(Address address) {
		int aliveCount = 0;
		if(map.get(new Address(address.getRowNo()-1, address.getColNo()+1)).isAlive()) {
			aliveCount++;
		}
		if(map.get(new Address(address.getRowNo()+1, address.getColNo()-1)).isAlive()) {
			aliveCount++;
		}
		return aliveCount;
	}

}
