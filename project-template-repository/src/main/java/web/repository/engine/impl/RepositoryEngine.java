package $ import lombok.Getter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

{__package__}.web.repository.engine.impl;
        {__package__}.web.repository.engine.IRepositoryEngine;
        {__package__}.web.repository.HelloRepository;

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
