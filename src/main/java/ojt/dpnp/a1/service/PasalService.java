package ojt.dpnp.a1.service;

import ojt.dpnp.a1.model.AyatModel;
import ojt.dpnp.a1.model.PasalModel;

import java.util.List;
import java.util.Optional;

public interface PasalService {
    List<PasalModel> getAllPasal();
    Optional<PasalModel> getPasalById(Long id);
    PasalModel addPasal(PasalModel pasal);
    PasalModel updatePasal(Long id, PasalModel pasalDetails);
    void deletePasal(Long id);
}
