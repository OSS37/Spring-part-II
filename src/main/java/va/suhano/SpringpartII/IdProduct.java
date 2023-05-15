package va.suhano.SpringpartII;

import org.springframework.web.context.annotation.SessionScope;

public class IdProduct {
    private int id;

    public IdProduct(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
