import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;



public class MastermindExercise {

	public static void main(String[] args) {
		
		 //generate 4 random numbers between 1 & 6 
		   
	    Random randomGenerator = new Random();
	    int randomOne = randomGenerator.nextInt(6)+1;
	    int randomTwo = randomGenerator.nextInt(6)+1;
	    int randomThree = randomGenerator.nextInt(6)+1;
	    int randomFour = randomGenerator.nextInt(6)+1;

	    //for testing purposes, can uncomment out to re-test
	   // System.out.println(randomOne);
	  //  System.out.println(randomTwo);
	  //  System.out.println(randomThree);
	 //   System.out.println(randomFour);
	    
	    	    
	    //put random numbers into an array list to check for semi-matches
	    
	    ArrayList<Integer> randomArrayList = new ArrayList<Integer>();
	    randomArrayList.add(randomOne);
	    randomArrayList.add(randomTwo);
	    randomArrayList.add(randomThree);
	    randomArrayList.add(randomFour);

	     //declare number of tries variable

	    int numberOfTries = 0;

	    while(numberOfTries <=10){

	    //ask for user input as an int between 1 & 6

	    Scanner input = new Scanner(System.in);

	    System.out.println("Enter four integers between 1 and 6.");
	    
	    System.out.println("Enter guess one");
	    int guessOne = input.nextInt();
	    
	    System.out.println("Enter guess two");
	    int guessTwo = input.nextInt();
	    
	    System.out.println("Enter guess three");
	    int guessThree = input.nextInt();
	    
	    System.out.println("Enter guess four");
	    int guessFour = input.nextInt();

	   

	    //testing
	    System.out.println("You have guessed: ");
	    System.out.println(guessOne);
	    System.out.println(guessTwo);
	    System.out.println(guessThree);
	    System.out.println(guessFour);

	    //put user input into an array for perfect matches

	    int [] guessArray = {guessOne, guessTwo, guessThree, guessFour};

	       
	    //declare perfect matches (+) variable
	    int perfectMatches = 0;

	    
	    //traverse random array to check against guessed array for perfect matches, pring + for each perfect match 

	    for(int i =0; i<=3; i++ ){
	        if(randomArrayList.get(i)==(guessArray[i])){
	            System.out.println("+");             
	            perfectMatches ++;
	        }
	        if(perfectMatches ==4){
	            System.out.println("You have won the game, congratulations!");
	            System.exit(0);
	        }
	    }

	     //do another traversal, check for semi matches, so if the random array contains a guessed number but not at correct index, print - for every semi match    

	          
	    for (int i=0; i<=3; i++) {
	        if(randomArrayList.get(i) != guessArray[i] && randomArrayList.contains(guessArray[i])) {
	            System.out.println("-");
	       
	    }
	    }
	    System.out.println("Let's try that again");
	    numberOfTries ++;
	    

	}

	//if, at the end of the loop, number of tries = 10, print out that the guesser loses, system.exit

	System.out.println("You have reached the maxiumum amount of tries, you lose.");
	
	System.exit(0);
	
	


	}
	
}
	 
		

	


