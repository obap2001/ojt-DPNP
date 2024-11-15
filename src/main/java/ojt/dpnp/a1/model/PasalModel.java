package ojt.dpnp.a1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name="PASAL_PERATURAN")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PasalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private BagianModel bagian;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private BabModel bab;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private PeraturanModel peraturan;

    @Size(max = 10)
    @NotNull
    private String pasal;

    @NotNull
    private String isi_pasal;

    @NotNull
    private Long jumlah_ayat;

    @Column(name = "created_by")
    private Long created_by;

    @DateTimeFormat(pattern ="yyyy-MM-dd HH:mm:ss")
    @Column(name = "created_at")
    private LocalDateTime created_at;
}
