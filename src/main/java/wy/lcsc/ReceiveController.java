package wy.lcsc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import wy.lcsc.beans.DataVO;

import javax.xml.crypto.Data;

@RestController
public class ReceiveController {

    private ReceiveService receiveService;

    public String receiveBusinessData(DataVO data){

       return this.receiveService.receiveBusinessData(data);

    }
    public void receiveRocketData(){


    }
}
