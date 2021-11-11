package week1.day1;

public class ConvertToPositiveNo {
	
	public static void main(String[] args) {
		
		int num1=-40,temp,num2;
		temp=num1;
		if(num1<=0)
		{
			System.out.println(num1+" is a negative number");
			num1=num1-num1;
			num2=num1-temp;
			System.out.println(temp+" negative number is convert to positive number"+num2);
		}
		else {
			System.out.println(num1+" is a positive number and don't need to convert");
			
		}
	}

}
