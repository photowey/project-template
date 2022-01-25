package ${__package__}.web.config;

import com.github.xiaoymin.knife4j.spring.extension.OpenApiExtensionResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * {@code Knife4jConfigure}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Configuration
@EnableOpenApi
public class Knife4jConfigure {

    /**
     * 引入 {@code Knife4j} 提供的扩展类
     */
    private final OpenApiExtensionResolver openApiExtensionResolver;

    public Knife4jConfigure(OpenApiExtensionResolver openApiExtensionResolver) {
        this.openApiExtensionResolver = openApiExtensionResolver;
    }

    @Bean(value = "${artifactId}-docket")
    public Docket uphicooDocket() {
        String group = "${artifactId}";
        Contact contact = new Contact(
                "${author}", "https://wiki.hicoofinal.com/spaces/viewspace.action?key=~${author}", "${author}@uphicoo.com");
        Docket docket = new Docket(DocumentationType.OAS_30)
                .apiInfo(this.populateApiInfo(contact))
                .groupName(group)
                .select()
                .apis(RequestHandlerSelectors.basePackage("${__package__}.web.controller"))
                .paths(PathSelectors.any())
                .build()
                .extensions(openApiExtensionResolver.buildExtensions(group));

        return docket;
    }

    private ApiInfo populateApiInfo(Contact contact) {
        return new ApiInfoBuilder()
                .title("${artifactId} project")
                .description("${artifactId} project RESTful APIs")
                .termsOfServiceUrl("https://wiki.hicoofinal.com/spaces/viewspace.action")
                .contact(contact)
                .version("${version}")
                .build();
    }
}
