class Demo
{
public static void main(String args[])
{
	int x=10;
	int y=0;
	try{
     System.out.println(x/y);
     }
     catch(Exception e1)
    {
	System.out.println("Divide by zero error");

    }
   finally
   {
	System.out.println("This Is a Finally Block");
    }

}
}