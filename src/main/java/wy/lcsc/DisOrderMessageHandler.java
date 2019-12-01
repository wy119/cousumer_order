package wy.lcsc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import wy.lcsc.beans.DataVO;

/**
 * 无序消息处理
 * @description:
 * @author:wy
 * @Date: 2019/12/1 16:37
 */
@Component
public class DisOrderMessageHandler {

    @Autowired
    private static RestTemplate restTemplate;

    /**
     * 发送数据到对方rocket
     * @param dataVO
     */
    public static void transferDisOrder(DataVO dataVO){
      Object result=  sent(dataVO);

      if (result.toString().equals("success")){

          // 更新transfer数据为 done
          return;
      }

      // 更新为fail，重试次数0

    }

    /**
     * 发送数据到对方rocket
     * @param dataVO
     */
    public static void reTransferDisOrder(DataVO dataVO){

        Object result=  sent(dataVO);

        if (result.toString().equals("success")){

            // 更新transfer数据为 done
            return;
        }

        // 更新为fail，重试次数+1

    }

    // 发送http请求
    private  static Object sent(DataVO dataVO){

        Object result=  restTemplate.postForObject("rocket接收数据的url",dataVO,DataVO.class);

        return result;
    }

    // 发送http请求
    private  static Object updateSucess(DataVO dataVO){

        Object result=  restTemplate.postForObject("rocket接收数据的url",dataVO,DataVO.class);

        return result;
    }

}
