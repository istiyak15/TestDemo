package codinginterview;
import java.util.*;
public class Array {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
			{
		arr[i]=s.nextInt();
			}
			for(int i=0;i<arr.length;i++)
		{
				System.out.println(arr[i]);
		}
	
	        
	}

}
