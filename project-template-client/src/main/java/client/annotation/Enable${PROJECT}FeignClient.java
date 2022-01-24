package ${package}.client.annotation;

import ${package}.client.config.ProjectTemplateClientAutoConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * {@code Enable${PROJECT}FeignClient}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Import({${PROJECT}ClientAutoConfigure.class})
public @interface Enable${PROJECT}FeignClient {
}
