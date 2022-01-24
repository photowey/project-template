package ${package}.client;

import ${package}.client.feign.${PROJECT}FeignClient;
import org.springframework.stereotype.Component;

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
