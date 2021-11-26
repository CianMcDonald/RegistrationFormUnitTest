import org.junit.jupiter.api.Test;

public class TestEmailAddressValidator {
    @Test
    public void testTooShort() {
        EmailAddressValidator email = new EmailAddressValidator();
        assertEquals(false, email.isValid(""));
    }
}
