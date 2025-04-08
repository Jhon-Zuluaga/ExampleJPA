/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.examplejpa.persistence;

import co.edu.sena.examplejpa.model.KeyRoom;
import java.util.List;

/**
 *
 *  Fecha: 08/04/2025
 * @author Jhon Zuluaga
 * Objetivo: interface para DAO key
 */
public interface IKeyRoomDAO {
     public void insert (KeyRoom key) throws Exception;
        public void update (KeyRoom key) throws Exception;
        public void delete (KeyRoom key) throws Exception;
        public KeyRoom findById(Integer id) throws Exception;
        public List<KeyRoom> findAll() throws Exception;
}
