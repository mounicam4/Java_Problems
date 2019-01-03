
// A pangram is a sentence containing every letter in the English Alphabet.

// Example: "The quick brown fox jumps over the lazy dog"


//*** Create a hash table to mark the  
// characters present in the string 
// By default all the elements of  
// mark would be false ***//


public class CheckPangram {

	public static boolean Check_Pangram(String s)
	{
		boolean[] Mark = new boolean[26];
		int index = 0;

		// Traverse all characters 
		for(int i=0; i<s.length();i++)
		{
			 // If uppercase character, subtract 'A' 
            // to find index.
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z')
				index = s.charAt(i) - 'A';
			
			// If lowercase character, subtract 'a' 
            // to find index.
			else if('a' <= s.charAt(i) && s.charAt(i) <= 'z')
				index = s.charAt(i) - 'a';
			
			Mark[index] = true;
		}
		
		for(int i=0; i<26;i++)
		{
			if(Mark[i] == false)
				return false;
		}

	return true;
	}
	
		
	public static void main(String[] args)
	{
		String str = "The quick brown fox jumps over the lazy dog";
		
		if(Check_Pangram(str))
			System.out.println("Yes, this is Pangram");
		else
			System.out.println("No, this is not a Pangram");
		
	}
}


