import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.UUID;

class IncomingOperdayMessageTest {

    @Test
    void getRequestId() {
        final UUID myUuid = UUID.fromString("0fae6253-be33-42da-af9f-19b7d1ea5b00");
        IncomingOperdayMessage message = new IncomingOperdayMessage(
                myUuid,
                "abc",
                "def",
                "ghi",
                OffsetDateTime.now(),
                3,
                "jkl"
        );
        Assertions.assertAll(
                () -> Assertions.assertEquals(
                        UUID.fromString("0fae6253-be33-42da-af9f-19b7d1ea5b00"),
                        message.getRequestId(),
                        "При вызоые конструктора неправиильно иинициализируется поле requestId"),
                () -> Assertions.assertNull(message.getNullable())
        );
    }

    @Test
    void getStatusCode() {
    }
}