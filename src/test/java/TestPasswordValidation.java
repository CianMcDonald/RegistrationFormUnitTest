import com.cianmc.registrationform.PasswordValidation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPasswordValidation {
    @Test
    public void testValidLength() {
        assertTrue(PasswordValidation.isValid("1234567"));
    }
}
