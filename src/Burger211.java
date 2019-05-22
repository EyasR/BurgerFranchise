import taesik.MenuGUI;
public abstract class Burger211 extends MenuGUI {
 static double[] Price = new double[3];
 static String[] Name = new String[3];
 static String[] Topping = new String[3];
 static int[] Cal = new int[3];
 
 static int BurgerOne = 0;
 static int BurgerTwo = 1;
 static int BurgerThree = 2;
 
 Burger211() {
	 burgerName();
	 topping();
	 cal();
	 price();
 }
 // Names of burgers
 public void burgerName(){
	Name[BurgerOne] = "Inheritance Burger";
	Name[BurgerTwo] = "Overriding Burger";
	Name[BurgerThree] = "Constructor Bruger";
 }
 // Toppings of burgers
 public void topping(){
	Topping[BurgerOne] = "Beef Patty / Lettus / Tomatoe / Onion"; 
	Topping[BurgerTwo] = "Beef Patty / Lettus / Tomatoe / Onion / Fried Egg/ Avacado"; 
	Topping[BurgerThree] = "Beef Patty / Lettus / Tomatoe / Onion / Pickles / Blue Cheese/ Rasberry Aoili"; 
 }
 // Calories of burgers
 public void cal(){
	 Cal[BurgerOne] = 1050;
	 Cal[BurgerTwo] = 1250;
	 Cal[BurgerThree] = 1500;
 }
 // price of burgers
 public void price(){
	 Price[BurgerOne] = 300.00;
	 Price[BurgerTwo] = 400.00;
	 Price[BurgerThree] = 5000.00;
 }
 //method calls menuGUI to create a menu.
 public void printMenu(String string) {}
 
}
