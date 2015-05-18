/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.gr1simplereg.mb;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
import tr.gov.ptt.gr1simplereg.dto.User;

/**
 *
 * @author Administrator
 */
@ManagedBean
@RequestScoped
public class UserController {
    
    private User registrationUser;

    public UserController() {
        this.registrationUser = new User();
    }

    public User getRegistrationUser() {
        return registrationUser;
    }

    public void setRegistrationUser(User registrationUser) {
        this.registrationUser = registrationUser;
    }
    
    public String Register()
    {
        System.out.println("Regsiter User : "+this.registrationUser);
        String msg = "User registered successfully";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sonuç", msg));
        FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
        return "registration.jsf?faces-redirect=true";//redirect ettiğimiz sayfanın adının browserda görünmesi için true yapılır.
    }
    
    
}
