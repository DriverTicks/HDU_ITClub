package com.litesky.dao.impl;

import com.litesky.dao.RepairBillDao;
import com.litesky.model.RepairBill;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by finefine.com on 2017/8/30.
 */
@Repository
public class RepairBillDaoImpl implements RepairBillDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<RepairBill> findBillsByPid(int pid) {
        return null;
    }

    @Override
    public List<RepairBill> getAllBills() {
        return sqlSessionTemplate.selectList("com.litesky.mapper.RepairMapper.getAllBills");
    }

    @Override
    public int insertBill(RepairBill bill) {
        return sqlSessionTemplate.insert("com.litesky.mapper.RepairMapper.insertBill",bill);
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
