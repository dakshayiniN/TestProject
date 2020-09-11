package com.danske.training.basics;

public class ChemicalElement {
	
	private int atomicNumber;
	private String symbol;
	private String name;
	
	
	private static boolean[] alkaliMetals = new boolean[120];
	
	static {
		alkaliMetals[3] = true;
		alkaliMetals[11] = true;
		alkaliMetals[19] = true;
		alkaliMetals[37] = true;
		alkaliMetals[55] = true;
		alkaliMetals[87] = true;
	}
	
	public ChemicalElement(int atomicNumber,String symbol,String name) {
		this.atomicNumber = atomicNumber;
		this.symbol = symbol;
		this.name = name;
		
		
	}
	
	
	public boolean isAlkaliMetal()
	{
		return alkaliMetals[atomicNumber];
	}
	
	public boolean isTransitionMetal() {
		return (atomicNumber >= 21 && atomicNumber <= 31)
				|| (atomicNumber >= 39 && atomicNumber <= 48)
				|| (atomicNumber >= 72 && atomicNumber <= 80)
				|| (atomicNumber >= 104 && atomicNumber <= 112);
	}
	
	public boolean isMetal() {
		return false;
	}
	
	public boolean equals(Object o) {
		ChemicalElement other = (ChemicalElement) o;
		/*
		 * if(other.atomicNumber == this.atomicNumber) { return true; }else { return
		 * false; }
		 */
		
		return this.atomicNumber == other.atomicNumber;
	}
	
	@Override
	public int hashCode() {
		return atomicNumber;
	}


	public int getAtomicNumber() {
		return atomicNumber;
	}


	public String getSymbol() {
		return symbol;
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", symbol=" + symbol + ", name=" + name + "]";
	}
	
	

}
