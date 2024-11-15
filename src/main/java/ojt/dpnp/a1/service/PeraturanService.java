package ojt.dpnp.a1.service;

import ojt.dpnp.a1.model.PasalModel;
import ojt.dpnp.a1.model.PeraturanModel;

import java.util.List;
import java.util.Optional;

public interface PeraturanService {
    List<PeraturanModel> getAllPeraturan();
    Optional<PeraturanModel> getPeraturanById(Long id);
    PeraturanModel addPasal(PeraturanModel peraturan);
    PeraturanModel updatePeraturan(Long id, PeraturanModel peraturanDetails);
    void deletePeraturan(Long id);
}
