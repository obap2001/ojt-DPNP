package ojt.dpnp.a1.service;

import ojt.dpnp.a1.model.TanggapanModel;
import ojt.dpnp.a1.repository.TanggapanDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TanggapanServiceImpl implements TanggapanService{
    @Autowired private TanggapanDB tanggapanDB;

    @Override
    public List<TanggapanModel> getAllTanggapan() {
        return tanggapanDB.findAll();
    }

    @Override
    public Optional<TanggapanModel> getTanggapanById(Long id) {
        return tanggapanDB.findById(id);
    }

    @Override
    public TanggapanModel addTanggapan(TanggapanModel tanggapan) {
        return tanggapanDB.save(tanggapan);
    }

    @Override
    public TanggapanModel updateTanggapan(Long id, TanggapanModel tanggapanDetails) {
        return null;
    }

    @Override
    public void deleteTanggapan(Long id) {
        tanggapanDB.deleteById(id);
    }
}
