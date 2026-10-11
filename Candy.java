/**
//represents candy in a candy shop
*/

public class Candy{
  private String name;      //name of candy 
  private double price;     // price of candy
  private int amount;       // amount they want to buy

// no-argument constructor
  
public Candy(){
  this("no name", 0.0, 0);
  
}
//parameterized constructor
public Candy(String name, double price, int amount){
  this.name=name;
  this.price=price;
  this.amount=amount;
}

public Candy(String name, double price){
  this(name, price, 0);
}
//accesor method: name
public String getName(){
  return name;
}//mutator method: name
public void setName(String name){
  this.name=name;
}//accesor method: price
  public double getPrice(){
    return price;
  }//accesor method: price
public void setPrice(double price){
  this.price=price;
}//accesor method: amount
public int getAmount(){
  return amount;
}//accesor method: amount
public void setAmount(int amount){
  this.amount=amount;
}

public String toString(){
  return name + "\nPrice: $" + price + "\nAmount: " + amount;
}
}
