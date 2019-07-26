package petserviceproject;

class Menu {
    static void showMenu(){
    System.out.println("=================================");
    System.out.println("|\tJake's Pet Grooming\t|");
    System.out.println("=================================");
    System.out.println("|\t1: For Cats\t\t|");
    System.out.println("|\t2: For Dogs\t\t|");
    System.out.println("|\t3: Exit Menu\t\t|");
    System.out.println("=================================");
    }
    void showCatMenu(){
    System.out.println("=================================");
    System.out.println("|\tJake's Pet Grooming\t|");
    System.out.println("=================================");
    System.out.println("|\tCat Services:\t\t|");
    System.out.println("|\t1: Groom - $60\t\t|");
    System.out.println("|\t2: Bath - $32\t\t|");
    System.out.println("=================================");    
    }
    void showDogMenu(){
    System.out.println("=================================");
    System.out.println("|\tJake's Pet Grooming\t|");
    System.out.println("=================================");
    System.out.println("|\tDog Services:\t\t|");
    System.out.println("|\t1: Groom - $30\t\t|");
    System.out.println("|\t2: Bath - $20\t\t|");
    System.out.println("|\t3: Puppy Bath - $10\t|");
    System.out.println("|\t4: Puppy Trim - $15\t|");
    System.out.println("=================================");     
    }
}