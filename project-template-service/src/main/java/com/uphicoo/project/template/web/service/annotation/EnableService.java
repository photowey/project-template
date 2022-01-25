package ${__package__}.web.service.annotation;

import ${__package__}.web.service.config.ServiceAutoConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * {@code EnableService}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Import({ServiceAutoConfigure.class})
public @interface EnableService {
}
