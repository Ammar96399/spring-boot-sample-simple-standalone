package sample.simple.interfaces;

public interface IFastLane extends IStore {
    public Boolean oneShotOrder(Long articleId, Long clientId, Integer quantity);
}
