package ojt.dpnp.a1.service;

import ojt.dpnp.a1.model.PeraturanModel;
import ojt.dpnp.a1.model.TanggapanModel;

import java.util.List;
import java.util.Optional;

public interface TanggapanService {
    List<TanggapanModel> getAllTanggapan();
    Optional<TanggapanModel> getTanggapanById(Long id);
    TanggapanModel addTanggapan(TanggapanModel tanggapan);
    TanggapanModel updateTanggapan(Long id, TanggapanModel tanggapanDetails);
    void deleteTanggapan(Long id);
}
