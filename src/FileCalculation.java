import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileCalculation {

	public static void main(String[] args){
		
		try{
				
				/**
				 * Asks the user for the number of files, and then proceeds.
				 */
				
				Scanner console=new Scanner(System.in);
				System.out.println("Enter the amount of files you have");
				int fileNumber=console.nextInt();
				
				int lineNumber=0;
				int charNumber=0;
				int wordNumber=0;
			
			
				/**
				 *  The program will continue to calculate the
				 *  words, characters, and lines until the user enters "-1"
				 */
			
				for(int i=0;i<fileNumber;i++)
				{
					System.out.println("Enter the input file name or press -1 to show total characters, words, and lines of the processed files. ");
					Scanner kb=new Scanner(System.in);
					String fileName=kb.next();
					if(fileName.equalsIgnoreCase("-1"))
					{
						break;
					}
					
					FileReader reader=new FileReader(fileName);
					Scanner in=new Scanner(reader);
				
					
					while(in.hasNext()&&in.hasNextLine()==true)
					{
						in.useDelimiter("");
						String chars=in.next();
						charNumber++;
						if(in.hasNextLine()==false)
						{
							lineNumber++;
						}
			
						if(chars.equals(" ")||in.hasNext()==false)
						{
							wordNumber++;
						}
					}
					
				}
				
					/**
					 * Prints the number of character, words and lines
					 */
				
				System.out.println();
				System.out.println("Number of characters in the file(s): " +charNumber);
				System.out.println("Number of words in the file(s): " +wordNumber);
				System.out.println("Number of lines in the file(s): " +lineNumber);
		}	
			
			/**
			 * Try/Catch Exception to check whether or
			 * not the file the user enters exists or not
			 */
	
		catch(FileNotFoundException e)
		{
			System.out.println("File doesnt exit");
			
		}
		catch(InputMismatchException i)
		{
			System.out.println("Please enter a valid number");
		}
		
		finally
		{
			System.out.println("I like peaches");
		}
	}
}
