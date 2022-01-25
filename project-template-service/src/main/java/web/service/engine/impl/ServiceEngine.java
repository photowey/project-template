package $ import lombok.Getter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

{__package__}.web.service.engine.impl;
        {__package__}.web.service.HelloService;
        {__package__}.web.service.engine.IServiceEngine;

/**
 * {@code ServiceEngine}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Component
@Accessors(fluent = true)
public class ServiceEngine implements IServiceEngine {

    @Getter
    @Autowired
    private HelloService helloService;
}
