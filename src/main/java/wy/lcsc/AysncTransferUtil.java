package wy.lcsc;
import org.springframework.scheduling.annotation.Async;
import wy.lcsc.beans.Transfer;

import java.util.List;

public abstract class AysncTransferUtil {


    @Async("myTaskAsyncPool")
    public void dealWithOrderTransfer(List<Transfer> transferList){

        // 遍历发送消息 为什么要用while(ture)

        // 更新状态，若失败，等n 秒再重试，重试三次，此组后续待发送全部更新为fail等待人工处理。

    }
}
