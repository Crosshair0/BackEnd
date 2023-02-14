/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.afp.Service;

import com.portfolio.afp.Entity.Proyectos;
import com.portfolio.afp.Repository.RProyectos;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sergio
 */
@Service
@Transactional
public class SProyectos {
    @Autowired
    RProyectos rProyectos;
    
    public List<Proyectos> list(){
        return rProyectos.findAll();
    }
    
    public Optional<Proyectos> getOne(int id) {
        return rProyectos.findById(id);
    }
    public Optional<Proyectos> getByNombreP(String nombreP) {
        return rProyectos.findByNombreP(nombreP);
    }
    public Optional<Proyectos> getByDescripcionP(String descripcionP) {
        return rProyectos.findByDescripcionP(descripcionP);
    }
    public Optional<Proyectos> getByImg(String img) {
        return rProyectos.findByImg(img);
    }
    public Optional<Proyectos> getByUrlP(String urlP) {
        return rProyectos.findByUrlP(urlP);
    }
    
    public void save(Proyectos proyectos) {
        rProyectos.save(proyectos);
    }
    public void delete(int id){
        rProyectos.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rProyectos.existsById(id);
        
    }
    
    public boolean existsByNombreP(String nombreP){
        return rProyectos.existsByNombreP(nombreP);
        
    }
    public boolean existsByDescripcionP(String descripcionP) {
        return rProyectos.existsByDescripcionP(descripcionP);
    }
    public boolean existsByImg(String img) {
        return rProyectos.existsByImg(img);
    }
    public boolean existsByUrlP(String urlP) {
        return rProyectos.existsByUrlP(urlP);
    }
}
