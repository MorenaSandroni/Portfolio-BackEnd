
package com.portfolio.ms.Interface;

import com.portfolio.ms.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    //Guardar un objeto
    public void savePersona(Persona persona);
    //Eliminar un objeto
    public void deletePersona(Long id);
    //Buscar una persona por id
    public Persona findPersona(Long id);
    
    
}
