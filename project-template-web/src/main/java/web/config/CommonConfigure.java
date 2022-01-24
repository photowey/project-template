package ${package}.web.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;
import java.nio.charset.StandardCharsets;

/**
 * {@code CommonConfigure}
 * 项目通用配置
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Configuration
public class CommonConfigure implements WebMvcConfigurer {

    @Bean
    public HttpMessageConverter<String> httpMessageConverter() {
        return new StringHttpMessageConverter(StandardCharsets.UTF_8);
    }

    @Bean
    public DataSource dataSource() {
        return DruidDataSourceBuilder.create().build();
    }
}