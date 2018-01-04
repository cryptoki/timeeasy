package epicdays.timeeasy.crm_access;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Date;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(JUnit4.class)
public class SuiteCRMServiceTest {

    SuiteCRMService suiteCRMService = new SuiteCRMService();

    @Test
    public void save_a_time_record_in_SuiteCRM() {
        TimeRecord timeRecord = new TimeRecord("klaus","geheim", new Date(System.currentTimeMillis()), 8);
        suiteCRMService.bookTimeRecord(timeRecord);
        assertTrue(true);
    }
}
