package com.liu.start.index;

import com.liu.start.dao.ScsDeliveryTimeMapper;
import com.liu.start.entity.ScsDeliveryTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import com.liu.start.SpringTestBase;

/**
 * Created by liufangrui on 2018/10/24.
 */
public class IndexTest extends SpringTestBase{
    @Autowired
    private ScsDeliveryTimeMapper scsDeliveryTimeMapper;

    @Test
    public void testStart(){

        List<ScsDeliveryTime> list = new ArrayList<ScsDeliveryTime>();
        ScsDeliveryTime line = new ScsDeliveryTime();
        line.setCarrierId("A3A");
        line.setCount(10);
        list.add(line);
        scsDeliveryTimeMapper.batchInsert(list);
    }
}
