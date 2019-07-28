package com.libowen.cloud.config;

/**
 * 自定义Ribbon客户端
 *
 * 这个类一定不要放到启动类同目录或同目录的子目录下，也就是@SpringBootApplication注解的子注解@ComponentScan所能扫描到的地方。否则该类中的配置信息将被所有的@RibbonClient共享
 *
 * @author Bowen.Li@onerway.com
 * @date 2019/7/25
 * 说明：修改为配置文件设置ribbon规则
 */
//@Configuration
public class RibbonConfig {

    // @Bean
    // public IRule ribbonRule() {
    //     // 负载均衡规则，改为随机
    //     return new RandomRule();
    // }
}
