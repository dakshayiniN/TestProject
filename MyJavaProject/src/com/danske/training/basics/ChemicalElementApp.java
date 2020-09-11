package com.danske.training.basics;

public class ChemicalElementApp {

	public static void main(String[] args) {
		
		
		ChemicalElement o = new ChemicalElement(8,"O","Oxygen");
		
		System.out.println("Is oxygen a transition metal? "+o.isTransitionMetal());
		
		
		ChemicalElement ga = new ChemicalElement(31,"Ga","Gallium");
		
		System.out.println("Is gallium a transition metal? "+ga.isTransitionMetal());
		
		System.out.println(o.equals(ga));
		ChemicalElement anotherO = new ChemicalElement(8,"o","oxygenium");
//		anotherO.atomicNumber = -8;
		
		System.out.println(o.equals(anotherO));
		System.out.println(o == anotherO);
		
		ChemicalElement pot = new ChemicalElement(19, "K", "Potassium");
		System.out.println("Is Potassium alkali? "+pot.isAlkaliMetal());
		System.out.println("the atomic number of k is "+pot.getAtomicNumber());
		System.out.println(pot);
	}

}
