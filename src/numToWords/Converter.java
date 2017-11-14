package numToWords;

public class Converter {
	
	public String run(int num){
		String result = "";
		String units[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String teens[] = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixtteen", "seventeen", "eighteen", "nineteen"};
		if(num <=9){
			result = units[num];
		}
		else if(num >=10 && num <20){
			result = teens[num-10];
		}
		return result;
	}
}
