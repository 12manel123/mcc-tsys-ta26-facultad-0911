package com.example.demo.services;

import com.example.demo.dto.Investigador;
import java.util.List;

public interface IInvestigadorService {
    List<Investigador> getAllInvestigadores();
    Investigador getInvestigadorByDNI(String DNI);
    Investigador createInvestigador(Investigador investigador);
    Investigador updateInvestigador(Investigador investigador);
    void deleteInvestigador(String DNI);
}
