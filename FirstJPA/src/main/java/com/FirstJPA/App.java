package com.FirstJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory   emf= Persistence.createEntityManagerFactory("pu");    
  EntityManager em = emf.createEntityManager();
   em.getTransaction().begin();
System.out.println("connected to database");
em.getTransaction().commit();

}
}