/*





*/
package box1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class test 
{
	if (age > 21) 
	{		
		
		if (age > 64)
		{
			seinorCount = seinorCount + 1;
			System.out.println("Seinor");
		}
		else
		{
			adultCount = adultCount + 1;
			System.out.println("Adult");
		}
	}
	else
	{
		if (age > 12) System.out.println("teen");
		else System.out.println("Child");
	}
	
	public static void main(String[] args) 
	{
		double dollars, answer;
		int empCode;
		
		dollars = getSales();
	}
	
	public static double getSales() {
		double sales = 0.0;
		String answer = JOptionPane.showInputDialog(null, "Enter the sales ammount\n(do not use commas / dollar signs\n Or click cancel to EXIT");
		sales = Double.parseDouble(answer);
		System.out.print("ans: ");
		System.out.println(answer);
		System.out.print("ret: ");
		System.out.println(sales);

		return sales;
	}

}
