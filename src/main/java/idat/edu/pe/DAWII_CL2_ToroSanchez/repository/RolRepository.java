package idat.edu.pe.DAWII_CL2_ToroSanchez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import idat.edu.pe.DAWII_CL2_ToroSanchez.model.bd.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol,
        Integer> {

    Rol findByNomrol(String nomrol);

}
