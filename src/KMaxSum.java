/******************************************************************************
* Compilation: javac KMaxSum.java
* Dependencies: StdIn.java StdOut.java MaxPQ.java
* Aikaterini Kentroti
******************************************************************************/

public class KMaxSum {
	
	public static void findMaxSum(Integer[] x, Integer[] y, int k) {
		
		 MaxPQ<CustArray> pq = new MaxPQ<CustArray>();

		 
		 //calculating the sums, inserting the objects in pq
		 for (int i = 0; i < x.length; i++) 
		        for (int j = 0; j < y.length; j++) {   //(although arrays have identical size, x.length=y.length
		        	pq.insert(new CustArray (i,j,x[i]+y[j]));
		        	//printing the objects in the priority queue
		        	 StdOut.print("keys in pq: " +pq.toString()+"\n");
		        }
	
		 //printing the k largest different sums
		 for (int i=0; i<k; i++) {
			 StdOut.print("k="+i+" keys in pq: " +pq.toString()+"\n");
			 
			 CustArray item=pq.delMax();
			 String str=String.format("sum=%1$d, a[%2$d]=%3$d, b[%4$d]=%5$d", item.sum,item.index_a,x[item.index_a],item.index_b,y[item.index_b])+"\n";
			 StdOut.print(str);
			 
			 //if the current maximum item is equal to the previous, delete it as well to avoid printing identical sums
			 if (item.compareTo(pq.max())==0) {
				 pq.delMax();			
			 }	 
		 }
	}	 
	
	    // the private class that creates the array-like object, consisting of 3 elements of type int 
		 private static class CustArray implements Comparable<CustArray>{
			 private int sum;
			 private int index_a;
			 private int index_b;
			 
			 //constructor			 
			 public CustArray( int index_a, int index_b,int sum) {				 
				 this.sum=sum;
				 this.index_a=index_a;
				 this.index_b=index_b;				 
			 }
			 
			 
			 public int compareTo(CustArray that) {
				 return Integer.compare(this.sum, that.sum);
			    }
			 
			 
			  public String toString() {
				  
				  return "["+index_a+","+index_b+","+sum+"]";
			       
			    }
			 
		 }
	}


