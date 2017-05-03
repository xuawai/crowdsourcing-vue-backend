package estimation.DAO;

import estimation.bean.Description;
import estimation.bean.Requirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by xuawai on 03/05/2017.
 */
@Repository
public class DescriptionDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void add(String id, Description description){
        Query query = new Query(Criteria.where("id").is(id));
        Update update = Update.update("projectName", description.getProjectName()).set("projectDescription", description.getProjectDescription());
        mongoTemplate.upsert(query, update, Description.class);
    }
}
