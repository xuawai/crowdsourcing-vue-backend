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

    @RequestMapping(value = "/ufp/{id}", method = RequestMethod.GET)
    public int calculateUFP( @PathVariable String id) {

        return fpService.calculateUFP(id);

    }

    @RequestMapping(value = "/fp/{id}", method = RequestMethod.GET)
    public int calculateFP(@PathVariable String id, @RequestBody JSONObject jsonObject){
        int ufp = jsonObject.getInt("ufp");
        //其他参数，如语言类型等等
        String language = jsonObject.getString("language");


        
        int fp = 100;
        return fp;
    }
}
