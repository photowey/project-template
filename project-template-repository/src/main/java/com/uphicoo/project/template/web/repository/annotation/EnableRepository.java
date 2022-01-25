package ${__package__}.web.repository.annotation;

import ${__package__}.web.repository.config.RepositoryAutoConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * {@code EnableRepository}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Import({RepositoryAutoConfigure .class})
public @interface EnableRepository {
}
