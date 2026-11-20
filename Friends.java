import java.util.*;
import java.util.random.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {
    ArrayList<String> friends = new ArrayList<String>();
    Random r = new Random();

   // declare and initialize the ArrayList
   // declare and initialize the Random class
   
   // the constructor
   public Friends () {
       friends.add("yaoi boy");
       friends.add("charlie");
       friends.add("kenobi");
   }
   
   public void printRandomFriend(){
       System.out.println(friends.get(r.nextInt(friends.size())));
    }
   
  public static void main(String[] args) {
        Friends f =new Friends();
        f.printRandomFriend();
    }
}