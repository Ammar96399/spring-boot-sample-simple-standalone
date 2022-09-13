package sample.simple.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Component
public class Client {
    private Long id;

}
