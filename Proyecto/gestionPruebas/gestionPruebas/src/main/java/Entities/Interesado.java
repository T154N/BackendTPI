package Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Interesados")
public class Interesado {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long intereasadoId;


    @Column(name = "NOMBRE", nullable = false)
    private String interesadoNombre;

    @Column(name = "APELLIDO", nullable = false)
    private String interesadoApellido;

    @Column(name="TIPO_DOCUMENTO", nullable = false)
    private String interesadoTipoDocumento;

    @Column(name="DOCUMENTO", nullable = false)
    private Long interesadoNumeroDocumento;

    @Column(name = "RESTRINGIDO", nullable = false)
    private Boolean interesadoRestringido;

    @Column(name="NRO_LICENCIA", nullable = false)
    private Long interesadoNumeroLicencia;

    @Column(name="FECHA_VENCIMIENTO_LICENCIA", nullable = false)
    private LocalDateTime interesadoFechaVencimientoLicencia;

    @OneToMany(mappedBy = "interesado", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Prueba> pruebas;

}
