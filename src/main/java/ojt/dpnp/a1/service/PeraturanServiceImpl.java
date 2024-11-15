package ojt.dpnp.a1.service;

import ojt.dpnp.a1.model.PeraturanModel;
import ojt.dpnp.a1.repository.PeraturanDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeraturanServiceImpl implements PeraturanService{
    @Autowired private PeraturanDB peraturanDB;
    @Override
    public List<PeraturanModel> getAllPeraturan() {
        return peraturanDB.findAll();
    }

    @Override
    public Optional<PeraturanModel> getPeraturanById(Long id) {
        return peraturanDB.findById(id);
    }

    @Override
    public PeraturanModel addPasal(PeraturanModel peraturan) {
        return peraturanDB.save(peraturan);
    }

    @Override
    public PeraturanModel updatePeraturan(Long id, PeraturanModel peraturanDetails) {
        return null;
    }

    @Override
    public void deletePeraturan(Long id) {

    }
}
