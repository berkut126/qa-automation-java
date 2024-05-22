import java.time.OffsetDateTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
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
        System.out.println(message.getStatusDescription().equals(String.copyValueOf("jkl".toCharArray())));
    }
}