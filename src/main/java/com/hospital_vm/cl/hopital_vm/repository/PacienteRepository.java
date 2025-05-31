package com.hospital_vm.cl.hopital_vm.repository;


import com.hospital_vm.cl.hopital_vm.model.Paciente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;








public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    
    List<Paciente> findByApellido(String pellidos);

    Paciente findByRun(String correo);

    List<Paciente> finByNombreApellidos(String nombre, String apellidos);

    
}
    

