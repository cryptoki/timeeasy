package epicdays.timeeasy.controller

import epicdays.timeeasy.persistence.domain.Activity
import epicdays.timeeasy.persistence.repository.ActivityRepository
import spock.lang.Specification

class ActivityControllerSpec extends Specification {

    private ActivityRepository activityRepository = Mock()

    private ActivityController controller = new ActivityController(
            repository: activityRepository
    )


    def "get request" () {
        given:
        String bla = ""

        when:
        Collection<Activity> result = controller.createDeliverer();

        then: "expected methods where called"
        result == null
    }
}
