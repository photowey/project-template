package $ import org.springframework.context.annotation.Import;

{__package__}.web.service.annotation;
        {__package__}.web.service.config.ServiceAutoConfigure;

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
