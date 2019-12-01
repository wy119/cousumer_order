package wy.cousumer_order;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 *  大概意思就是这个服务就使用这个ribbon配置了，下面配置了，服务名，配置类名
 * @author:wy
 * @Date: 2019/6/16 18:47
 */
@Configuration
@RibbonClient(name = "cousumer-order",configuration = RibbonConfiguration.class)
public class OrderRibbonConfiguration {

}
