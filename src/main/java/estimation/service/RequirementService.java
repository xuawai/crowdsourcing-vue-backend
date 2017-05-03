package estimation.service;

import estimation.DAO.RequirementDAO;
import estimation.bean.Description;
import estimation.bean.Requirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuawai on 03/05/2017.
 */
@Service
public class RequirementService {
    @Autowired
    private RequirementDAO requirementDAO;

    public void add(Requirement requirement){

        Description description = new Description();
        description.setProjectName("");
        description.setProjectDescription("");
        requirement.setDescription(description);
        this.requirementDAO.add(requirement);
    }
}
