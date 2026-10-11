//represents gummy candy

public class Gummy extends Candy{
 private String flavor; //flavor of gummy
//no argument constructor
  public Gummy(){
    super("no name", 1.0, 0);
  }
//parameterized constructor
public Gummy(String name, int amount, String flavor){
  super(name, 1.0*amount, amount);
  this.flavor=flavor;
}

  public Gummy(String name){
    super(name, 1.0, 0);
  }
//accessor method for flavor
  public String getFlavor(){
    return flavor;
  }
//mutator method for flavor
public void setFlavor(String flavor){
  this.flavor=flavor;
}

public String toString(){
  return super.toString() + "\nFlavor: " + flavor;
}


  
}