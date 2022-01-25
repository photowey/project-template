package $ import $;
import org.springframework.context.annotation.Import;

{__package__}.client.annotation;
        {__package__}.client.config.ProjectTemplateClientAutoConfigure;

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
