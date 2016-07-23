package com.uib.matrices;

public class Matrix<T> {
	private T[][] entries;

	public void set(T[][] entries) { 
		this.entries = entries; 
	}
	
    public T[][] get() { 
    	return entries; 
	}
	
	
}