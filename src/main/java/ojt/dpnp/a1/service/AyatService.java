package ojt.dpnp.a1.service;

import ojt.dpnp.a1.model.AyatModel;

import java.util.List;
import java.util.Optional;

public interface AyatService {
    List<AyatModel> getAllAyat();
    Optional<AyatModel> getAyatById(Long id);
    AyatModel addAyat(AyatModel ayat);
    AyatModel updateAyat(Long id, AyatModel ayatDetails);
    void deleteAyat(Long id);
}
