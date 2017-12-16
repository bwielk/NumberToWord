package numToWords;

import java.util.StringJoiner;

public class Converter {
	
	public String run(int num){
		int number = num;
		StringJoiner result = new StringJoiner(" ");
		String units[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String teens[] = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String tens[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		if(number >= 100000000 && number <= 999999999){
			int index = number/100000000;
			if(number/1000000 >= 100 && number/1000000 <= 999){
				result.add(units[(number/1000000)/100]);
			}else{
				result.add(units[index]).add("hundred million");
			}
			
		}
		
		if(number >= 20000000 && number <= 99999999){
			int numberBetween20and99 = number/1000000;
			result.add(tens[numberBetween20and99/10]);
			if(numberBetween20and99%10 != 0){
				result.add(units[numberBetween20and99%10]);
			}
			result.add("million");
			number -= numberBetween20and99*10000000;
		}
		
		if(number >= 10000000 && number <= 19999999){
			int index = (number/1000000)%10;
			result.add(teens[index]).add("million");
			number -= (index*10)*1000000;
		}
		
		if(number >= 1000000 && number <= 9999999){
			int index = number/1000000;
			result.add(units[index]).add("million");
			number -=index*1000000;
			if(number < 100 && number !=0){
				result.add("and");
			}
		}
		
		if(number >= 100000 && number <= 999999){
			if(number/1000 >= 100 && number/1000 <= 999 && number%100000 >= 1000 && number%100000 <= 99999){
				int index = number/100000;
				result.add(units[index]).add("hundred and");
				number -= index*100000;
			}else{
				int index = number/100000;
				result.add(units[index]).add("hundred thousand");
				number -= index*100000;
				if(number < 100 && number !=0){
					result.add("and");
				}
			}
		}
		
		if(number >= 20000 && number <= 99999){
			int numberBetween20And99 = number/1000;
			result.add(tens[numberBetween20And99/10]);
			if(numberBetween20And99%10 != 0){
				result.add(units[numberBetween20And99%10]);
			}
			result.add("thousand");
			number -= numberBetween20And99*1000;
			if(number !=0 && number <100){
				result.add("and");
			}
		}
		
		if(number >= 10000 && number <= 19999){
			int index = (number%10000)/1000;
			result.add(teens[index]).add("thousand");
			number -= (10000+((index)*1000));
		}
		
		if(number >= 1000 && number <= 9999){
			int index = number/1000;
			result.add(units[index]).add("thousand");
			number -=index*1000;
			if(number != 0 && number<100){
				result.add("and");
			}
		}
		
		if(number >= 100 && number <= 999){
			int index = number/100;
			result.add(units[index]).add("hundred");
			number -=index*100;
			if(number != 0){
				result.add("and");
			}
		}
		
		if(number >= 20 && number <= 99){
			int index = number/10;
			result.add(tens[index]);
			number -=index*10;
		}
		
		if(number >= 10 && number <= 19){
			int index = number%10;
			result.add(teens[index]);
			number -= number;
		}
		
		if(number >= 1 && number <= 9){
			result.add(units[number]);
			number -=number;
		}
		
		if(num == 0){
			return units[0];
		}
		
		return result.toString();
	}
}
