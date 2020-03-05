#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.entity;

// import com.fasterxml.jackson.annotation.JsonProperty;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
import lombok.Data;
// import lombok.NoArgsConstructor;

// import javax.persistence.*;
// import java.time.LocalDateTime;

@Data
public class User {
    private Long id;

    private String name;

    private String email;
}
