package com.litesky.dao;

import com.litesky.model.RepairBill;

import java.util.List;

/**
 * Created by finefine.com on 2017/8/30.
 */
public interface RepairBillDao {

    /**
     * 通过维修员id查找属于他的维修单
     * @param pid 维修员id
     * @return
     */
    List<RepairBill> findBillsByPid(int pid);

    /*
     *得到所有bill，只有管理员才能使用
     */
    List<RepairBill> getAllBills();


    /**
     * 插入一条维修单
     * @param bill
     * @return
     */
    int insertBill(RepairBill bill);

    /**
     * 删除一条bill，仅限管理员
     * @param id
     * @return
     */
    int deleteBillById(int id);

    /**
     * 更新bill
     * @param bill
     * @return
     */
    int updateBill(RepairBill bill);


}
