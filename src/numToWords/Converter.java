package numToWords;

public class Converter {
	
	public String run(int num){
		int number = num;
		String result = "";
		String units[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String teens[] = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixtteen", "seventeen", "eighteen", "nineteen"};
		String tens[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		if(num >= 1000000){
			int index = num/1000000;
			result = units[index] + " million";
			num -=number*1000000;
		}
		
		/*if(num <=9){
			result = units[num];
		}
		else if(num >=10 && num <20){
			result = teens[num-10];
		}
		else if(num >20 && num <=100){
			if(num%10 != 0){
				int ten = num/10;
				int unit = num%10;
				result = tens[ten] + " " + units[unit];
			}else{
				int ten = num/10;
				result = tens[ten];
			}
		}*/
		return result;
	}
}
