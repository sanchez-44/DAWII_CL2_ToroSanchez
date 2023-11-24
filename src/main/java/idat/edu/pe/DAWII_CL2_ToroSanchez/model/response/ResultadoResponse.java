package idat.edu.pe.DAWII_CL2_ToroSanchez.model.response;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ResultadoResponse {
    private Boolean respuesta;
    private String mensaje;
}
