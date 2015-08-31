package euler96;
import java.io.*;
import java.util.Scanner;

public class ReadFile{	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String filename = "/home/sudheerds/Desktop/Java/sudoku.txt";	
	    File file = new File(filename); 	
	    Scanner sc = new Scanner(file);   
	    
	    while(sc.hasNextLine()){
	    	
	    	sc.nextLine();	    	
	    	
	    	int[][] grid = new int[9][9];
	    	
	    	
	    	for(int i=0;i<9;i++){	    		
	    		String str = sc.nextLine(); 		
				for(int j=0;j<9;j++){
					grid[i][j]=str.charAt(j)-'0';
					System.out.print(grid[i][j] + " ");
				}
				
				System.out.println();
				
				
				
				
				
	    	}    		    	
	    	System.out.println();
	    	
	    	//call to solve generic grid
	    	SolvePuzzle.solve(grid);
	    	
	    }	
	sc.close();
	
	}
	
}

