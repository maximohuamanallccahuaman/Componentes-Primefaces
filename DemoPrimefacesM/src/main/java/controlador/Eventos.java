
package controlador;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.TabChangeEvent;
import org.primefaces.event.TabCloseEvent;
import org.primefaces.event.ToggleEvent;

@Named
@RequestScoped
public class Eventos {
    
//    Eventos del TabView y Accordion
    public void onTabChange(TabChangeEvent event) {
        FacesMessage msg = new FacesMessage("Abierto", "Tab Activado: " + event.getTab().getTitle());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void onTabClose(TabCloseEvent event) {
        FacesMessage msg = new FacesMessage("Cerrar", "Tab Cerrado: " + event.getTab().getTitle());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
//    Eventos del Fieldset
    public void handleToggle(ToggleEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Toggled", "Visibilidad:" + event.getVisibility());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
