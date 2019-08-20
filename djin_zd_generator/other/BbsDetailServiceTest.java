package com.java.zd.provider.test;

import com.java.zd.commons.entity.BbsDetailEntity;
import com.java.zd.commons.service.BbsDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 *  商品详情业务层测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BbsDetailServiceTest {

    @Resource
    private BbsDetailService bbsDetailService;

    @Test
    public void test01(){
        BbsDetailEntity pramasBbsDetail = new BbsDetailEntity();
        try {
            Map<String,Object> map = bbsDetailService.findListByPramas(1,3,pramasBbsDetail);
            System.out.println("总的数据条数："+map.get("count"));
            List<BbsDetailEntity> bbsDetails = (List<BbsDetailEntity>)map.get("data");
            for (BbsDetailEntity bbsDetail:bbsDetails) {
                System.out.println(bbsDetail);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
