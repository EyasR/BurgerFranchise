// this is a sublcass of the Burger211 superclass.
// it modifies the original information of the superlcass to 
//generate a menu for any franchise branch in the CANADA
// using the local currency and unique burger toppings
// correlated with the region
public class CANADA extends Burger211 {
	
	private static double exchangeRate = 1.27;
	private static double[] PriceCanada = new double[3];
	private static String[] ToppingCanada = new String[3];
	private static int[] CalCanada = new int[3];
	private String ad = "";
	private String Info[] = new String[3];

	// this method overrides the privateMenu method from the superclass Bruger211
	@Override
	public void printMenu(String franchise) {
		
	
		
		for (int i  = 0 ; i < 3 ; i++) {
			Info[i] = Name[i] + " / " + "CAD " + PriceCanada[i] + " / " + CalCanada[i] + " Kcal" ;
		}

		MenuGUI(franchise, Info[0], ToppingCanada[0],Info[1],ToppingCanada[1],Info[2],ToppingCanada[2],ad);
	}
	
	// this method overrides the price method from the superclass Bruger211
	@Override
	public void price(){
		for (int i = 0 ; i < 3 ; i++) {
			PriceCanada[i] = Math.round(Price[i] * exchangeRate);
		}
		
	}
	
	// this method overrides the topping method from the superclass Bruger211
	@Override
	public void topping(){
		ToppingCanada[BurgerOne] = "Beef Patty / Lettus / Tomatoe / Canadian Bacon"; 
		ToppingCanada[BurgerTwo] = "Beef Patty / Lettus / Tomatoe / Fried Egg/ Avacado / Canadian Bacon"; 
		ToppingCanada[BurgerThree] = "Beef Patty / Lettus / Tomatoe / Pickles / Blue Cheese/ Bacon infused Aoili"; 
	}
	
	// this method overrides the cal method from the superclass Bruger211
	@Override 
	public void cal() {
		 CalCanada[BurgerOne] = 1200;
		 CalCanada[BurgerTwo] = 1350;
		 CalCanada[BurgerThree] = 1670;
	}
}
