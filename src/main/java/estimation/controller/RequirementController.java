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
@RequestMapping(value="/estimation")
public class RequirementController {
    @Autowired
    private RequirementService requirementService;

    //增加一个新需求
    @RequestMapping(value = "/addRequirement",method = RequestMethod.POST)
    public void addRequirement() {
        requirementService.add();
    }


}
