/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Truc;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LeRoux
 */
@Local
public interface TrucFacadeLocal {

    void create(Truc truc);

    void edit(Truc truc);

    void remove(Truc truc);

    Truc find(Object id);

    List<Truc> findAll();

    List<Truc> findRange(int[] range);

    int count();
    
}
