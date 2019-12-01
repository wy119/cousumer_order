package wy.lcsc;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import wy.lcsc.beans.Transfer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 有序消息处理
 * @description:
 * @author:wy
 * @Date: 2019/12/1 16:37
 */
public class OrderMessageHandler {

    // 不是很清晰。。。

    // 从数据库查n条消息，按topic 分组，按业务发起时间排序
    private static Map<Integer,List<Transfer>> getOrderTransfer(){
        // map<topic，transferList>
        return null;
    }

    @Autowired
    private AysncTransferUtil aysncTransferUtil;

    // 把这n条按topic多线程处理，处理完之后再放n条,  topic 新来的消息怎么处理？
    public void transferOrder(Map<Integer,List<Transfer>> map){

        for (Map.Entry<Integer,List<Transfer>> map1 :map.entrySet()) {

            aysncTransferUtil.dealWithOrderTransfer(map1.getValue());
        }
    }






}
