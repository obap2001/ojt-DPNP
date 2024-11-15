package ojt.dpnp.a1.service;

import ojt.dpnp.a1.model.BabModel;
import ojt.dpnp.a1.model.BagianModel;

import java.util.List;
import java.util.Optional;

public interface BagianService {
    List<BagianModel> getAllBagian();
    Optional<BagianModel> getBagianById(Long id);
    BagianModel addBagian(BagianModel bagian);
    BagianModel updateBagian(Long id, BagianModel bagianDetails);
    void deleteBagian(Long id);
}
