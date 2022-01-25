package ${__package__}.core.domain.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * {@code Hello}
 *
 * @author ${author}
 * @date ${date}
 * @since ${version}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hello implements Serializable {

    private static final long serialVersionUID = 5817587056447491234L;

    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    private String name;
}
