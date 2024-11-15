package ojt.dpnp.a1.repository;

import ojt.dpnp.a1.model.PeraturanModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PeraturanDB extends JpaRepository<PeraturanModel, Long> {
    List<PeraturanModel> findAll();
    Optional<PeraturanModel> findById(Long id);
}
