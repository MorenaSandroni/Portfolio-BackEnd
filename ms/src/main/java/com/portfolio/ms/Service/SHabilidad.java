
package com.portfolio.ms.Service;

import com.portfolio.ms.Entity.Habilidad;
import java.util.List;
import java.util.Optional;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.ms.Repository.RHabilidad;

@Service
@Transactional
public class SHabilidad {
     @Autowired
     RHabilidad rHabilidades;
     
     public List<Habilidad> list(){
         return rHabilidades.findAll();
     }
     
     public Optional<Habilidad> getOne(int id){
         return rHabilidades.findById(id);
     }
     
     public Optional<Habilidad> getByNombreH(String nombreH){
         return rHabilidades.findByNombreH(nombreH);
     }
     
     public void save(Habilidad hab){
         rHabilidades.save(hab);
     }
     
     public void delete(int id){
         rHabilidades.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rHabilidades.existsById(id);
     }
     
     public boolean existsByNombreH(String nombreH){
         return rHabilidades.existsByNombreH(nombreH);
     }
}