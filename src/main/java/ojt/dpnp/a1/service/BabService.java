package ojt.dpnp.a1.service;

import ojt.dpnp.a1.model.BabModel;

import java.util.List;
import java.util.Optional;

public interface BabService {
        List<BabModel> getAllBab();
        Optional<BabModel> getBabById(Long id);
        BabModel addBab(BabModel bab);
        BabModel updateBab(Long id, BabModel babDetails);
        void deleteBab(Long id);
}
