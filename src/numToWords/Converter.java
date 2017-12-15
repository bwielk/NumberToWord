package numToWords;

import java.util.StringJoiner;

public class Converter {
	
	public String run(int num){
		int number = num;
		StringJoiner result = new StringJoiner(" ");
		String units[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String teens[] = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixtteen", "seventeen", "eighteen", "nineteen"};
		String tens[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		if(num >= 1000000 && num < 9999999){
			int index = num/1000000;
			result.add(units[index]).add("million");
			number -=index*1000000;
		}
		
		if(number>=1000 && number<=9999){
			int index = number/1000;
			result.add(units[index]).add("thousand");
			number -=index*1000;
		}
		
		if(number>=100 && number<=999){
			int index = number/100;
			result.add(units[index]).add("hundred");
			number -=index*100;
		}
		
		if(number >=20 && number<=99){
			int index = number/10;
			result.add(tens[index]);
			number -=index*10;
		}
		
		if(number >= 1 && number <=9){
			result.add(units[number]);
			number -=number;
		}
		
		return result.toString();
	}
}
