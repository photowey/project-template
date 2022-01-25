package ${__package__}.core.domain.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * {@code HelloDTO}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelloDTO implements Serializable {

    private static final long serialVersionUID = -1675911161126433916L;

    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    private String name;
}
