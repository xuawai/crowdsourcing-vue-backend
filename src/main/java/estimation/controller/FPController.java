package estimation.controller;

import estimation.service.FPService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by xuawai on 15/05/2017.
 */
@RestController
@RequestMapping(value = "/fp")
public class FPController {

    @Autowired
    FPService fpService;

    @RequestMapping(value = "/ufp/{id}", method = RequestMethod.POST)
    public void calculateUFP( @PathVariable String id) {
        fpService.calculateUFP(id);
    }
}
