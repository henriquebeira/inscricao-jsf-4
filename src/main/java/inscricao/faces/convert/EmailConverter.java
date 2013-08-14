/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.convert;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Wilson
 */
@FacesConverter("EmailConverter")
public class EmailConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        return string == null || string.trim().isEmpty() ? null : Long.valueOf(string.replace("-", ""));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        String email = (String) o;
        return String.format("%09d-%02d", email, email);
    }
    
}
