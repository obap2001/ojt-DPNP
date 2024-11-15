package ojt.dpnp.a1.service;

import ojt.dpnp.a1.model.AyatModel;
import ojt.dpnp.a1.model.BabModel;
import ojt.dpnp.a1.repository.BabDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BabServiceImpl implements BabService{

    @Autowired private BabDB babRepository;
    @Override
    public List<BabModel> getAllBab() {
        return babRepository.findAll();
    }

    @Override
    public Optional<BabModel> getBabById(Long id) {
        return babRepository.findById(id);
    }

    @Override
    public BabModel addBab(BabModel bab) {
        return babRepository.save(bab);
    }

    @Override
    public BabModel updateBab(Long id, BabModel babDetails) {
        BabModel bab = babRepository.findById(id).orElseThrow(() -> new RuntimeException("Bab tidak ditemukan"));
        bab.setBab(babDetails.getBab());
        bab.setIsi_bab(babDetails.getIsi_bab());
        bab.setPeraturan(babDetails.getPeraturan());
        bab.setCreated_by(babDetails.getCreated_by());
        bab.setCreated_at(babDetails.getCreated_at());

        return babRepository.save(bab);
    }

    @Override
    public void deleteBab(Long id) {
        babRepository.deleteById(id);
    }
}
