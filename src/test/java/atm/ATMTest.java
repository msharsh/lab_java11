package atm;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ATMTest {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);

    @Test(expected = IllegalArgumentException.class)
    public void processInvalid() {
        ATM atm = new ATM();
        atm.process(126);
    }

    @Test
    public void testProcess() {
        ATM atm = new ATM();
        System.setOut(new PrintStream(baos));
        atm.process(135);
        assertEquals(baos.toString().trim(), "Please receive 1 of 5 UAH bills.\n" +
                "Please receive 1 of 10 UAH bills.\nPlease receive 6 of 20 UAH bills.");
    }
}