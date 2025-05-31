package com.hospital_vm.cl.hopital_vm.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity // es la entidad de la tabla 
@Table(name = "paciente") // nombre de la tabla en la base de datos
@Data // Lombok para generar getters, setters, toString, equals y hashCode
@AllArgsConstructor  // Lombok para generar un constructor con todos los argumentos
@NoArgsConstructor // Lombok para generar un constructor sin argumentos

public class Paciente {
    @Id // Indica que este campo es la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Generación automática del ID por la base de datos
    private Long id;// Identificador único del paciente            
    
    @Column(unique=true, length = 13 , nullable = false) // Columna para el RUN del paciente, único y no nulo
    private String run ;  // RUN del paciente, debe ser único y no nulo              

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false) // Columna para el apellido del paciente, no nulo
    private String apellido;

    @Column(nullable = true)
    private String  fechaNscimiento;

    @Column(nullable = false)
    private String correo;




}
