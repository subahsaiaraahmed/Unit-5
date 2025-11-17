import java.util.Scanner;

public class SpoonerismGenerator 
{
	private static Scanner scnr;

	public static void main (String[] args)
	{
		/* pseudocode follows */
		create a new instance of the SpoonerismGenerator class
		call the run method	of that instance
	}
	
	public void run()
	{
		/* pseudocode follows */
		
		instantiate a new instance of the Scanner class
		declare a string to hold the first input word
		declare a string to hold the second input word
		declare a string to hold the first spoonerized word
		declare a string to hold the second spoonerized word
		declare a string to hold the output line
		declare an intger to hold the first word's vowel position index
		declare an intger to hold the second word's vowel position index
	
		
		/* prompt the user for two words */
		String first word = getWord("first");
		String second word = getWord("second");
		
		/* find the index of the first vowel in each word */
		integer vowel index 1 = vowelIndex(first word);
		integer vowel index 2 = vowelIndex(second word);
		
		/* check to see if we have a vowel in the first position of both words */
		if both vowel indeces are greater than 0
		{
			/* use the substring function to move the starting consonants from each word to the other */
			Spoonerized Word1 = second input Word.substring(0, vowel indx2) + first input Word.substring(vowel index1, first input Word length());
			Spoonerized Word2 = first input Word.substring(0, vowel index1) + second input Word.substring(vowel index2, second input Word length());
		
			/* generate the output string */
			Output String = "Input Word 1 and Input Word 2 spoonerized are Spoonerized Word1 and Spoonerized Word 2"
		}
		else 
		{
		 	Output String = first word + " and " + second word + " are not good words to spoonerize.";
		}
		
		/* print the output string to the console */
		print(Output String);
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
		
		/* pseudocode follows */
		declare a char variable to hold the character of the word we're comparing
		declare an integer to hold the position of the character in the word
	
		Loop through each of the characters in the word from 0 to the length of the string
		{
			set the char variable equal to the character at the position we're examining
			
			if the position is greater than zero and the char is y
			{
				break the loop
			}
			else if the character is a,e,i,o,u 
			{
				break the loop
			}
			
		}
		
		return the integer position of the vowel found;
	}
}

