import com.cianmc.registrationform.PasswordValidation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPasswordValidation {
    @Test
    public void testValidLength() {
        assertTrue(PasswordValidation.isValid("abc1&234"));
    }

    @Test
    public void testContainsLetter() {
        assertFalse(PasswordValidation.isValid("1234567"));
    }

    @Test
    public void testContainsDigit() {
        assertFalse(PasswordValidation.isValid("abcdefghij"));
    }

    @Test
    public void testContainsSpecialChar() {
        assertFalse(PasswordValidation.isValid("123ascddc3"));
    }
}
