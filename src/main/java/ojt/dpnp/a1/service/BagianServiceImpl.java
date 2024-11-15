package ojt.dpnp.a1.service;

import ojt.dpnp.a1.model.BagianModel;
import ojt.dpnp.a1.repository.BagianDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BagianServiceImpl implements BagianService{
    @Autowired private BagianDB bagianDB;
    @Override
    public List<BagianModel> getAllBagian() {
        return bagianDB.findAll();
    }

    @Override
    public Optional<BagianModel> getBagianById(Long id) {
        return bagianDB.findById(id);
    }

    @Override
    public BagianModel addBagian(BagianModel bagian) {
        return bagianDB.save(bagian);
    }

    @Override
    public BagianModel updateBagian(Long id, BagianModel bagianDetails) {
        BagianModel bagian = bagianDB.findById(id).orElseThrow(() -> new RuntimeException("Bagian tidak ditemukan"));
        bagian.setBagian(bagianDetails.getBagian());
        bagian.setBab(bagianDetails.getBab());
        bagian.setPeraturan(bagianDetails.getPeraturan());
        bagian.setCreated_by(bagianDetails.getCreated_by());
        bagian.setCreated_at(bagianDetails.getCreated_at());

        return bagianDB.save(bagian);    }

    @Override
    public void deleteBagian(Long id) {
        bagianDB.deleteById(id);
    }
}
