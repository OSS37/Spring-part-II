package va.suhano.SpringpartII;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService service;

    public BasketController(BasketService service) {
        this.service = service;
    }


    @GetMapping("/add")
    public List<Integer> add (@RequestParam ("id") List<Integer> id){
        return service.add(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return service.get();
    }
}
