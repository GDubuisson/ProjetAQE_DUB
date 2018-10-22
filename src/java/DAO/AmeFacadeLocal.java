/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Ame;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LeRoux
 */
@Local
public interface AmeFacadeLocal {

    void create(Ame ame);

    void edit(Ame ame);

    void remove(Ame ame);

    Ame find(Object id);

    List<Ame> findAll();

    List<Ame> findRange(int[] range);

    int count();
    
}
