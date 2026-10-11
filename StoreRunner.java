import java.util.Scanner; // for input

public class StoreRunner {
  public static void main(String[] args) {

    //creates scanner
    Scanner input = new Scanner(System.in);

    boolean boughtCandy = false;

System.out.println("Welcome, what would you like?");
System.out.println("1. Chocolate");
System.out.println("2. Gummy");
System.out.println("> ");
int userSelection = input.nextInt();

// if the user wants to buy chocolate
// the code takes in the input from the user and presents questions based on it
if(userSelection == 1){
System.out.println("What's the name?");
System.out.println("> ");
String chocName = input.nextLine();
chocName = input.nextLine();
  
//creates chocoalte
System.out.println("How many?");
System.out.println("> ");
int chocAmount = input.nextInt();

System.out.println("What type?");
System.out.println("> ");
String chocType = input.next();

System.out.println(); // blank line
Chocolate newChocolate = new Chocolate(chocName, chocAmount, chocType);
System.out.println("Here you go:");
System.out.println();
System.out.println(newChocolate);

boughtCandy = true;
  
}
// if the user wants to buy gummies
// the code takes in the input from the user and presents questions based on it
    
if(userSelection == 2){
System.out.println("What's the name?");
System.out.println("> ");
String gumName = input.nextLine();
gumName = input.nextLine();

System.out.println("How many?");
System.out.println("> ");
int gumAmount = input.nextInt();

System.out.println("What flavor?");
System.out.println("> ");
String gumType = input.next();

 //create gummy 
System.out.println();
Gummy newGummy = new Gummy(gumName, gumAmount, gumType);
System.out.println("Here you go:");
System.out.println();
System.out.println(newGummy);

boughtCandy = true;

}
System.out.println();
//says goodbye if they bought anything
if(boughtCandy){
System.out.println("Thank you, come again");
  //says goodbye if they didn't buy anything
}else {
  System.out.println("Thanks for visiting, maybe next time");
}
    
    // Closes the Scanner object
    input.close();
    
  }
}