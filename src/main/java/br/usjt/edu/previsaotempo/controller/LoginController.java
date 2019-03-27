package br.usjt.edu.previsaotempo.controller;

import br.usjt.edu.previsaotempo.model.Usuario;
import br.usjt.edu.previsaotempo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping({"/login", "/"})
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView("login");
        mv.addObject(new Usuario());
        return mv;
    }


    @PostMapping("/fazerLogin")
    public String fazerLoginUser(HttpServletRequest request, Usuario usuario) {
            usuario = loginService.detalhesUser(usuario);
        if (usuario!= null) {
            request.getSession().setAttribute("usuarioLogado",usuario);
            return "redirect:periodos";
        }

        return "login";
    }

}
