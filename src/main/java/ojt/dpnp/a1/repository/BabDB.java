package ojt.dpnp.a1.repository;

import ojt.dpnp.a1.model.BabModel;
import ojt.dpnp.a1.model.PeraturanModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BabDB extends JpaRepository<BabModel, Long> {
    List<BabModel> findAll();
    Optional<BabModel> findById(Long id);
}
