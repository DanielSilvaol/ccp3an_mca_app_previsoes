package br.usjt.edu.previsaotempo.repository;

import br.usjt.edu.previsaotempo.model.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodosRepository extends JpaRepository<Periodo,Long> {
}
