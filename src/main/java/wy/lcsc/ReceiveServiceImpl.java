package wy.lcsc;
import wy.lcsc.beans.DataVO;

public class ReceiveServiceImpl implements ReceiveService{

    /**
     * 接收业务系统数据
     * @param dataVO
     * @return
     */
    @Override
    public String receiveBusinessData(DataVO dataVO) {

        // 持久化数据库（若排序组ID为null,给-1）
        this.insertTransfer(dataVO);

        // 无序消息
        if (null==dataVO.getTopicId()){

            DisOrderMessageHandler.transfer(dataVO);
        }else {

        }

        return SystemConstant.SUCCESS;
    }

   private void insertTransfer(DataVO data){

        // 判断topicId 是否存在，若不存在抛出异常，打印错误信息
       throw new RuntimeException("接收消息，topicId不存在,");// 为核查方便，需要带上源系统，

       // 排序ID若为null给-1

       // 插入
   }
}
