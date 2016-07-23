package com.uib.matrices;


public class Matrix<T> {
	private T[][] entries;

	public Matrix(int m, int n) {
		entries = (T[][]) new Object[m][n];
	}
		
	public int getM() {
		return entries.length;
	}
	
	public int getN() {
		return entries[0].length;
	}
	
	public void set(T[][] entries) { 
		this.entries = entries; 
	}
	
	public void setEntry(T val, int i, int j) {
		entries[i][j] = val;
	}

	public T getEntry(int i, int j) {
		return entries[i][j];
	}
	
    public T[][] get() { 
    	return entries; 
	}
	
	
}