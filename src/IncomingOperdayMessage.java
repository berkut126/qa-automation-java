import java.time.OffsetDateTime;
import java.util.UUID;

public class IncomingOperdayMessage {

    private final UUID requestId;
    private final String referenceId;
    private final String eventName;
    private final String description;
    private final OffsetDateTime eventDate;
    private final int statusCode;
    private final String statusDescription;
    private String nullable;

    public UUID getRequestId() {
        return requestId;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public IncomingOperdayMessage(
        UUID requestId,
        String referenceId,
        String eventName,
        String description,
        OffsetDateTime eventDate,
        int statusCode,
        String statusDescription
    ) {
        this.requestId = requestId;
        this.referenceId = referenceId;
        this.eventName = eventName;
        this.description = description;
        this.eventDate = eventDate;
        this.statusCode = statusCode;
        this.statusDescription = statusDescription;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getDescription() {
        return description;
    }

    public OffsetDateTime getEventDate() {
        return eventDate;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public String getNullable() {
        return nullable;
    }
}
