package $ import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

{__package__}.web;
        {groupId}.cloud.platform.app.starting.printer.AppPrinter;
        {__package__}.web.service.annotation.EnableService;

@EnableService
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class, args);
        AppPrinter.print(applicationContext);
    }

}
