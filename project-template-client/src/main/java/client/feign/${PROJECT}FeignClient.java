package ${__package__}.client.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * {@code ${PROJECT}FeignClient}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@FeignClient("${artifactId}")
public interface ${PROJECT}FeignClient {

    /**
     * 项目心跳检查
     *
     * @return 心跳检测结果
     */
    String heartBead();

}
