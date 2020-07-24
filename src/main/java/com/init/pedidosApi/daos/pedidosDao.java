/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.init.pedidosApi.daos;

import com.init.pedidosApi.entitys.Fruta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jasond
 */
public interface pedidosDao extends JpaRepository<Fruta, Long>{
    
}
