package com.uib.lingebra;


public class Matrix<T> {
	private T[][]entries;

	/**
	 * Constructor 
	 * @param m - row count
	 * @param n - column count
	 */
	public Matrix(int m, int n) {
		entries = (T[][]) new Object[m][n];
	}
		
	/**
	 * 
	 * @return Number of rows
	 */
	
	public int getM() {
		return entries.length;
	}
	
	/**
	 * 
	 * @return number of columns
	 */
	public int getN() {
		return entries[0].length;
	}
	
	/**
	 * Specify all values
	 * @param entries 
	 */
	public void set(T[][] entries) { 
		this.entries = entries; 
	}
	
	/**
	 * Set value on certain coordinates
	 * @param val value
	 * @param i -th coordinate
	 * @param j -th coordinate
	 */
	public void setEntry(T val, int i, int j) {
		entries[i][j] = val;
	}

	/**
	 * get entry from a specific coordinate
	 * @param i-th coordinate
	 * @param j-th coordinate
	 * @return
	 */
	public T getEntry(int i, int j) {
		return entries[i][j];
	}
	
	/**
	 * get all entries as a 2D array
	 * @return entries
	 */
    public T[][] get() { 
    	return entries; 
	}

    /**
     * delete all values and insert null instead
     */
    public void reset() {
    	for (int i = 0; i < entries.length; i++) {
    		for (int j = 0; j < entries[i].length; j++) {
    			entries[i][j] = null;
    		}
    	}
    }
	
}