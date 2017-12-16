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
	public void turns21000000IntoTwentyOneMillion(){
		assertEquals("twenty one million", converter.run(21000000));
		assertEquals("thirty million", converter.run(30000000));
		assertEquals("forty two million", converter.run(42000000));
		assertEquals("fifty three million", converter.run(53000000));
		assertEquals("sixty four million", converter.run(64000000));
		assertEquals("sixty nine million", converter.run(69000000));
		assertEquals("seventy million", converter.run(70000000));
		assertEquals("eighty nine million", converter.run(89000000));
		assertEquals("ninety two million", converter.run(92000000));
		assertEquals("ninety five million", converter.run(95000000));
		assertEquals("ninety nine million", converter.run(99000000));
	}
	
	@Test
	public void turns112000000IntoOneHundredAndTwelveMillion(){
		assertEquals("one hundred and twenty one million", converter.run(121000000));
		assertEquals("two hundred and thirty million", converter.run(230000000));
		assertEquals("three hundred and forty two million", converter.run(342000000));
		assertEquals("four hundred and fifty three million", converter.run(453000000));
		assertEquals("five hundred and sixty four million", converter.run(564000000));
		assertEquals("six hundred and sixty nine million", converter.run(669000000));
		assertEquals("seven hundred and seventy million", converter.run(770000000));
		assertEquals("eight hundred and eighty nine million", converter.run(889000000));
		assertEquals("nine hundred and ninety two million", converter.run(992000000));
		assertEquals("one hundred and ninety five million", converter.run(195000000));
		assertEquals("nine hundred and ninety nine million", converter.run(999000000));
	}
	
	@Test
	public void turns15000000IntoFifteenMillion(){
		assertEquals("fifteen million", converter.run(15000000));
		assertEquals("sixteen million", converter.run(16000000));
		assertEquals("seventeen million", converter.run(17000000));
		assertEquals("eighteen million", converter.run(18000000));
		assertEquals("nineteen million", converter.run(19000000));
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
		assertEquals("four hundred and ninety two thousand and nine", converter.run(492009));
		assertEquals("five hundred and twenty one thousand one hundred and twenty three", converter.run(521123));
		assertEquals("six hundred thousand and one", converter.run(600001));
		assertEquals("nine hundred thousand four hundred and thirty one", converter.run(900431));
		assertEquals("one hundred thousand and twenty one", converter.run(100021));
		assertEquals("eight hundred and thirty three thousand three hundred and thirty one", converter.run(833331));
		assertEquals("seven hundred and nine thousand one hundred and two", converter.run(709102));
		assertEquals("three hundred and three thousand one hundred and ninety three", converter.run(303193));
		assertEquals("eight hundred and twelve thousand eight hundred and thirteen", converter.run(812813));
		assertEquals("one hundred and one thousand one hundred and one", converter.run(101101));
		assertEquals("two hundred and thirty four thousand and one", converter.run(234001));
	}
	
	@Test
	public void transaltesNumbersBetween1000000and9999999(){
		assertEquals("one million two hundred and thirty four thousand five hundred and sixty seven",converter.run(1234567));
		assertEquals("two million and one",converter.run(2000001));
		assertEquals("three million twelve thousand three hundred and two",converter.run(3012302));
		assertEquals("four million one hundred and twenty nine thousand and two",converter.run(4129002));
		assertEquals("five million two thousand one hundred and twenty",converter.run(5002120));
		assertEquals("six million twenty nine thousand and two",converter.run(6029002));
		assertEquals("seven million seven hundred and seventy seven thousand seven hundred and seventy seven",converter.run(7777777));
		assertEquals("eight million twenty two thousand three hundred and ten",converter.run(8022310));
		assertEquals("nine million nine hundred thousand and nine",converter.run(9900009));
	}
	
	@Test
	public void transaltesNumbersFrom10000000To19999999(){
		assertEquals("ten million", converter.run(10000000));
		assertEquals("ten million two hundred and thirty four thousand and one", converter.run(10234001));
		assertEquals("eleven million and one", converter.run(11000001));
		assertEquals("twelve million and twenty one", converter.run(12000021));
		assertEquals("thirteen million five hundred and one", converter.run(13000501));
		assertEquals("fourteen million three thousand and sixty one", converter.run(14003061));
		assertEquals("fifteen million thirty four thousand and one", converter.run(15034001));
		assertEquals("sixteen million two hundred and thirty four thousand one hundred and thirty two", converter.run(16234132));
		assertEquals("seventeen million eight hundred and thirty four thousand one hundred and thirty two", converter.run(17834132));
		assertEquals("eighteen million nine hundred and thirty thousand three hundred and thirty", converter.run(18930330));
		assertEquals("nineteen million six hundred and four thousand nine hundred and ninety nine", converter.run(19604999));
	}
	
	@Test
	public void transaltesNumbersFrom20000000To99999999(){
		assertEquals("twenty one million and twenty one", converter.run(21000021));
		assertEquals("thirty two million three hundred and twenty three", converter.run(32000323));
		assertEquals("forty three million seven thousand six hundred and thirty two", converter.run(43007632));
		assertEquals("fifty four million ten thousand and ten", converter.run(54010010));
		assertEquals("sixty million two hundred and thirty four thousand and forty one", converter.run(60234041));
		assertEquals("seventy six million nine hundred and ninety thousand two hundred and fifteen", converter.run(76990215));
		assertEquals("eighty three million two hundred and twenty three thousand five hundred and five", converter.run(83223505));
		assertEquals("ninety eight million nine hundred and eighty four thousand two hundred and twenty one"	+ "", converter.run(98984221));
		assertEquals("ninety nine million nine thousand nine hundred and ninety", converter.run(99009990));	
		assertEquals("ten million one hundred thousand and one", converter.run(10100001));	
	}
	
	@Test
	public void translatesNumbersFrom100000000to999999999MAX(){
		assertEquals("one hundred and eleven million and eleven", converter.run(111000011));
		assertEquals("one hundred million and two", converter.run(100000002));
		assertEquals("two hundred and one million and twenty three", converter.run(201000023));
		assertEquals("three hundred and twelve million three hundred and seven thousand one hundred and sixty six", converter.run(312307166));
		assertEquals("four hundred and fifty six million eighty thousand nine hundred and eighty one", converter.run(456080981));
		assertEquals("five hundred and fifty one million fifty five thousand two hundred", converter.run(551055200));
		assertEquals("six hundred and seventy million nine hundred and thirty four thousand four", converter.run(670934004));
		assertEquals("seven hundred and seventy one million fifty four thousand nine hundred and ninety nine", converter.run(771054999));
		assertEquals("seven hundred and ninety eight million one hundred and one thousand three hundred and twenty", converter.run(798101320));
		assertEquals("nine hundred and ninety nine million ninety thousand and twenty three", converter.run(999090023));
		assertEquals("eight hundred and eighty eight million one thousand and eleven", converter.run(888001011));
		assertEquals("five hundred and eighty eight million two hundred and twenty one thousand and ninety three", converter.run(588221093));
	}
}
