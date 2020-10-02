/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  
  // pre loop code
  System.out.println("Starting to count");
    
// create a counter variable to keep tarck of what number we are on
int count = 1;
// use a loop to count to 5
while(true){
  // print the number we are on
  System.out.println(count);
 
  // add one to count/ accumulater
  count = count + 1;
  if (count == 5){
    break;
  }
}

 System.out.println("Done counting!");



 int count2 = 1;
 do{
   System.out.println(count2);
   count2 = count2 + 1;
 }while (count2 <= 5);

  }
}  
