
import java.util.*;

public class transpose{  
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
        int i,j,row,col,temp;
		System.out.println("Enter the number of rows:");
		row = sc.nextInt();
		System.out.println("Enter the number of columns:");
		col = sc.nextInt();

		int[][] mat = new int[row][col];
 
    		System.out.println("Enter the elements of the matrix") ;

    		for(i=0;i<row;i++){ 

	    		for(j=0;j<col;j++){ 
	        		mat[i][j] = sc.nextInt();
    			}
		    }
		
    		System.out.println("The elements of the matrix") ;

    		for(i=0;i<row;i++){ 

	    		for(j=0;j<col;j++){ 
	       	 	       	System.out.print(mat[i][j]+"\t");
    			}
      	 		System.out.println("");
		    }

            for(i=0;i<row;i++){		
                for(j=0;j<i;j++)
        	    {
        	        temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
		        }
		    }

		System.out.println("The transpose of the matrix is :- ") ;
    		for(i=0;i<row;i++){ 
                
	    		for(j=0;j<col;j++){ 
	       	 		System.out.print(mat[i][j]+"\t");
    			}
      	 		System.out.println("");
		}
  	}	
}


