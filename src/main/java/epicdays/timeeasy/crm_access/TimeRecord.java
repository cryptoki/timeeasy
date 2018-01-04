package epicdays.timeeasy.crm_access;

import lombok.Data;

import java.util.Date;

@Data
public class TimeRecord {
    private Date date;
    private Integer hours;
    private String user;
    private String password;

    public TimeRecord (String user, String password, Date date, Integer hours) {
        this.user = user;
        this.password = password;
        this.date = date;
        this.hours = hours;
    }
}
