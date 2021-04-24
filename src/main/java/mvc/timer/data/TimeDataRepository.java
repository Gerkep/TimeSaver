package mvc.timer.data;

import org.springframework.stereotype.Repository;

import mvc.timer.model.TimeData;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TimeDataRepository extends JpaRepository<TimeData, Long>{

}
