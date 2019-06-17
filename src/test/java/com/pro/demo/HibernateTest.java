
package com.pro.demo;

import models.form_details;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateTest
{

 public static void main(String args[])
            
    {
        
 //  form_details e1 = new from_details ();
  // form_details e2 = new from_details ();

        
  form_details e1 = new form_details ();
  form_details e2 = new form_details ();
        
  e1.setForm_name("ABC");
  e2.setForm_name("BCD");
  
   StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
 Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
  
SessionFactory factory = meta.getSessionFactoryBuilder().build(); 
  
  
  Session session = factory.openSession(); 
  session.beginTransaction();
  session.save(e1);
  session.save(e2);
  
  
    
}
}
