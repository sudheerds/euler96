package euler96;

import java.util.Set;
import java.util.TreeSet;

class SolvePuzzle {
	
	static void solve(int[][] g){
		
		Set<Integer> blk = new TreeSet<Integer>();
	
		for(int row=0;row < g.length; row++){
			for(int col=0;col < g[0].length; col++){				
				
				//row and col constraints
				for(int i=0;i<9;i++){
					
					if(g[i][0]!=0)
						blk.add(g[i][0]);
					
					if(g[0][i]!=0)
						blk.add(g[0][i]);
			}
			
				//block constraints
				//int b = 3 *((row/3)%3) + ((col/3)%3);
				
				if(g[row+1][col+1]!=0)
					blk.add(g[row+1][col+1]);
				
				if(g[row+1][col+2]!=0)
					blk.add(g[row+1][col+2]);
				
				if(g[row+2][col+1]!=0)
					blk.add(g[row+2][col+1]);
				
				if(g[row+2][col+2]!=0)
					blk.add(g[row+1][col+1]);
				
		}
			
		}
		
			
			
	
		
		
		
	}

}
