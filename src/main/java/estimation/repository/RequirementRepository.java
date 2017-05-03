package estimation.repository;

import estimation.bean.Requirement;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by xuawai on 03/05/2017.
 */

public interface RequirementRepository extends MongoRepository<Requirement, String> {



}

