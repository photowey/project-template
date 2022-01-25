package $ import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

{__package__}.web.service.config;
        {__package__}.web.repository.annotation.EnableRepository;

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
