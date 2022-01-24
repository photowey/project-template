package ${package}.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ${package}.core.domain.dto.HelloDTO;
import ${package}.core.domain.entity.Hello;
import ${package}.web.repository.HelloRepository;
import ${package}.web.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * {@code HelloServiceImpl}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Service
public class HelloServiceImpl extends ServiceImpl<HelloRepository, Hello> implements HelloService {

    @Override
    public HelloDTO sayHello() {
        return new HelloDTO(9527L, "${author}");
    }
}
