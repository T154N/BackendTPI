package Entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class PruebaId implements Serializable {
    private Long vehiculoId;
    private Long interesadoId;
    private Long empleadoLegajo;
}
