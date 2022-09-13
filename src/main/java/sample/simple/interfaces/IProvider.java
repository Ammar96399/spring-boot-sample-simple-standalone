package sample.simple.interfaces;

public interface IProvider {
    public Double getPrice(Long id);
    public Boolean order(Long productId, Long storeId, Integer quantity);
}
