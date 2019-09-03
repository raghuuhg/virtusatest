package wordconverter;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.virtusa.interview.test.tool.NumberToWord;
import com.virtusa.interview.test.tool.exception.NotaNumberException;

public class NumberToWordTests {
	
	@Test
	public void convertToWord() throws NotaNumberException {
		NumberToWord numToWord = new NumberToWord();
		String value = numToWord.convert("100");
		Assertions.assertNotNull(value);
		
		assertTrue(value.trim().length() > 1);
		
	}
}
