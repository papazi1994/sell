package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public  class OrderMasterRepositoryTest {

    @Autowired
    private  OrderMasterRepository repository;

    public void  saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyerName("小玄");
        orderMaster.setBuyerPhone("15623134665");
        


    }


}
