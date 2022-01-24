package ${package}.web.service.engine.impl;

import ${package}.web.service.HelloService;
import ${package}.web.service.engine.IServiceEngine;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
