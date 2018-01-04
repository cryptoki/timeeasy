package epicdays.timeeasy.crm_access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

import java.util.Date;

@Value
public class TimeRecord {
    private final String user;
    private final String password;
    private final Date date;
    private final Integer hours;
}
