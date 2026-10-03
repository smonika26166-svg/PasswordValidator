
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Hello@123"));
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(validator.isValid("Ab@1"));
    }

    @Test
    void testMissingUppercase() {
        assertFalse(validator.isValid("hello@123"));
    }

    @Test
    void testMissingLowercase() {
        assertFalse(validator.isValid("HELLO@123"));
    }

    @Test
    void testMissingDigit() {
        assertFalse(validator.isValid("Hello@World"));
    }

    @Test
    void testMissingSpecialCharacter() {
        assertFalse(validator.isValid("Hello123"));
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }

    @Test
    void testAnotherValidPassword() {
        assertTrue(validator.isValid("Java#2026"));
    }
}
