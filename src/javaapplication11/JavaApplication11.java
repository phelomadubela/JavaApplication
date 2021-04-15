/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication11;

import java.util.Scanner;

public class JavaApplication11 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);  
	        int sum = 0;
	        int votes[] = new int[] {49,67,78,89,97,59,34,21,76,110}; 
	        
	        String names[] = new String[] {"Phelo","Siphiwo","Asiphe","Mbuso","Imraan","Delron","Linda"}; 
	      
	            for (int i = 0; i <= names.length - 1; i++){
	             System.out.println((i + 1) + ". " + names[i] + "(+ " + votes[i] + ")");
	             sum = sum + votes[i];
	            }
	            
	            System.out.println(" ");
	            System.out.println("Total number of casted votes: " + sum);
	            System.out.println("");

	            System.out.println("");
	            System.out.println("Who do you wanna vote for? Choose from above list add a number between 1 - 10:");
	            int position = scan.nextInt();
	            
	            while((position < 0) && (position > 10)){
	            	System.out.printf("Error!Please enter a number between 1 - 10:");
	            	position = scan.nextInt();
	            }
	            
	            votes[position - 1] = votes[position - 1] + 1;
	            System.out.println(" ");
	            System.out.println("You voted for:");
	            System.out.println(names[position - 1] + " " + (votes[position - 1] + 1) + "(+1)");
	
	            scan.close();
	}
	

}



