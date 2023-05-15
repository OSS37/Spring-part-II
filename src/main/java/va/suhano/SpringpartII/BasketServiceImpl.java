package va.suhano.SpringpartII;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {

    private final List<IdProduct> idProductList = new ArrayList<>();

    @Override
    public IdProduct addBasket(IdProduct productId) {
        idProductList.add(productId);
        return productId;
    }

    @Override
    public List<IdProduct> getBasket() {
        return idProductList;
    }
}
