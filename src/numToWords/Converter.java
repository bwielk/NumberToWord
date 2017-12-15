package numToWords;

public class Converter {
	
	public String run(int num){
		int number = num;
		String result = "";
		String units[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String teens[] = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixtteen", "seventeen", "eighteen", "nineteen"};
		String tens[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		if(num >= 1000000 && num < 9999999){
			int index = num/1000000;
			result = units[index] + " million";
			number -=index*1000000;
		}
		
		if(number>=1000 && number<=9999){
			int index = number/1000;
			result = units[index] + " thousand";
			number -=index*1000;
		}
		
		if(number>=100 && number<=999){
			int index = number/100;
			result = units[index] + " hundred";
			number -=index*100;
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
