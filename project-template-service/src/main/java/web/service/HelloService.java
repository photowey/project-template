package ${__package__}.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ${__package__}.core.domain.dto.HelloDTO;
import ${__package__}.core.domain.entity.Hello;

/**
 * {@code HelloService}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
public interface HelloService extends IService<Hello> {

    HelloDTO sayHello();

}
