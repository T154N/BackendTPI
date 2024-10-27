package Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Empleados")
public class Empleado {

    @Id
    @Column(name="LEGAJO", nullable = false)
    private Long empleadoLegajo;

    @Column(name="NOMBRE", nullable = false)
    private String empleadoNombre;

    @Column(name="APELLIDO", nullable = false)
    private String empleadoApellido;

    @Column(name="TELEFONO_CONTACTO", nullable = false)
    private Integer empleadoTelefonoContacto;

    @Column(name="MAIL_CONTACTO")
    private String empleadoEmailContacto;

    @OneToMany(mappedBy = "empleado")
    private Set<Prueba> pruebas;

}
