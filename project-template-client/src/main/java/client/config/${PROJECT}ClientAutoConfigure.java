package ${package}.client.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * {@code ${PROJECT}ClientAutoConfigure}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@ComponentScan("${package}.client")
@EnableFeignClients(basePackages = "${package}.client.feign")
@Configuration("${package}.client.config.${PROJECT}ClientAutoConfigure")
public class ${PROJECT}ClientAutoConfigure {
}
