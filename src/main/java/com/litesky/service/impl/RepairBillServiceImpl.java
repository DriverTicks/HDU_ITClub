package com.litesky.service.impl;

import com.litesky.dao.RepairBillDao;
import com.litesky.model.RepairBill;
import com.litesky.service.RepairBillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by finefine.com on 2017/8/30.
 */

@Service
public class RepairBillServiceImpl implements RepairBillService{

    @Resource
    private RepairBillDao repairBillDao;

    @Override
    public List<RepairBill> findBillsByPid(int pid) {
        return null;
    }

    @Override
    public List<RepairBill> getAllBills() {
        return repairBillDao.getAllBills();
    }

    @Override
    public int insertBill(RepairBill bill) {
        return repairBillDao.insertBill(bill);
    }

    @Override
    public int deleteBillById(int id) {
        return 0;
    }

    @Override
    public int updateBill(RepairBill bill) {
        return 0;
    }
}
