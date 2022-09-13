package sample.simple.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import sample.simple.interfaces.IProvider;

import java.util.List;
import java.util.Random;

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
        Random random = new Random();
        return random.nextDouble();
    }

    @Override
    public Boolean order(Long productId, Long storeId, Integer quantity) {
        System.out.println("Store " + storeId + " ordered " + quantity + " of product " + productId);
        return Boolean.TRUE;
    }
}
