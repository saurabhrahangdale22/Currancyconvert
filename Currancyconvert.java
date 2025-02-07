import java.util.Scanner;
class Currancyconvert 
{
	public static void main(String[] args) 
	{
			Scanner sc= new Scanner(System.in);
		System.out.println();
			System.out.println(" CURRENCY CONVERTER ");
		System.out.println();
		System.out.println("enter the ammount(INR) :");
		float inr = sc.nextfloat();
				System.out.println();
			System.out.println(" LIST OF CURRENCY ");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP ");
		System.out.println("4.PKR ");
				System.out.println();
		System.out.println("ENTER THE CURRENCY :");
     String curr =sc.next().toUpperCase();
	 float conCurr=0;
	 if (curr.equals("USD"))
	 {
		 conCurr = inr/86.56f;
		 		System.out.println(inr +"INR ="+conCurr+" USD");
	 }
	else if (curr.equals("EUR"))
	 {
		 conCurr = inr/90.25f;
		 		System.out.println(inr +"INR ="+conCurr+"EUR");
	 }
	 else if (curr.equals("GBP"))
	 {
				
		System.out.println("GBP");
	 }
else if (curr.equals("PKR"))
	 {
				
		System.out.println("PKR");
	 }
		else {
	 	System.out.println("INVALIDE OPTION");
		}
	}
}
