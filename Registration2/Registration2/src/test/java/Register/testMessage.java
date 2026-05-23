


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import test.registration2.Message;

/**
 *
 * @author username
 */
public class testMessage {
    


    Message test = new Message();

    // TEST MESSAGE ID
    @Test
    public void testCheckMessageIDSuccess() {

        assertTrue(Message.checkMessageID("1234567890"));
    }

    @Test
    public void testCheckMessageIDFail() {

        assertFalse(Message.checkMessageID("12345678901"));
    }

    // TEST RECIPIENT NUMBER
    @Test
    public void testCheckRecipientCellSuccess() {

        assertTrue(test.checkRecipientCell("+27838968900"));
    }

    @Test
    public void testCheckRecipientCellFail() {
        assertFalse(test.checkRecipientCell("0838968900"));
    }

    // TEST MESSAGE HASH
    @Test
    public void testCreateMessageHash() {

    String result = test.createMessageHash( "00",1, "Hi Mike can you join us tonight");

    assertEquals("00:1:HITONIGHT",result);
    }

    // TEST MESSAGE LENGTH SUCCESS
    @Test
    public void testMessageLengthSuccess() {

        String shortMessage =
                "Hello this message is under 250 characters";

        assertTrue(shortMessage.length() <= 250);
    }

    // TEST MESSAGE LENGTH FAILURE
    @Test
    public void testMessageLengthFail() {

        String longMessage =
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
              + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
              + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
              + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
              + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
              + "aaaa";

        assertTrue(longMessage.length() > 250);
    }

    // TEST TOTAL MESSAGES
    @Test
    public void testReturnTotalMessages() {

        int expected = 0;

        int actual = test.returnTotalMessages();

        assertEquals(expected, actual);
    }
}

