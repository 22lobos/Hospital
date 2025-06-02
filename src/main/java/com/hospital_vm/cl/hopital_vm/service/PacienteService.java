package com.hospital_vm.cl.hopital_vm.service;



import com.hospital_vm.cl.hopital_vm.model.Paciente;
import com.hospital_vm.cl.hopital_vm.repository.PacienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PacienteService {
    
 @Autowired
 private PacienteRepository pacienteRepository ;

 public List<Paciente> findAll(){
        return pacienteRepository.findAll();


 }

 public Paciente  finById(long id) {
    return pacienteRepository.findById(id).get();
            
 }

public Paciente save(Paciente paciente ){
    return pacienteRepository.save(paciente);
}

public void delete(long id) {
    pacienteRepository.deleteById(id);
   
}
}