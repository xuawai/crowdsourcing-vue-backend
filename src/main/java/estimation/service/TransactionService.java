package estimation.service;

import estimation.DAO.TransactionDAO;
import estimation.bean.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xuawai on 03/05/2017.
 */
@Service
public class TransactionService {
    @Autowired
    private TransactionDAO transactionDAO;

    public void add(String id, Transaction transaction) {
        this.transactionDAO.add(id, transaction);
    }

    public void deleteArray(String id, String key) {
        this.transactionDAO.deleteArray(id, key);
    }
}
