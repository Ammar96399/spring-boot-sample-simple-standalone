package sample.simple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.simple.models.Bank;
import sample.simple.models.Client;
import sample.simple.models.Provider;
import sample.simple.models.Store;

import java.util.List;

@Component
public class Scenario2Service {

    @Autowired
    private Client client;
    @Autowired
    private Store store;
    @Autowired
    private Bank bank;
    @Autowired
    private Provider provider;

    public void act(List<Long> artIds) {
        if (artIds.stream().anyMatch(aid -> !store.isAvailable(aid))) {
            System.out.println("Some of requested articles are not available.");
        } else {
            artIds.forEach(aid -> {
                store.addItemToCart(aid, client.getId());
                store.pay(client.getId());
            });
        }
    }
}
