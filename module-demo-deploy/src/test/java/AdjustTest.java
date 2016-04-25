import com.huigujia.platform.moduledemo.account.api.IAdjustOrderManager;
import com.huigujia.platform.moduledemo.account.dto.req.F831108Req;
import com.huigujia.platform.moduledemo.account.dto.res.F831108Res;
import com.huigujia.platform.moduledemo.account.pojo.AdjustOrder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

/**
 * Created by chenyun on 16/3/24.
 */
public class AdjustTest extends TestBase {

  @Resource
  private IAdjustOrderManager adjustOrderManager;

  @Test
  public void testInsert(){

    for (int i= 0;i<2;i++) {
      AdjustOrder order = new AdjustOrder();
      order.setAccountBizType("xyz");
      order.setCreateDatetime(new Date());
      boolean flag = false;
      adjustOrderManager.doGenerateAdjustOrderBean(order, flag);

    }
  }

  public void testUpdate(){

  }

  public void testDelete(){

  }

  @Test
  public void testQuery(){
    F831108Req req = new F831108Req();
    req.setLimit(8);
    F831108Req res = adjustOrderManager.queryAdjustOrderWithPage(req);
    List<F831108Res> items = res.getItems();
    Assert.assertEquals(8,items.size());

  }


}
