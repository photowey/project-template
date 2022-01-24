package ${package}.web.controller;

import ${package}.core.domain.dto.HelloDTO;
import ${package}.web.service.HelloService;
import ${package}.web.service.engine.IProjectEngine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
