package $ import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

{__package__}.client.config;

/**
 * {@code ${PROJECT}ClientAutoConfigure}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@ComponentScan("${__package__}.client")
@EnableFeignClients(basePackages = "${__package__}.client.feign")
@Configuration("${__package__}.client.config.${PROJECT}ClientAutoConfigure")
public class ${PROJECT}ClientAutoConfigure {
}
