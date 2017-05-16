package estimation.DAO;

import estimation.bean.Requirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by xuawai on 03/05/2017.
 */

@Repository
public class RequirementDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void add(Requirement requirement){
        this.mongoTemplate.insert(requirement);
    }

    public Requirement getRequirement(String id){
        return mongoTemplate.findOne(new Query(Criteria.where("_id").is(id)),Requirement.class);
    }
}
