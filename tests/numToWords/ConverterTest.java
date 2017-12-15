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
		int num = 2;
		assertEquals("two", converter.run(num));
	}
	
	@Test
	public void turn0intoZero(){
		int num = 0;
		assertEquals("zero", converter.run(num));
	}
	
	@Test
	public void turn10intoTen(){
		int num = 10;
		assertEquals("ten", converter.run(num));
	}
	
	@Test
	public void turn19intoNineteen(){
		int num = 19;
		assertEquals("nineteen", converter.run(num));
	}
	
	@Test
	public void turn21intoTwentyOne(){
		assertEquals("twenty one", converter.run(21));
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
	}
	
	@Test
	public void turns3000intoThreeThousand(){
		assertEquals("three thousand", converter.run(3000));
	}
	
	@Test
	public void turns600intoSixHundred(){
		assertEquals("six hundred", converter.run(600));
	}
	
	@Test
	public void turns99IntoNinetyNine(){
		assertEquals("ninety nine", converter.run(99));
	}

}
