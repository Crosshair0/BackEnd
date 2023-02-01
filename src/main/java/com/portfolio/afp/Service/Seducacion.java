/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.afp.Service;

import com.portfolio.afp.Entity.Educacion;
import com.portfolio.afp.Repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Seducacion {
    @Autowired
    REducacion rEducacion;
    
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    
    public Optional<Educacion> getOne(int id) {
        return rEducacion.findById(id);
    }
    public Optional<Educacion> getByNombreE(String nombreE) {
        return rEducacion.findByNombreE(nombreE);
    }
    public Optional<Educacion> getByDescripcionE(String descripcionE) {
        return rEducacion.findByDescripcionE(descripcionE);
    }
    
    public void save(Educacion educacion) {
        rEducacion.save(educacion);
    }
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rEducacion.existsById(id);
        
    }
    
    public boolean existsByNombreE(String nombreE){
        return rEducacion.existsByNombreE(nombreE);
        
    }
    public boolean existsByDescripcionE(String descripcionE) {
        return rEducacion.existsByDescripcionE(descripcionE);
    }
}
