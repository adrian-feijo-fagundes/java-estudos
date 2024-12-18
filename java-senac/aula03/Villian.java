/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ADRIANFEIJOFAGUNDES
 */
public class Villian extends Mage {
	private String worshipedDemon;
	
	public Villian(String element, String demon) {
		super(element);
		this.worshipedDemon = demon;
	}
	
	@Override
	public void castSpell() {
		System.out.println("The Villian replied:");
		System.out.println("Succumb before the devil " + this.worshipedDemon + " fall before me");
		System.out.println("I CAST A MAGIC OF " + this.getElementalAtributte() + " ELEMENT!!! " );
	}
}
