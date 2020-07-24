/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.init.pedidosApi.rest;

import com.init.pedidosApi.daos.pedidosDao;
import com.init.pedidosApi.entitys.Fruta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jasond
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600 )
@RestController
@RequestMapping("pedido")
public class pedidosRest {

    @Autowired
    private pedidosDao pedidosDao;

    @GetMapping
    public ResponseEntity<List<Fruta>> getFruta() {
        List<Fruta> fruta = pedidosDao.findAll();
        return ResponseEntity.ok(fruta);
    }
    
    @PostMapping
    public ResponseEntity<Fruta> createPedido(@RequestBody Fruta pedido) {
        Fruta newPedido = pedidosDao.save(pedido);
        return ResponseEntity.ok(newPedido);
    }

}
