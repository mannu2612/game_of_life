package com.tw.universe;

import java.util.HashMap;
import java.util.Map;

import com.tw.cell.Cell;

public class UniverseCreator {
	
	Map<Address, Cell> universe = new HashMap<>();
	
	private void addCell(Address address , Cell cell) {
		universe.put(address, cell);
	}
	
	public Universe createUniverse(char[][] grid) {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				Address newAddress = new Address(i,j);
				Cell cell;
				if(grid[i][j] == 'X') {
					cell = new Cell(true);
				}else {
					cell = new Cell(false);
				}
				addCell(newAddress,cell);
			}
		}
		return null;
	}
}
