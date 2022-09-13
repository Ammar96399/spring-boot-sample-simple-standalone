package sample.simple.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import sample.simple.interfaces.IProvider;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Provider implements IProvider {
    private Long id;
    private Address address;
    private String name;
    private List<Store> stores;

    @Override
    public Double getPrice(Long id) {
        return null;
    }

    @Override
    public Boolean order(Long productId, Long storeId, Integer quantity) {
        return null;
    }
}
