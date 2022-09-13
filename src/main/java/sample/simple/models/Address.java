package sample.simple.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Component
@AllArgsConstructor
public class Address {
    private Integer zipCode;
    private String lane;
    private String additionalInfo;
    private String city;
    private String country;
}
