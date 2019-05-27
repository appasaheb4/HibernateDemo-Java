package Database;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author appasaheb
 */
public class HibernateUtil {
    private  static  final SessionFactory sesssionFactory;
    static {
        try
        {
            sesssionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
            
        }
        catch(Throwable ex)
        {
            System.err.println("Error is see:"+ex);
            throw  new ExceptionInInitializerError(ex);
            
            
        }
        
    }
    public  static  SessionFactory getSessionFactory()
    {
        
        return  sesssionFactory;
    }
    
}
