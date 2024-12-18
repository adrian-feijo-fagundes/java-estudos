/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ADRIANFEIJOFAGUNDES
 */
public class Hero extends Mage{
	private String worshipedGod;
	
	public Hero(String element, String god) {
		super(element);
		this.worshipedGod = god;
	}
	
	@Override
	public void castSpell() {
		System.out.println("The Hero said:");
		System.out.println("By the sacred justice of the god " + this.worshipedGod );
		System.out.println("I CAST A MAGIC OF " + this.getElementalAtributte() + " ELEMENT!!! " );
	}
}
