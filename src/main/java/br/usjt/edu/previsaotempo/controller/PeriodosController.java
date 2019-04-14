package br.usjt.edu.previsaotempo.controller;

import br.usjt.edu.previsaotempo.model.Periodo;
import br.usjt.edu.previsaotempo.repository.PeriodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PeriodosController {

    @Autowired
    private PeriodosRepository repository;

    @GetMapping("/periodos")
    public ModelAndView listarPeriodos() {
        ModelAndView mv = new ModelAndView("listar_periodo");

        List<Periodo> periodos = repository.findAll();
        mv.addObject("periodos", periodos);
        mv.addObject(new Periodo());
        return mv;
    }
//    @PostMapping()
//    public String Salvar(Periodo periodo) {
//        repository.save(periodo);
//        return "redirect:/periodos";
//    }
}
