package petserviceproject;
/*A console based program for pet grooming customers to choose services for
for their pets.
*/
import java.util.Random; 
import java.util.Scanner;

class CatPack {
    double groom = 0 , bath = 0; //holds values for groom, bath
    
    void groom() {
        System.out.println("Your total is $" + (groom + 60.00));
    }
    void bath() {
        System.out.println("Your total is $" + (bath + 32.00));
    }
}
//class DogPack is inheriting class CatPack
class DogPack extends CatPack {
    double trim; //holds value for trim
   void groom (){
        System.out.println("Your total is $" + (groom + 30.00));
   } 
   void bath() {
        System.out.println("Your total is $" + (bath + 20.00));
   }
   void trim(){
       System.out.println("Your total is $" + (trim + 15.00));
   }
   void pbath() {
       System.out.println("Your total is $" + (bath + 10.00));
   }
}

    class PetServiceProject {
    public static void main(String[] args)
      throws java.io.IOException {
        Scanner sc = new Scanner(System.in);
        
        Menu.showMenu(); //shows Menu for pet grooming selection
        Menu cat = new Menu(); //cat object
        Menu dog = new Menu(); //cat object
        CatPack cob = new CatPack(); //cob object created 
        DogPack dob = new DogPack(); //dob object created
        
        //To simulate appointment dates and hours
        Random rand = new Random();
        int max = 30, min = 1;
        int randomDay = rand.nextInt((max - min) + 1) + min;
        max = 12; 
        min = 8;
        int randomHour = rand.nextInt((max - min) + 1) + min; 
                    
        char choice;             
        choice = (char) System.in.read();
         
        switch(choice) {
            case '1' : cat.showCatMenu(); 
               int optionA = Integer.parseInt(sc.next());
                
                if(optionA == 1){
                  System.out.println("Our next available date will be on August " +
                        randomDay + " at " + randomHour + ":00 AM ");
                  cob.groom();
                }
                else if(optionA == 2){
                  System.out.println("Our next available date will be on August " +
                        randomDay + " at " + randomHour + ":00 AM ");
                    cob.bath();
                }
                else System.out.println("No option was selected");
                break;
            case '2': dog.showDogMenu();
               int optionB = Integer.parseInt(sc.next());
               //Nested switch inside switch(choice)
               switch(optionB) { 
                   case 1: 
                       System.out.println("Our next available date will be on August " +
                            randomDay + " at " + randomHour + ":00 AM ");
                       dob.groom();
                        break;
                   case 2: 
                       System.out.println("Our next available date will be on August " +
                            randomDay + " at " + randomHour + ":00 AM ");
                       dob.bath();
                        break;
                   case 3: 
                       System.out.println("Our next available date will be on August " +
                            randomDay + " at " + randomHour + ":00 AM ");
                       dob.pbath();
                        break;
                   case 4: 
                       System.out.println("Our next available date will be on August " +
                            randomDay + " at " + randomHour + ":00 AM ");
                       dob.trim();
                        break;
                   default:
                        break;
               }
                break;
            case '3' : 
                System.out.println("Goodbye.");
                break;
            default :
                System.out.println("No choice was selected");
                break;
    }           
  }
}
