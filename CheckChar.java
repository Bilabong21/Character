import java.util.*;

public class CheckChar
  {
    public static void main(String[] args)
	  {
	    Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the characters : ");
		char Char = kb.nextLine().charAt(0);
		
		while(Char != '*')
		   {
			   
			 if(letterDigit(Char) == true)
			    {
					
					System.out.println("You have entered the valid character");
				
				}else
				    {
						
						System.out.println("You have entered the invalid character");
					
					}
					System.out.print("Enter the characters : ");
					Char = kb.nextLine().charAt(0);
					 /*boolean returned = letterDigit(Char);
			         System.out.println(returned);
		            System.out.print("Enter the characters : ");
		            Char = kb.nextLine().charAt(0);*/
		   }
		
		
	  }
	  
	public static boolean letterDigit(char p_cChar)
	  {
		 boolean ans = false;
		 
		
			  if(Character.isLetterOrDigit(p_cChar)) 
			    {
					
					ans = true;
				
				}else
				    {
						ans = false;
					}
					
					
		   
		  return ans;
	  }
	  
	
  }
 