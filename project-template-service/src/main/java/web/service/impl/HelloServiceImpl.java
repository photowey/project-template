package $ import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

{__package__}.web.service.impl;
        {__package__}.core.domain.dto.HelloDTO;
        {__package__}.core.domain.entity.Hello;
        {__package__}.web.repository.HelloRepository;
        {__package__}.web.service.HelloService;

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
