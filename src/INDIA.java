// this is a sublcass of the Burger211 superclass.
// it modifies the original information of the superlcass to 
//generate a menu for any franchise branch in the INDIA
// using the local currency and unique burger toppings
// correlated with the region
public class INDIA extends Burger211 {
	
	private static double exchangeRate = 65.87;
	private static double discountRate = 0.75;
	private static double[] PriceIndia = new double[3];
	private static String[] ToppingIndia = new String[3];
	private static int[] CalIndia = new int[3];
	private static double[] discountPrice = new double[3];
	private String ad;
	private String Info[] = new String[3];

	// this method overrides the privateMenu method from the superclass Bruger211
	@Override
	public void printMenu(String franchise) {
	//	price();
		ad = "National Burger Day (>^_^)> 25% Off!! <(^_^<)";
		for (int i  = 0 ; i < 3 ; i++) {
			Info[i] = Name[i] + " / " + "INR " + discountPrice[i] + " (Was:"+ PriceIndia[i] + ") / " + CalIndia[i] + " Kcal" ;
		}

		MenuGUI(franchise,Info[0],ToppingIndia[0],Info[1],ToppingIndia[1],Info[2],ToppingIndia[2],ad);
	}
	
	// this method overrides the price method from the superclass Bruger211
	@Override
	public void price() {
		for (int i = 0 ; i < 3 ; i++) {
			PriceIndia[i] = Math.round(Price[i] * exchangeRate);
			discountPrice[i] = Math.round(PriceIndia[i] * discountRate);
		}	
	}
	
	// this method overrides the topping method from the superclass Bruger211
	@Override
	public void topping(){
		ToppingIndia[BurgerOne] = "Veggy Patty / Lettus / Tomatoe / Onion"; 
		ToppingIndia[BurgerTwo] = "Veggy Patty / Lettus / Tomatoe / Onion / Avacado"; 
		ToppingIndia[BurgerThree] = "Veggy Patty / Lettus / Tomatoe / Pickles / Rasberry Aoili"; 
	}
	
	// this method overrides the call method from the superclass Bruger211
	@Override 
	public void cal() {
		 CalIndia[BurgerOne] = 700;
		 CalIndia[BurgerTwo] = 800;
		 CalIndia[BurgerThree] = 1124;
	}
}