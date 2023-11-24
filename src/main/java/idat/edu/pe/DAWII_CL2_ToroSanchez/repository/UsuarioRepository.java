package idat.edu.pe.DAWII_CL2_ToroSanchez.repository;

import idat.edu.pe.DAWII_CL2_ToroSanchez.model.bd.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,
        Integer> {

    Usuario findByEmail(String email);

    Usuario findByNomusuario(String nomusuario);

}
