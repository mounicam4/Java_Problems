
//Java Program to Swap first and last character of words in a Sentence as mentioned in the example?

//Examples: 
//Input : geeks for geeks
//Output :seekg rof seekg


/*

First we will create an Char array of given String by using toCharArray() method.
Now we iterate the char array by using for loop.
In for loop, we declare a variable whose value is dependent on i.
Whenever we found an alphabet we increase the value of i and whenever we reach at space, 
we are going to perform swapping between first and last character of the word which is previous of space

*/


public class SwapFirstLastCharacters {

	public static String Test(String s)
	{
		// Create an equivalent char array 
        // of given string  
		char[] C = s.toCharArray();
		
		int k = 0;
		for(int i =0; i < C.length;i++)
		{
			// k stores index of first character 
            // and i is going to store index of last  
            // character.  
			k=i;
			
			while(i < C.length && C[i] != ' ')
				i++;
			
            // Swapping 
			char temp = C[k];
			C[k] = C[i-1];
			C[i-1] = temp;
			
			// We assume that there is only one space 
            // between two words. 
		}
		
		return new String(C);
		
	}
	
	public static void main(String[] args)
	{
		String S = "Geeks for Geeks";
		
		System.out.print(Test(S));
	}
	
	
}
