package ${package}.web.service.config;

import ${package}.web.repository.annotation.EnableRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * {@code ServiceAutoConfigure}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Configuration
@EnableRepository
@ComponentScan("${package}.web.service")
public class ServiceAutoConfigure {

}
