package ojt.dpnp.a1.controller;

import ojt.dpnp.a1.model.BabModel;
import ojt.dpnp.a1.service.BabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bab/")
public class BabController {
    @Autowired private BabService babService;

    // Endpoint untuk mengambil semua data ayat
    @GetMapping
    public List<BabModel> getAllBab() {
        return babService.getAllBab();
    }

    // Endpoint untuk mengambil data ayat berdasarkan ID
    @GetMapping("/{id}")
    public ResponseEntity<BabModel> getBabById(@PathVariable Long id) {
        Optional<BabModel> bab = babService.getBabById(id);
        return bab.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint untuk menambahkan ayat baru
    @PostMapping
    public ResponseEntity<BabModel> addBab(@RequestBody BabModel bab) {
        BabModel createdBab = babService.addBab(bab);
        return new ResponseEntity<>(createdBab, HttpStatus.CREATED);
    }

    // Endpoint untuk memperbarui ayat berdasarkan ID
    @PutMapping("/{id}")
    public ResponseEntity<BabModel> updateBab(@PathVariable Long id, @RequestBody BabModel babDetails) {
        try {
            BabModel updatedBab = babService.updateBab(id, babDetails);
            return new ResponseEntity<>(updatedBab, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint untuk menghapus ayat berdasarkan ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBab(@PathVariable Long id) {
        try {
            babService.deleteBab(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
