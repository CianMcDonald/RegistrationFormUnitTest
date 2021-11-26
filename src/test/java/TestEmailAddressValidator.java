import com.cianmc.registrationform.EmailAddressValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmailAddressValidator {
    @Test
    public void testTooShort() {
        EmailAddressValidator email = new EmailAddressValidator();
        assertEquals(false, email.isValid(""));
    }
}
