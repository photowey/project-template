package $ import com.baomidou.mybatisplus.extension.service.IService;

{__package__}.web.service;
        {__package__}.core.domain.dto.HelloDTO;{__package__}.core.domain.entity.Hello;

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
