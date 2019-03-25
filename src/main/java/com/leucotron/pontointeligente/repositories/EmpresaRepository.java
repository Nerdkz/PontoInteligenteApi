/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.pontointeligente.repositories;

import com.leucotron.pontointeligente.api.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vinicius
 */
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    
    @Transactional(readOnly = true)
    Empresa findByCnpj(String cnpj);
    
}
