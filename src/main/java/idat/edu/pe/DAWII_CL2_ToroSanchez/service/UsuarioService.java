package idat.edu.pe.DAWII_CL2_ToroSanchez.service;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import idat.edu.pe.DAWII_CL2_ToroSanchez.model.bd.Rol;
import idat.edu.pe.DAWII_CL2_ToroSanchez.model.bd.Usuario;
import idat.edu.pe.DAWII_CL2_ToroSanchez.repository.RolRepository;
import idat.edu.pe.DAWII_CL2_ToroSanchez.repository.UsuarioRepository;

import java.util.Arrays;
import java.util.HashSet;

@Service
@AllArgsConstructor
public class UsuarioService {

    private UsuarioRepository usuarioRepository;
    private RolRepository rolRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder =
            new BCryptPasswordEncoder();

    public Usuario buscarUsuarioPorEmail(String email){
        return usuarioRepository.findByEmail(email);
    }

    public Usuario buscarUsuarioPorNombreUsuario(String username){
        return usuarioRepository.findByNomusuario(username);
    }

    public Usuario guardarUsuario(Usuario usuario){
        usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
        usuario.setActivo(true);
        if (usuarioRepository.findByEmail(usuario.getEmail()) != null){

        }
        Rol usuarioRol = rolRepository.findByNomrol("ADMIN");
        usuario.setRoles(new HashSet<>(Arrays.asList(usuarioRol)));
        return usuarioRepository.save(usuario);
    }
    public Usuario actualizarContraseña(Usuario usuario, String nuevaContraseña) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            usuario.setPassword(bCryptPasswordEncoder.encode(nuevaContraseña));
            return usuarioRepository.save(usuario);
    }

}
