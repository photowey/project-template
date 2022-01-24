package ${package}.web.repository.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * {@code RepositoryAutoConfigure}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Configuration
@MapperScan("${package}.web.repository")
public class RepositoryAutoConfigure {
}
