package $ import org.springframework.context.annotation.Import;

{__package__}.web.repository.annotation;
        {__package__}.web.repository.config.RepositoryAutoConfigure;

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
