package epicdays.timeeasy.persistence.repository;

import epicdays.timeeasy.persistence.domain.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}