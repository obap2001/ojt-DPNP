package ojt.dpnp.a1.repository;

import ojt.dpnp.a1.model.PasalModel;
import ojt.dpnp.a1.model.PeraturanModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PasalDB extends JpaRepository<PasalModel, Long> {
    List<PasalModel> findAll();
    Optional<PasalModel> findById(Long id);
}
