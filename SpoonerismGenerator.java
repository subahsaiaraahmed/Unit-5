import java.util.Scanner;

public class SpoonerismGenerator 
{
	private static Scanner scnr;

	public static void main (String[] args)
	{
		/* pseudocode follows */
		// create a new instance of the SpoonerismGenerator class
		SpoonerismGenerator spoonerismGenerator = new SpoonerismGenerator();
		// call the run method	of that instance
		spoonerismGenerator.run();
	}
	
	public void run()
	{
		/* pseudocode follows */
		
		// instantiate a new instance of the Scanner class
		Scanner input = new Scanner(System.in);
		// declare a string to hold the first input word
		String firstWord;
		// declare a string to hold the second input word
		String secondWord;
		// declare a string to hold the first spoonerized word
		String spoonWord1;
		// declare a string to hold the second spoonerized word
		String spoonWord2;
		// declare a string to hold the output line
		String outputLine;
		// declare an integer to hold the first word's vowel position index
		int vowelNdx1;
		// declare an integer to hold the second word's vowel position index
		int vowelNdx2;
		
		/* prompt the user for two words */
		firstWord = getWord("first");
		secondWord = getWord("second");
		
		/* find the index of the first vowel in each word */
		vowelNdx1 = vowelIndex(firstWord);
	 	vowelNdx2 = vowelIndex(secondWord);
		
		/* check to see if we have a vowel in the first position of both words */
		//if both vowel indeces are greater than 0
		if(vowelNdx1 > 0 && vowelNdx2 > 0)
		{
			/* use the substring function to move the starting consonants from each word to the other */
			spoonWord1 = secondWord.substring(0, vowelNdx2) + firstWord.substring(vowelNdx1, firstWord.length());
			spoonWord2 = firstWord.substring(0, vowelNdx2) + secondWord.substring(vowelNdx2, secondWord.length());
		
			/* generate the output string */
			// Output String = "Input Word 1 and Input Word 2 spoonerized are Spoonerized Word1 and Spoonerized Word 2"
			outputLine = firstWord + " and " + secondWord + " spoonerized are " + spoonWord1 + " and " + spoonWord2 ;
		}
		else 
		{
		 	// Output String = first word + " and " + second word + " are not good words to spoonerize.";
			outputLine = firstWord + " and " + secondWord + " are not good words to spoonerize.";
		}
		
		/* print the output string to the console */
		System.out.println(outputLine);
	}
	
	/* since we'll be doing this twice, we reuse the same code */
	public String getWord(String position)
	{
		String returnString = new String();
		System.out.print("\n Enter " + position + " word to Spoonerize:  ");
		
		returnString = scnr.nextLine();
		return returnString;
	}
	
	/* since we'll be doing this twice, we reuse the same code */
	public int vowelIndex(String inputString)
	{
		/* switch the local string to all lowercase for half the comparisons */	
	 	inputString = inputString.toLowerCase();
		
	// 	/* pseudocode follows */
	// 	declare a char variable to hold the character of the word we're comparing
		char letter;
	// 	declare an integer to hold the position of the character in the word
		int index;
	// 	Loop through each of the characters in the word from 0 to the length of the string
		for (index = 0; index < inputString.length(); index++)
		{
			// 	set the char variable equal to the character at the position we're examining
			letter =  inputString.charAt(index);
			// 	if the position is greater than zero and the char is y
			if(index > 0 && letter == 'y')
			{
			// break the loop
				return index;
			}
			// 		else if the character is a,e,i,o,u 
			else if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
			// 	break the loop
				return index;
			}
		}
		// if not vowel was found return a 0
		return 0;

	}
}

