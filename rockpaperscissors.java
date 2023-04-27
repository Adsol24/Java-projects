

		import java.util.Scanner; 
		import java.util.Random; 


		public class rockpaperscissors{ 
		public static void main(String[] args) { 
		    String personPlay;  
		    String computerPlay = ""; 
		    int computerInt; 		                     		   
		    Scanner scan = new Scanner(System.in); 
		    Random generator = new Random(); 

		    System.out.println("Rock = R, Paper = P" + 
		                       " and Scissors = S.");

		    System.out.println();

		   
		    computerInt = generator.nextInt(3)+1; 

		

		    if (computerInt == 1) 
		       computerPlay = "R"; 
		    else if (computerInt == 2) 
		       computerPlay = "P"; 
		    else if (computerInt == 3) 
		       computerPlay = "S"; 


		    System.out.println("Enter your move: "); 
		    personPlay = scan.next();

		    
		    personPlay = personPlay.toUpperCase(); 

		     
		    System.out.println("Computer play is: " + computerPlay); 


		    
		    if (personPlay.equals(computerPlay)) 
		       System.out.println("It's a tie!"); 
		    else if (personPlay.equals("R")) 
		       if (computerPlay.equals("S")) 
		          System.out.println("the computer is scissors you are rock you won");
		    else if (computerPlay.equals("P")) 
		            System.out.println("the computer is paper you are rock you lost"); 
		    else if (personPlay.equals("P")) 
		       if (computerPlay.equals("S")) 
		       System.out.println("computer is scissor you are paper you lost"); 
		    else if (computerPlay.equals("R")) 
		            System.out.println("computer is rock you are paper you won"); 
		    else if (personPlay.equals("S")) 
		         if (computerPlay.equals("P")) 
		         System.out.println("computer is paper you are scissors you won"); 
		    else if (computerPlay.equals("R")) 
		            System.out.println("computer is rock you are scissors you lost"); 
		    else 
		         System.out.println("Invalid user input."); 
		    
		   
		    
		}
		
	}


