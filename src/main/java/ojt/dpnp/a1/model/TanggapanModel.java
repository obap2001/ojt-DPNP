package ojt.dpnp.a1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name="TANGGAPAN_AYAT")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TanggapanModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_ayat", referencedColumnName = "id")
    private AyatModel ayatModel;

    private String nomorSuratND;

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

    private String tanggapan;

    @Size(max = 100)
    private String tipeTanggapan;

    @Column(name = "created_by")
    private Long created_by;

    @DateTimeFormat(pattern ="yyyy-MM-dd HH:mm:ss")
    @Column(name = "created_at")
    private LocalDateTime created_at;

    //TODO: field user yang memberikan tangggapan

}
