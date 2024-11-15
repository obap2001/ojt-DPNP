package ojt.dpnp.a1.service;

import ojt.dpnp.a1.model.AyatModel;
import ojt.dpnp.a1.model.PasalModel;
import ojt.dpnp.a1.repository.PasalDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PasalServiceImpl implements PasalService{
    @Autowired private PasalDB pasalDB;
    @Override
    public List<PasalModel> getAllPasal() {
        return pasalDB.findAll();
    }

    @Override
    public Optional<PasalModel> getPasalById(Long id) {
        return pasalDB.findById(id);
    }

    @Override
    public PasalModel addPasal(PasalModel pasal) {
        return pasalDB.save(pasal);
    }

    @Override
    public PasalModel updatePasal(Long id, PasalModel pasalDetails) {
        PasalModel pasal = pasalDB.findById(id).orElseThrow(() -> new RuntimeException("Pasal tidak ditemukan"));
        pasal.setPasal(pasalDetails.getPasal());
        pasal.setBagian(pasalDetails.getBagian());
        pasal.setBab(pasalDetails.getBab());
        pasal.setPeraturan(pasalDetails.getPeraturan());
        pasal.setCreated_by(pasalDetails.getCreated_by());
        pasal.setCreated_at(pasalDetails.getCreated_at());

        return pasalDB.save(pasal);
    }

    @Override
    public void deletePasal(Long id) {
        pasalDB.deleteById(id);
    }
}
