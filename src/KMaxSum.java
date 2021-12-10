
public class KMaxSum {
	
	public static void findMaxSum(Integer[] x, Integer[] y, int k) {
		
		 MaxPQ<CustArray> pq = new MaxPQ<CustArray>();

		 
		 //brute force, not ideal i guess
		 //although arrays have identical size, x.length=y.length
		 for (int i = 0; i < x.length; i++) 
		        for (int j = 0; j < y.length; j++) {
		        	pq.insert(new CustArray (i,j,x[i]+y[j]));
		        	//printing the objects in the priority queue
		        	 StdOut.print("The objects: " +pq.toString());
		        }
		 
		 //printing the k largest sums
		 for (int i=0; i<k; i++) {
			 		 
		 }
	}	 
	
	    // the private class that creates the array-like object, consisting of 3 elements of type int 
		 private static class CustArray implements Comparable<CustArray>{
			 private int sum;
			 private int index_a;
			 private int index_b;
			 
			 //constructor			 
			 public CustArray(int sum, int index_a, int index_b) {				 
				 this.sum=sum;
				 this.index_a=index_a;
				 this.index_b=index_b;				 
			 }
			 
			 
			 public int compareTo(CustArray that) {
			        return that.sum - sum;
			    }
			 
			 
			  public String toString() {
				  
				  return "["+index_a+","+index_b+","+sum+"]";
			       
			    }
			 
		 }
	}


