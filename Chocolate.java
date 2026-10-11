//represents chocolate candy
public class Chocolate extends Candy {
  private String type; //type of chocolate
//no-argument constructor
public Chocolate(){
  super("no name", 0.0, 0);
}
//paremterized constructor
public Chocolate(String name, int amount, String type){
 super(name, 2.0 * amount, amount);
  this.type=type;
}
//accessor method for type
public String getType(){
  return type;
}
//mutator method for type
  public void setType(String type){
    this.type=type;
  }

public String toString (){
  return super.toString() + "\nType: " + type;
}







  
}