package sample.simple.interfaces;

public interface IJustHaveALook extends IStore {
    public Double getPrice(Long id);
    public Boolean isAvailable(Long id);
}
