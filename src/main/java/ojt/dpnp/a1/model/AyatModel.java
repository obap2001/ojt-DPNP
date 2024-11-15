package ojt.dpnp.a1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name="AYAT_PERATURAN")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AyatModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private PasalModel pasal;

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
    private String ayat;

    @NotNull
    private String isi_ayat;

    @Column(name = "created_by")
    private Long created_by;

    @DateTimeFormat(pattern ="yyyy-MM-dd HH:mm:ss")
    @Column(name = "created_at")
    private LocalDateTime created_at;

    @OneToOne(mappedBy = "ayatModel")
    private TanggapanModel tanggapan;

}
