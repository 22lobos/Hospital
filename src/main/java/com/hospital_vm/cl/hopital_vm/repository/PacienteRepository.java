package com.hospital_vm.cl.hopital_vm.repository;


import com.hospital_vm.cl.hopital_vm.model.Paciente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;








public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    
    @Query("SELECT p FROM Paciente p WHERE p.nombre = :apellido")
    List<Paciente> buscarPorApellidos(@Param("apellidos") String apellido);
 

    @Query(value = " FROM PACIENTE WHERE correo = correo", nativeQuery = true)
    Paciente buscaPorCorreo(@param ("correo") String correo);

    List<Paciente> finByNombreApellidos(String nombre, String apellidos); 

    
}
    

