package javaprograms;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string value");
		String st = s.nextLine();
		String temp = " ";
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			temp=ch[i]+temp;
		}
   System.out.println(temp);
	}

}
