import java.util.Scanner;

class Demo{
public static void main(String [] args){
  Scanner sc =new Scanner(System.in);
  String str = sc.next();
  System.out.println(str);
  StringBuffer s1 = new StringBuffer(str);
  String temp = new String(s1.reverse());
  System.out.println(s1);
  if (str.equals(temp)){
	  System.out.println("String is  palindrome");
	  } else {
	  System.out.println("String is not  palindrome");
		  }


}
}