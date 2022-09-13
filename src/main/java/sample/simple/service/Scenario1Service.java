package sample.simple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.simple.models.Bank;
import sample.simple.models.Client;
import sample.simple.models.Provider;
import sample.simple.models.Store;

@Component
public class Scenario1Service {
    // Problem: the payment and supply processes should be better handled in methods of
    // Store rather than handled explicitly here?

    @Autowired
    private Client client;
    @Autowired
    private Store store;
    @Autowired
    private Bank bank;
    @Autowired
    private Provider provider;

    public void act(Long artId, Integer quantity) {
        if (!store.isAvailable(artId)) {
            System.out.println("The requested article is not available.");
        } else {
            var artPrice = store.getPrice(artId);
            var bankTransferStatus =
                    bank.transfer(client.getBankAccountAddress(), store.getBankAccountAddress(), artPrice);
            if (!bankTransferStatus) {
                System.out.println("The client does not have enough balance to proceed the transfer.");
            } else {
                if (store.getStock().get(artId) < quantity) {
                    provider.order(artId, store.getId(), quantity);
                }
                System.out.println("The client bought an article from the store");
                store.getStock().put(artId, store.getStock().get(artId) - quantity);
            }
        }
    }
}
