package estimation.controller;

import estimation.DAO.RequirementDAO;
import estimation.bean.Description;
import estimation.service.DescriptionService;
import estimation.service.RequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.sf.json.JSONObject;
/**
 * Created by xuawai on 03/05/2017.
 */
@RestController
//@RequestMapping(value="/estimation")
public class RequirementController {
    @Autowired
    private RequirementService requirementService;

    @Autowired
    private DescriptionService descriptionService;

    @RequestMapping(value = "/addRequirement",method = RequestMethod.POST)
    public void addRequirement() {
        requirementService.add(null);
    }

    //@GetMapping(value = "/test")
    @RequestMapping(value = "/test2")
    public String test() {

        return "success";
    }

    @RequestMapping(value = "/addDescription/{id}",method = RequestMethod.POST)
    public void addDescription(@RequestBody JSONObject jsonObject, @PathVariable String id) {
        String projectName = jsonObject.getString("projectName");
        String projectDescription = jsonObject.getString("projectDescription");
        Description description = new Description();
        description.setProjectName(projectName);
        description.setProjectDescription(projectDescription);
        descriptionService.add(id, description);
    }
}
