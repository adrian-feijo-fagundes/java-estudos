/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ADRIANFEIJOFAGUNDES
 */
class Mage {
	private String elementalAtributte;
	
	public Mage(String element) {
		elementalAtributte = element;
	}
	public String getElementalAtributte() {
		return this.elementalAtributte;
	} 
	public void castSpell() {
		System.out.println("I CAST A MAGIC OF " + elementalAtributte + "ELEMENT!!!" );
	} 
}
