/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Dao.ProyectoDaoImp;
import modelos.Proyecto;
import java.util.List;
/**
 *
 * @author programador2
 */
public class testDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int id;
        ProyectoDaoImp proyectoDao = new ProyectoDaoImp();
         List<Proyecto> list=  proyectoDao.findAll();
        Proyecto proyecto = new Proyecto();
        proyecto.setProyectoId(1);
        proyecto.setNombre("Banco de tareas y proyecto");
        proyecto.setDescripcion("prueba");
        proyectoDao.create(proyecto);
    }
    
}
