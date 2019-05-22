// this is a sublcass of the Burger211 superclass.
// it uses the original information of the superlcass to 
//generate a menu for any franchise branch in the USA
public class USA extends Burger211 {
	
private String ad;
private String Info[] = new String[3];

// this method overrides the privateMenu method from the superclass Bruger211
@Override
public void printMenu(String franchise) {
	
	ad = "0% Off, deal of the century!!!";
	for (int i  = 0 ; i < 3 ; i++) {
		Info[i] = Name[i] + " / " + "USD " + Price[i] + " / " + Cal[i] + " Kcal" ;
	}

	MenuGUI(franchise, Info[0], Topping[0], Info[1], Topping[1], Info[2], Topping[2], ad);
}

}
