import org.junit.jupiter.api.Test;

public class TestPasswordValidation {
    @Test
    public void testValidLength() {
        PasswordValidation passwordValidation = new PasswordValidation();
        assertEquals(passwordValidation.isValid("1234567"));
    }
}
