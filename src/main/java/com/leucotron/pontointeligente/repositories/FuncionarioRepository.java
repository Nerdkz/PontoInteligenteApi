/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.pontointeligente.repositories;

import com.leucotron.pontointeligente.api.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vinicius
 */

@Transactional(readOnly = true)
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    
    Funcionario findByCpf(String cpf);
    
    Funcionario findByEmail(String email);
    
    Funcionario findByCpfOrEmail(String cpf, String email);
    
}
