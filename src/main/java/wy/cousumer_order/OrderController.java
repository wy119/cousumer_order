package wy.cousumer_order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/find/{id}")
    public String selectUser(@PathVariable Integer id) {

        return restTemplate.getForObject("http://localhost/select/"+id,String.class);
    }


    //
    @GetMapping("/log-user-instance")
    public String logUserInstance(){

        ServiceInstance instance=this.loadBalancerClient.choose("cousumer-user");

        // 打印当前选择的那个节点
      return (instance.getServiceId()+instance.getHost()+instance.getPort()).toString();
    }
}
