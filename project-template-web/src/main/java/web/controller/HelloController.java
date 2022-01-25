package $ import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

{__package__}.web.controller;
        {__package__}.core.domain.dto.HelloDTO;
        {__package__}.web.service.HelloService;
        {__package__}.web.service.engine.IProjectEngine;

/**
 * {@code HelloController}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private IProjectEngine projectEngine;

    @GetMapping("/sayHello")
    private ResponseEntity<HelloDTO> sayHello() {
        HelloService helloService = this.projectEngine.serviceEngine().helloService();
        HelloDTO dto = helloService.sayHello();
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
