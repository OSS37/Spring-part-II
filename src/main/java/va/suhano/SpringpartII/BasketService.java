package va.suhano.SpringpartII;

import java.util.List;

public interface BasketService {
    public IdProduct addBasket(IdProduct id);

    public List<IdProduct> getBasket();
}
