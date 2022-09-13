package sample.simple.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import sample.simple.interfaces.IBank;

import java.util.List;

@Getter
@Setter
@Component
@NoArgsConstructor
public class Bank implements IBank {
    private Long id;
    private Address address;
    private String name;

    @Override
    public Boolean transfer(Long payerId, Long payeeId, Double amount) {
        System.out.println("Person: " + payerId + " paid person: " + payeeId + " the amount of " + amount);
        return Boolean.TRUE;
    }
}
