package ojt.dpnp.a1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name="PERATURAN")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PeraturanModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 100)
    @NotNull
    private String tipe;

    @Size(max = 100)
    @NotNull
    private String status;

    @Size(max = 100)
    @NotNull
    private String status_penanggapan;

    @NotNull
    private String judul;

    private String nomor;

    @NotNull
    private Long jumlah_bab;

    @NotNull
    private Long jumlah_bagian;

    @NotNull
    private Long jumlah_pasal;

    @NotNull
    private Long jumlah_ayat;

    @Column(name = "created_by")
    private Long created_by;

    @DateTimeFormat(pattern ="yyyy-MM-dd HH:mm:ss")
    @Column(name = "created_at")
    private LocalDateTime created_at;
}
