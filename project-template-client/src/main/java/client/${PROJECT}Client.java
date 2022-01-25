package $ import $;
import org.springframework.stereotype.Component;

{__package__}.client;
        {__package__}.client.feign.${PROJECT}FeignClient;

/**
 * {@code ${PROJECT}Client}
 * 项目-子 {@code Client}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Component
public class ${PROJECT}Client {

    private final ${PROJECT}FeignClient feignClient;

    public ${PROJECT}Client(${PROJECT}FeignClient feignClient) {
        this.feignClient = feignClient;
    }
}
