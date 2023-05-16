package va.suhano.SpringpartII;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {

    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket =  basket;
    }


    public List<Integer> add(List<Integer> id) {
        return basket.add(id);
    }


    public List<Integer> get() {
        return basket.get();
    }


}
