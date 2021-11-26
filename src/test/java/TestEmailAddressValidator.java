import com.cianmc.registrationform.EmailAddressValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestEmailAddressValidator {
    @Test
    public void testTooShort() {
        assertFalse(EmailAddressValidator.isValid(""));
    }

    @Test
    public void testNoAt() {
        assertFalse(EmailAddressValidator.isValid("gmail.com"));
    }
}
