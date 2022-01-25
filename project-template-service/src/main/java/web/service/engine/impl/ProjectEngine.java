package ${__package__}.web.service.engine.impl;

import ${__package__}.web.service.engine.IProjectEngine;
import ${__package__}.web.repository.engine.IRepositoryEngine;
import ${__package__}.web.service.engine.IServiceEngine;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * {@code ProjectEngine}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Component
@Accessors(fluent = true)
public class ProjectEngine implements IProjectEngine {

    @Getter
    @Autowired
    private IServiceEngine serviceEngine;

    @Getter
    @Autowired
    private IRepositoryEngine repositoryEngine;

    @Getter
    private ListableBeanFactory beanFactory;
    @Getter
    private ConfigurableApplicationContext applicationContext;
    @Getter
    private Environment environment;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = (ListableBeanFactory) beanFactory;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = (ConfigurableApplicationContext) applicationContext;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
