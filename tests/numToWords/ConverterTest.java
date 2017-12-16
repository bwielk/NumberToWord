package numToWords;

import static org.junit.Assert.*;
import static org.junit.Before.*;

import org.junit.Before;
import org.junit.Test;

public class ConverterTest {
	
	private Converter converter;
	
	@Before
	public void before(){
	converter = new Converter();
	}
	
	@Test
	public void turn2intoTwo(){
		assertEquals("two", converter.run(2));
		assertEquals("three", converter.run(3));
		assertEquals("four", converter.run(4));
		assertEquals("five", converter.run(5));
	}
	
	@Test
	public void turn0intoZero(){
		assertEquals("zero", converter.run(0));
	}
	
	@Test
	public void turn10intoTen(){
		assertEquals("ten", converter.run(10));
	}
	
	@Test
	public void turnTeensintoWords(){
		assertEquals("nineteen", converter.run(19));
		assertEquals("eighteen", converter.run(18));
		assertEquals("seventeen", converter.run(17));
		assertEquals("fourteen", converter.run(14));
		assertEquals("twelve", converter.run(12));
		assertEquals("eleven", converter.run(11));
	}
	
	
	@Test
	public void turns10sIntoTens(){
		assertEquals("thirty", converter.run(30));
		assertEquals("forty", converter.run(40));
		assertEquals("fifty", converter.run(50));
		assertEquals("sixty", converter.run(60));
		assertEquals("seventy", converter.run(70));
		assertEquals("eighty", converter.run(80));
		assertEquals("ninety", converter.run(90));
	}
	
	@Test
	public void turns9000000intoNineMillion(){
		assertEquals("nine million", converter.run(9000000));
		assertEquals("eight million", converter.run(8000000));
		assertEquals("seven million", converter.run(7000000));
		assertEquals("six million", converter.run(6000000));
		assertEquals("five million", converter.run(5000000));
		assertEquals("four million", converter.run(4000000));
	}
	
	@Test
	public void turns3000intoThreeThousand(){
		assertEquals("three thousand", converter.run(3000));
		assertEquals("four thousand", converter.run(4000));
		assertEquals("five thousand", converter.run(5000));
		assertEquals("six thousand", converter.run(6000));
		assertEquals("seven thousand", converter.run(7000));
		assertEquals("eight thousand", converter.run(8000));
		assertEquals("nine thousand", converter.run(9000));
	}
	
	@Test
	public void turns600intoSixHundred(){
		assertEquals("six hundred", converter.run(600));
		assertEquals("five hundred", converter.run(500));
		assertEquals("four hundred", converter.run(400));
		assertEquals("three hundred", converter.run(300));
		assertEquals("two hundred", converter.run(200));
		assertEquals("one hundred", converter.run(100));
		assertEquals("nine hundred", converter.run(900));
	}
	
	@Test
	public void turns99IntoNinetyNine(){
		assertEquals("ninety nine", converter.run(99));
		assertEquals("eighty eight", converter.run(88));
		assertEquals("seventy one", converter.run(71));
		assertEquals("sixty five", converter.run(65));
		assertEquals("fifty four", converter.run(54));
		assertEquals("forty three", converter.run(43));
		assertEquals("thirty four", converter.run(34));
		assertEquals("twenty one", converter.run(21));
		assertEquals("twenty", converter.run(20));
	}
	
	@Test
	public void turns300000IntoThreeHundredThousand(){
		assertEquals("three hundred thousand", converter.run(300000));
		assertEquals("four hundred thousand", converter.run(400000));
		assertEquals("five hundred thousand", converter.run(500000));
		assertEquals("six hundred thousand", converter.run(600000));
		assertEquals("seven hundred thousand", converter.run(700000));
		assertEquals("eight hundred thousand", converter.run(800000));
		assertEquals("nine hundred thousand", converter.run(900000));
	}
	
	@Test
	public void turns13000IntoThirteenThousand(){
		assertEquals("thirteen thousand", converter.run(13000));
		assertEquals("fourteen thousand", converter.run(14000));
		assertEquals("fifteen thousand", converter.run(15000));
		assertEquals("sixteen thousand", converter.run(16000));
		assertEquals("seventeen thousand", converter.run(17000));
		assertEquals("eighteen thousand", converter.run(18000));
		assertEquals("nineteen thousand", converter.run(19000));
	}
	
	@Test
	public void turns35000IntoThirtyFiveThousand(){
		assertEquals("thirty one thousand", converter.run(31000));
		assertEquals("forty six thousand", converter.run(46000));
		assertEquals("fifty eight thousand", converter.run(58000));
		assertEquals("sixty seven thousand", converter.run(67000));
		assertEquals("seventy five thousand", converter.run(75000));
	}
	
	@Test
	public void turnsHundredsWithTeensAndTensIntoWords(){
		assertEquals("one hundred and one", converter.run(101));
		assertEquals("one hundred and twelve", converter.run(112));
		assertEquals("two hundred and twenty one", converter.run(221));
		assertEquals("three hundred and thirty", converter.run(330));
		assertEquals("four hundred and ninety eight", converter.run(498));
		assertEquals("five hundred and eight", converter.run(508));
		assertEquals("six hundred and fifty", converter.run(650));
		assertEquals("seven hundred and eleven", converter.run(711));
		assertEquals("eight hundred and ten", converter.run(810));
		assertEquals("nine hundred and ninety nine", converter.run(999));
	}
	
	@Test
	public void translatesNumbersBetween1000and9999(){
		assertEquals("one thousand three hundred and sixty five", converter.run(1365));
		assertEquals("two thousand four hundred and one", converter.run(2401));
		assertEquals("three thousand and eleven", converter.run(3011));
		assertEquals("five thousand and sixty nine", converter.run(5069));
		assertEquals("six thousand seven hundred and eighty nine", converter.run(6789));
		assertEquals("seven thousand eight hundred and five", converter.run(7805));
		assertEquals("eight thousand one hundred and eighteen", converter.run(8118));
		assertEquals("eight thousand eight hundred and seventy three", converter.run(8873));
		assertEquals("one thousand and fifty one", converter.run(1051));
	}
	
	@Test
	public void translatesNumbersBetween10000and99999(){
		assertEquals("eleven thousand two hundred and thirty four", converter.run(11234));
		assertEquals("twenty five thousand six hundred and seventy eight", converter.run(25678));
		assertEquals("thirty thousand two hundred and one", converter.run(30201));
		assertEquals("forty five thousand nine hundred and ninety one", converter.run(45991));
		assertEquals("fifty nine thousand and twenty", converter.run(59020));
		assertEquals("sixty eight thousand eight hundred and twenty three", converter.run(68823));
		assertEquals("seventy four thousand six hundred and sixty one", converter.run(74661));
	}
	
	@Test
	public void translatesNumbersBetween100000and999999(){
		assertEquals("one hundred and twelve thousand three hundred and forty five", converter.run(112345));
		assertEquals("two hundred and eighty seven thousand three hundred and one", converter.run(287301));
		assertEquals("three hundred and three thousand one hundred and ninety three", converter.run(303193));
		assertEquals("four hundred and ninety two thousand and nine", converter.run(492009));
		assertEquals("five hundred and twenty one thousand one hundred and twenty three", converter.run(521123));
		assertEquals("six hundred thousand and one", converter.run(600001));
		assertEquals("seven hundred and nine thousand one hundred and two", converter.run(709102));
		assertEquals("eight hundred and thirty three thousand three hundred and thirty one", converter.run(833331));
	}
}
