package ${__package__}.web.repository.engine.impl;

import ${__package__}.web.repository.engine.IRepositoryEngine;
import ${__package__}.web.repository.HelloRepository;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * {@code RepositoryEngine}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Component
@Accessors(fluent = true)
public class RepositoryEngine implements IRepositoryEngine {

    @Getter
    @Autowired
    private HelloRepository helloRepository;
}
