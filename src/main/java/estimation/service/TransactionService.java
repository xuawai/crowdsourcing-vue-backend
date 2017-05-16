package estimation.service;

import estimation.DAO.RequirementDAO;
import estimation.DAO.TransactionDAO;
import estimation.bean.Entity;
import estimation.bean.Requirement;
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

    @Autowired
    private RequirementDAO requirementDAO;

    public void add(String id, Transaction transaction) {
        this.transactionDAO.add(id, transaction);
    }

    public void deleteArray(String id, String key) {
        this.transactionDAO.deleteArray(id, key);
    }

    //读取某需求所有的transaction信息
    public List<Transaction> getAllTransactions(String id){
        Requirement requirement = this.requirementDAO.getRequirement(id);
        return requirement.getTransactions();
    }
}
