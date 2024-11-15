package ojt.dpnp.a1.controller;

import ojt.dpnp.a1.model.AyatModel;
import ojt.dpnp.a1.service.AyatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ayat")
public class AyatController {

    @Autowired
    private AyatService ayatService;

    // Endpoint untuk mengambil semua data ayat
    @GetMapping
    public List<AyatModel> getAllAyat() {
        return ayatService.getAllAyat();
    }

    // Endpoint untuk mengambil data ayat berdasarkan ID
    @GetMapping("/{id}")
    public ResponseEntity<AyatModel> getAyatById(@PathVariable Long id) {
        Optional<AyatModel> ayat = ayatService.getAyatById(id);
        return ayat.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint untuk menambahkan ayat baru
    @PostMapping
    public ResponseEntity<AyatModel> addAyat(@RequestBody AyatModel ayat) {
        AyatModel createdAyat = ayatService.addAyat(ayat);
        return new ResponseEntity<>(createdAyat, HttpStatus.CREATED);
    }

    // Endpoint untuk memperbarui ayat berdasarkan ID
    @PutMapping("/{id}")
    public ResponseEntity<AyatModel> updateAyat(@PathVariable Long id, @RequestBody AyatModel ayatDetails) {
        try {
            AyatModel updatedAyat = ayatService.updateAyat(id, ayatDetails);
            return new ResponseEntity<>(updatedAyat, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint untuk menghapus ayat berdasarkan ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAyat(@PathVariable Long id) {
        try {
            ayatService.deleteAyat(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
