package estimation.service;

import estimation.DAO.EntityDAO;
import estimation.bean.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuawai on 04/05/2017.
 */
@Service
public class EntityService {
    @Autowired
    private EntityDAO entityDAO;

    public void add(String id, Entity entity) {
        this.entityDAO.add(id, entity);
    }

    public void deleteArray(String id, String key) {
        this.entityDAO.deleteArray(id, key);
    }
}
