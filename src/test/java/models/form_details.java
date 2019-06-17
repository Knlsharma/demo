
package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author knl
 */


@Entity
@Table(name="form_track")
public class form_details {
    
    
    @Id
    private int id;
    private String form_name; 
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the form_name
     */
    public String getForm_name() {
        return form_name;
    }

    /**
     * @param form_name the form_name to set
     */
    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }
    
    
    
    
}
