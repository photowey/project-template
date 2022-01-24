package ${package}.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ${package}.core.domain.dto.HelloDTO;
import ${package}.core.domain.entity.Hello;

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
