package va.suhano.SpringpartII;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")

public class Controller {

    private final BasketService service;

    public Controller(BasketService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add (@RequestParam("id")  int id) {
    service.addBasket(new IdProduct(id));
    }

    @GetMapping("/get")
    public List<IdProduct> basketList(){
        return service.getBasket();
    }
}
