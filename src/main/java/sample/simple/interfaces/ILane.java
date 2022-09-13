package sample.simple.interfaces;

public interface ILane extends IStore {
    public Boolean addItemToCart(Long articleId, Long clientId);
    public Boolean pay(Long clientId);
}
