package rmuti.askexpert.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import rmuti.askexpert.model.table.TopicData;

import java.util.List;
import java.util.Optional;

public interface TopicDataRepository extends JpaRepository<TopicData, String> {
    //List<TopicData> findAll();
    Optional<TopicData> findByTopicId(String id);
}
