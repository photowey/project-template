package ${package}.web;

import ${groupId}.cloud.platform.app.starting.printer.AppPrinter;
import ${package}.web.service.annotation.EnableService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableService
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class, args);
        AppPrinter.print(applicationContext);
    }

}
