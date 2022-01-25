package ${__package__}.web.service.config;

import ${__package__}.web.repository.annotation.EnableRepository;
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
@ComponentScan("${__package__}.web.service")
public class ServiceAutoConfigure {

}
