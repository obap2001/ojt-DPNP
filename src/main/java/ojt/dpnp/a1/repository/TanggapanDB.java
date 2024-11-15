package ojt.dpnp.a1.repository;

import ojt.dpnp.a1.model.PeraturanModel;
import ojt.dpnp.a1.model.TanggapanModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TanggapanDB extends JpaRepository<TanggapanModel, Long> {
    List<TanggapanModel> findAll();
    Optional<TanggapanModel> findById(Long id);
}
