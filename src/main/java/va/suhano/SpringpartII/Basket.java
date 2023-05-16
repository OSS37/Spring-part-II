package va.suhano.SpringpartII;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SessionScope
@Component
public class Basket {
    private final List<Integer> idList = new ArrayList<>();


    public List<Integer> add(List<Integer> id) {
        idList.addAll(id);
        return id;
    }

    public List<Integer> get() {
        return Collections.unmodifiableList(idList);
    }
}
