package $ import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

{__package__}.web.repository.config;

/**
 * {@code RepositoryAutoConfigure}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Configuration
@MapperScan("${__package__}.web.repository")
public class RepositoryAutoConfigure {
}
