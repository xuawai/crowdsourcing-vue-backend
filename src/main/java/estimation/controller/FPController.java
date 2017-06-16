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

    @RequestMapping(value = "/fp/{id}", method = RequestMethod.POST)
    public int calculateFP(@PathVariable String id, @RequestBody JSONObject jsonObject){
        int ufp = fpService.calculateUFP(id);
        //其他参数，如语言类型等等
        String developmentType = jsonObject.getString("developmentType");
        String developmentPlatform = jsonObject.getString("developmentPlatform");
        String languageType = jsonObject.getString("languageType");
        String DBMS_Used = jsonObject.getString("DBMS_Used");
        //这一部分是数字，要转成float之类
        String RELY = jsonObject.getString("RELY");
        String CPLX = jsonObject.getString("CPLX");
        String TIME = jsonObject.getString("TIME");
        String SCED = jsonObject.getString("SCED");

        //算法

        int fp = 100;
        return fp;
    }
}
