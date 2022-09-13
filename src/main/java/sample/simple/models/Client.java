package sample.simple.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Client {
    private Long id;
    private String name;
    private LocalDateTime dateOfBirth;
    private Address address;
    private String phoneNumber;
    private String email;
}
