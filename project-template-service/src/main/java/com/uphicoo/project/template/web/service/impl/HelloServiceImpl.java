package ${__package__}.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ${__package__}.core.domain.dto.HelloDTO;
import ${__package__}.core.domain.entity.Hello;
import ${__package__}.web.repository.HelloRepository;
import ${__package__}.web.service.HelloService;
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
