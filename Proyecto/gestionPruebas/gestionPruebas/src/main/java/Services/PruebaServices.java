package Services;

import Repository.PruebaRepository;
import org.springframework.stereotype.Service;

@Service
public class PruebaServices {
    private final PruebaRepository pruebaRepository;

    public PruebaServices(PruebaRepository pruebaRepository) {
        this.pruebaRepository = pruebaRepository;
    }


}
