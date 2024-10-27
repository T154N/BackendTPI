package Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Pruebas")
public class Prueba {

    @EmbeddedId
    private PruebaId id;

    @Column(name = "FECHA_HORA_INICIO", nullable = false)
    private LocalDateTime fecchaHoraInicio;

    @Column(name = "FECHA_HORA_FIN", nullable = false)
    private LocalDateTime fechaHoraFin;

    @Column(name="COMENTARIOS")
    private String comentarios;

    @ManyToOne
    @JoinColumn(name = "ID_VEHICULO",referencedColumnName = "ID", insertable = false, updatable = false)
    private Vehiculo vehiculo;

    @ManyToOne
    @JoinColumn(name = "ID_INTERESADO",referencedColumnName = "ID", insertable = false, updatable = false)
    private Interesado interesado;


    @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_EMPLEADO",referencedColumnName = "LEGAJO", insertable = false, updatable = false)
    private Empleado empleado;




}
