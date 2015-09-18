package euler96;

import java.util.Set;
import java.util.TreeSet;

class SolvePuzzle {
	
	static void solve(int[][] g){	
		
		System.out.println("Solving...\n");
		
		Set<Integer> blk = new TreeSet<Integer>();
		int j=0;
		
		for(int row=0;row < g.length; row++){
			for(int col=0;col < g[row].length; col++){		
				
				if(g[row][col]==0){					
				
					//row and col constraints
					for(int i=0;i<9;i++){
						
						if(g[row][i]!=0)
							blk.add(g[i][row]);
						
						if(g[i][col]!=0)
							blk.add(g[i][col]);
				}// end of row,col constraints
				
					//block constraints
					for(int r = (row/3)*3,r1=r; r<r1+3; r++){
						for(int c = ((col%9)/3)*3,c1=c; c<c1+3; c++){						
							if(g[r][c]!=0)
								blk.add(g[r][c]);						
						}
					}//end of block constraints	
					
						//logic to add number
					    int count=0;
						
						do{	
							count++;
							if(count>9){
								g[row][col]=0;
								col-=2;
								if(col<-1){
									row--;
									col=8;
								}
								break;
							}
								
							if(j+1>9)
								j=1;
							else
								j++;
							
							if(!(blk.contains(j))){
								g[row][col]=j;
								count=0;
								break;
							}
								
						}while(true);
					
						
					
				}// else if non zero
				
					blk.removeAll(blk);
					
			}// end of col for loop
				
				
		}// end of row loop
		System.out.println("\n \n \n The solved puzzels are: \n \n");
		for(int i=0;i<9;i++){
			for(int k=0;k<9;k++){
				System.out.println(g[i][k]);
			}
			System.out.println();
		}
		
			
	}

	
}
