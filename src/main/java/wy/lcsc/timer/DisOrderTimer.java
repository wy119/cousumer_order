package wy.lcsc.timer;
import wy.lcsc.beans.DataVO;
import wy.lcsc.DisOrderMessageHandler;
import wy.lcsc.beans.Transfer;

import java.util.ArrayList;
import java.util.List;

public class DisOrderTimer {

    public void dealFail(){
        
        List<Transfer> transferList=new ArrayList<>();

        for (Transfer transfer:transferList) {

            DataVO dataVO=this.packageDataVO(transfer);

            DisOrderMessageHandler.reTransferDisOrder(dataVO);
        }

    }

    public void dealWaiting(){

    }

    private DataVO packageDataVO(Transfer transfer){

        DataVO dataVO=new DataVO();

        return dataVO;
    }

    private List<Transfer> getFail(){

        // 查询失败的所有的
        return null;
    }
}
