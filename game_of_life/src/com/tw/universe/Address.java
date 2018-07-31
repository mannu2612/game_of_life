package com.tw.universe;

public class Address {

	private int rowNo;
	private int colNo;
	Address(int rowNo, int colNo){
		this.rowNo = rowNo;
		this.colNo = colNo;
	}
	public int getRowNo() {
		return rowNo;
	}
	public void setRowNo(int rowNo) {
		this.rowNo = rowNo;
	}
	public int getColNo() {
		return colNo;
	}
	public void setColNo(int colNo) {
		this.colNo = colNo;
	}
	
	
	
}
