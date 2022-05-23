import java.util.Scanner;

public class ArrayChallenges
	{
			static Scanner userInput = new Scanner(System.in);
			
			
			
		public static void main(String[] args)
			{
				printCandy();
				seperateChallenges();
				addNumbers();
				seperateChallenges();
				printRandomNumbers();
				seperateChallenges();
				printFourDigitNumber();				
				addToAnArray();
			}
		
		public static void printCandy()
			{
				System.out.println("How many favorite sweets do you have?");
				int numOfSweets = userInput.nextInt();
				

				String [] sweets = new String [numOfSweets];
				
				String fake = userInput.nextLine();
								
				for(int i=0; i < numOfSweets; i++)
					{
						System.out.println("Input a sweet!");
						
						sweets [i] = userInput.nextLine();
					}
				
				for(String s : sweets)
					{
						System.out.println(s);
					}						
			}
		
		public static void addNumbers()
			{
				System.out.println("Please input 8 number.");
				int evenTotal = 0;
				int oddTotal = 0;
			
				int [] nums = new int [8];
			
				for(int i = 0; i<nums.length; i++)
					{	
						nums[i] = userInput.nextInt();
					}
			
				for(int i = 0; i<nums.length; i++)
					{
						if(nums[i] % 2 == 0)
							{
								evenTotal += nums[i];
							}
						
						else
							{
								oddTotal += nums[i];
							}
					}
			
				System.out.println("The sum of all the odd number is " + oddTotal);
			
				System.out.println("The sum of all the even number is " + evenTotal);		
			}
		
		public static void printRandomNumbers()
			{ 
				int [] nums = new int [5];
				 
				for(int i = nums.length-1; i>=0; i--)
					{	
						nums[i] = (int) (Math.random()*89+10);
					}
				
				System.out.println("The random numbers are below!");
				
				for(int i : nums)
					{
						System.out.println(i);
					}
 
			}
		
		public static void printFourDigitNumber()
			{ 
				int [] nums = new int [4];
				
				System.out.println("Please input a four digit number!");
				int num = userInput.nextInt();
				 
				int reversedNum = 0;

				 for(int i = 1; i<=4; i++)
					 {
						 reversedNum = num % 10;
						 num = num / 10;	 	
						 nums[i-1] = reversedNum;
					 }
				
				for(int i : nums)
					{
						System.out.println(i);
					}		   
			}
		
		public static void seperateChallenges()
			{
				Scanner userFakeInput = new Scanner(System.in);
				String pause;
				pause = userFakeInput.nextLine();
			}
	
		public static void addToAnArray()
		{	
			String [] games = {"Scrabble", "Monoploy", "Catan", "I Solved This First!", "Life"};	
			String [] games2 = new String [games.length+1];
			for(int i =0; i<games.length; i++)
			{
				games2[i] = games [i];
			}
			games2[games.length] = "Boggle";
			games = games2;
			for(int i = 0; i<games2.length; i++)
				{
					System.out.println(games[i]);
				}
		}
	}
