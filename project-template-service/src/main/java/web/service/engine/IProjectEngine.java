package ${__package__}.web.service.engine;

import ${__package__}.web.repository.engine.IRepositoryEngine;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;

/**
 * {@code IProjectEngine}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
public interface IProjectEngine extends BeanFactoryAware, ApplicationContextAware, EnvironmentAware {

    IRepositoryEngine repositoryEngine();

    IServiceEngine serviceEngine();
}
