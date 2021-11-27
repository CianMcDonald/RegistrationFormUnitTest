import com.cianmc.registrationform.PasswordValidation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPasswordValidation {
    @Test
    public void testValidLength() {
        PasswordValidation passwordValidation = new PasswordValidation();
        assertEquals(true, passwordValidation.isValid("1234567"));
    }
}
