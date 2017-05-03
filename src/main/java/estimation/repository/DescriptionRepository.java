package estimation.repository;

import estimation.bean.Description;
import estimation.bean.Requirement;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by xuawai on 03/05/2017.
 */
public interface DescriptionRepository extends MongoRepository<Description, String> {



}
