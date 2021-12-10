import java.util.Arrays;
import java.util.Collections;



public class p3e2a {
	
	//method that prints arrays of type Integer
	public static void printIntArray(Integer[] x) {
		for (int i = 0; i < x.length; i++) {
           StdOut.printf("%2d", x[i]);
		}
		StdOut.println();
	}
	
	//method that converts the arrays with elements of primitive data type int to objects of type Integer(wrapper type)
	public static Integer[] convertintToInt(int[] x) {
		Integer[] y=new Integer[x.length];
		for (int i=0;i<x.length;i++) {
			y[i]=x[i];
		}	
		return y;
	}
	
    
	public static void main(String[] args) {
	
	//read two integer arrays and an integer-user's input
		int arr1[]=StdArrayIO.readInt1D();
		int arr2[]=StdArrayIO.readInt1D();
		int number= StdIn.readInt();
		int n=arr1.length;
				
		//convert the input arrays with elements of primitive data type int to objects of type Integer(wrapper type)
		Integer[] a=convertintToInt(arr1);
		Integer[] b=convertintToInt(arr2);
				
		//print the arrays
		printIntArray(a);
		printIntArray(b);
		StdOut.print("Number k is: " + Integer.toString(number)+"\n");
		StdOut.print("Sorted arrays:\n");
		Arrays.sort(a,Collections.reverseOrder());
		Arrays.sort(b,Collections.reverseOrder());
		printIntArray(a);
		printIntArray(b);
		
	}
}
