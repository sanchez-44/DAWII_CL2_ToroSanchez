package idat.edu.pe.DAWII_CL2_ToroSanchez.controller.backoffice;

import idat.edu.pe.DAWII_CL2_ToroSanchez.service.UsuarioService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class cambiarPasswordController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cambiarPassword")
    public String actualizarContraseña(
            @RequestParam("nuevoPassword") String nuevoPassword,
            @RequestParam("confirmarPassword") String confirmarPassword,
            Model model) {
        return "redirect:/backoffice/contra/cambiarPassword";
    }

}
