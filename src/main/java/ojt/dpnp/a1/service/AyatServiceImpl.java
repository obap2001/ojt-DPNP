package ojt.dpnp.a1.service;

import ojt.dpnp.a1.model.AyatModel;
import ojt.dpnp.a1.repository.AyatDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AyatServiceImpl implements AyatService{
    @Autowired
    private AyatDB ayatRepository;

    // Untuk mengambil semua data ayat
    public List<AyatModel> getAllAyat() {
        return ayatRepository.findAll();
    }

    // Untuk mengambil data ayat berdasarkan ID
    public Optional<AyatModel> getAyatById(Long id) {
        return ayatRepository.findById(id);
    }

    // Untuk menambahkan ayat baru
    public AyatModel addAyat(AyatModel ayat) {
        return ayatRepository.save(ayat);
    }

    // Untuk memperbarui ayat yang sudah ada
    public AyatModel updateAyat(Long id, AyatModel ayatDetails) {
        AyatModel ayat = ayatRepository.findById(id).orElseThrow(() -> new RuntimeException("Ayat tidak ditemukan"));
        ayat.setAyat(ayatDetails.getAyat());
        ayat.setIsi_ayat(ayatDetails.getIsi_ayat());
        ayat.setPasal(ayatDetails.getPasal());
        ayat.setBagian(ayatDetails.getBagian());
        ayat.setBab(ayatDetails.getBab());
        ayat.setPeraturan(ayatDetails.getPeraturan());
        ayat.setCreated_by(ayatDetails.getCreated_by());
        ayat.setCreated_at(ayatDetails.getCreated_at());

        return ayatRepository.save(ayat);
    }

    // Untuk menghapus ayat berdasarkan ID
    public void deleteAyat(Long id) {
        ayatRepository.deleteById(id);
    }
}
