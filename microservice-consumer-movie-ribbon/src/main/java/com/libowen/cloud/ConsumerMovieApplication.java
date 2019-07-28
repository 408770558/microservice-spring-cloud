package com.libowen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
// @ComponentScan(basePackages = {"com.libowen.cloud"},
//         //当某些类不希望被@ComponentScan扫描到时，可以通过excludeFilters设置排除。代码如下
//         excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = RibbonConfig.class)})
// //自定义ribbon规则 针对单个applicationName配置
// @RibbonClient(name = "microservice-provider-user", configuration = RibbonConfig.class)
public class ConsumerMovieApplication {

    @Bean
    //开启负载均衡
    // W标记这个restTemplate 用LoadBalancerClient配置LoadBalancerClient接口同包有个LoadBalancerAutoConfiguration类 它是用来负载均衡自动化配置的
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMovieApplication.class, args);
    }

}
