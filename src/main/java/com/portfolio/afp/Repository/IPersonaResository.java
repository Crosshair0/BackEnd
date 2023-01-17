
package com.portfolio.afp.Repository;

import com.portfolio.afp.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaResository extends JpaRepository<Persona,Long> {
    
}
