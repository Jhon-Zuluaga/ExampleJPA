/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejpa.persistence;

import co.edu.sena.examplejpa.model.KeyRoom;
import java.util.List;
import javax.persistence.Query;

/**
 *
 *  Fecha: 08/04/2025
 * @author Jhon Zuluaga
 * Objetivo:  Implementar DAO para modelo KeyRoom
 */
public class KeyRoomDAO implements IKeyRoomDAO{

    @Override
    public void insert(KeyRoom key) throws Exception {
         try {
            EntityManagerHelper.getEntityManager().persist(key);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public void update(KeyRoom key) throws Exception {
         try {
            EntityManagerHelper.getEntityManager().merge(key);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public void delete(KeyRoom key) throws Exception {
        try {
            EntityManagerHelper.getEntityManager().remove(key);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public KeyRoom findById(Integer id) throws Exception {
        try {
                 return EntityManagerHelper.getEntityManager().find(KeyRoom.class, id);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public List<KeyRoom> findAll() throws Exception {
        try {
                Query query = EntityManagerHelper.getEntityManager().createNamedQuery("KeyRoom.findAll");
                return query.getResultList();
        } catch (RuntimeException e) {
            throw e;
        }
    }
    
}
