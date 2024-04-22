/**
 * This program converts a binary number into a decimal. For the first part, a user inputs a binary number of any size, however, for the second part,
 * the user must input a binary number that is less than or equal to 8 bits in length. Using th binary to decimal formula, decimal = d0×20 + d1×21 + d2×22 + ..., 
 * a decimal number is outputted to the console.
 *
 * Kylie Heiland
 * 
 * Project04
 * 
 * 2/17/2022
 */


import java.util.Scanner; 
public class KylieHeilandProject04 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();
        double decimal = 0;
        //System.out.println("The number: " + binary + " is " + Integer.parseInt(binary, 2)); //EASY WAY!
        
        //I based this off of 8 bits, although if one wanted to convert to 10, 12, 16, or more bits, it is possible! For the sake of simplicity, however, I chose to do only 8 since it was not
        //clarified in the instructions on the maximum number of bits.
        if(binary.length() > 8)
        {
            System.out.println("This program only converts binary numbers that are 8 bits or less.");
            System.exit(1);
        }
      
        //Evaluates the first digit of the binary number. If it is 1, then the program multiplies 1 with the 2 to its length - 1 power. 
        if((binary.length() > 0) && (binary.charAt(0) == '1'))
        {
                decimal = 1 * (Math.pow(2, (binary.length() - 1)));
        }
        //If the binary number has no length, the system exits. 
        else if(binary.length() == 0)
        {
                System.out.println("Error, there is no binary to convert.");
                System.exit(1);
        }
        
        //Evaluates the second digit of the binary number. If it is 1, then the program multiplies 1 with the 2 to its length - 2 power, and then added to the previous decimal
        //amount determined in the previous if statement. 
        if((binary.length() > 1) && (binary.charAt(1) == '1'))
        {
                decimal += (1 * (Math.pow(2,(binary.length() - 2))));
        }
        
        //Evaluates the second digit of the binary number. If it is 1, then the program multiplies 1 with the 2 to its length - 3 power, and then added to the previous decimal
        //amount determined in the previous if statement.         
        if((binary.length() > 2 && (binary.charAt(2) == '1')))
        {
                decimal += (1 * (Math.pow(2, (binary.length() - 3))));
        }
        
        //Evaluates the second digit of the binary number. If it is 1, then the program multiplies 1 with the 2 to its length - 4 power, and then added to the previous decimal
        //amount determined in the previous if statement.         
        if((binary.length() > 3) && (binary.charAt(3) == '1'))
        {
            decimal += (1 * (Math.pow(2, (binary.length() - 4))));
        }
               
        //Evaluates the second digit of the binary number. If it is 1, then the program multiplies 1 with the 2 to its length - 2 power, and then added to the previous decimal
        //amount determined in the previous if statement. 
        if((binary.length() > 4) && (binary.charAt(4) == '1'))
        {
            decimal += (1 * (Math.pow(2, (binary.length() - 5))));
        }
            
        //Evaluates the second digit of the binary number. If it is 1, then the program multiplies 1 with the 2 to its length - 2 power, and then added to the previous decimal
        //amount determined in the previous if statement. 
        if((binary.length() > 5) && (binary.charAt(5) == '1'))
        {
            decimal += (1 * (Math.pow(2, (binary.length() - 6))));
        }
        
        //Evaluates the second digit of the binary number. If it is 1, then the program multiplies 1 with the 2 to its length - 2 power, and then added to the previous decimal
        //amount determined in the previous if statement. 
        if((binary.length() > 6) && (binary.charAt(6) == '1'))
        {
            decimal += (1 * (Math.pow(2,(binary.length() - 7))));
        }
          
        //Evaluates the second digit of the binary number. If it is 1, then the program multiplies 1 with the 2 to its length - 2 power, and then added to the previous decimal
        //amount determined in the previous if statement. 
        if((binary.length() > 7 && binary.length() <= 8) && (binary.charAt(7) == '1'))
        {
            decimal += (1 * (Math.pow(2, (binary.length() - 8))));
        }
        
        //Prints out the final decimal number, after all of the binary's values have been added together.
        System.out.println("The binary number: " + binary + " is " + (int) decimal + " in decimal.");
        
     }
   }
   
   /* OUTPUT:
EASY WAY:
Enter a binary number: 10000
The number: 10000 is 16
Enter a binary number: 0
The number: 0 is 0
Enter a binary number: 1111
The number: 1111 is 15

HARD WAY:
Enter a binary number: 10110010
The binary number: 10110010 is 178 in decimal.
Enter a binary number: 1000000
The binary number: 1000000 is 64 in decimal.
Enter a binary number: 111101
The binary number: 111101 is 61 in decimal.
Enter a binary number: 01001
The binary number: 01001 is 9 in decimal.
Enter a binary number: 1111
The binary number: 1111 is 15 in decimal.
Enter a binary number: 101
The binary number: 101 is 5 in decimal.
Enter a binary number: 11
The binary number: 11 is 3 in decimal.
Enter a binary number: 0
The binary number: 0 is 0 in decimal.
Enter a binary number: 
Error, there is no binary to convert.
Enter a binary number: 1010001011000000111
This program only converts binary numbers that are 8 bits or less.
    */
