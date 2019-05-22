/* 
 * CS211 Assignment 02 (Part Two: Burger211)
 * Eyas Rashid - rashid_e@hotmail.com
 * Student ID: 985 762 980
 * 2018.04.07 - Spring Quarter
 *
 *This program generates menu's for the burger211 franchise
 *the menus differ depending on what country the menu is being
 *generated for.
 */
public class myBurger211 {

	public static void main(String[] args) {
		
		//Constructor for Bellevue - USA 
		Burger211 Bellevue = new USA();
		Bellevue.printMenu("Bellevue, USA");
		
		//Constructor for Bollywood - India 
		Burger211 Bollywood = new INDIA();
		Bollywood.printMenu("Bollywood, India");
		
		//Constructor for Seattle - USA 
		Burger211 Seattle = new USA();
		Seattle.printMenu("Seattle, USA");
		
		//Constructor for Ontario - Canada 
		Burger211 Ontario = new CANADA();
		Ontario.printMenu("Ontario, Canada");

	}

}
