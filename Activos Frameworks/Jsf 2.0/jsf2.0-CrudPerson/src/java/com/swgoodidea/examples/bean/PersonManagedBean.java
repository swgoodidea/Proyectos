/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swgoodidea.examples.bean;

import com.swgoodidea.examples.pojo.Person;
import com.swgoodidea.examples.type.ViewOperationType;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author USUARIO
 */
@ManagedBean
@SessionScoped
public class PersonManagedBean {

    /**
     * Creates a new instance of PersonManagedBean
     */
    private ViewOperationType viewOperationType;
    
    private Person personSession;
    
    private List<Person> personList;
    
    private String MESSAGE_OK = "EL REGISTRO, FUE SATISFACTORIAMENTE: ";
    
    public PersonManagedBean() {
    }
    
    @PostConstruct
    public void init(){
        personSession = new Person();
        personList = new ArrayList<Person>();
        this.viewOperationType = ViewOperationType.REGISTER;
    }
    
    public void savePerson(){
        //We can save DataBase
        if(this.viewOperationType.equals(ViewOperationType.MODIFIED)){
            for(Person person: this.personList){
                if(person.getId().equals(this.personSession.getId())){
                    person = this.personSession;break;
                }
            }
        }else{
           System.out.println(personSession.toString());
           personList.add(personSession);
           personSession.setId(new Long(this.personList.size()+1));
           personSession = new Person();
        }
        
    }
    
    public void selectPersonObjectModified(Person person){
        System.out.println(person.toString());
        this.personSession = person;
        this.viewOperationType = ViewOperationType.MODIFIED;
    }
    
    public void selectPersonObjectDelete(Person person){
        System.out.println(person.toString());
        this.viewOperationType = ViewOperationType.DELETE;
        this.personList.remove(person);
    }
    
    public String getMessageResponse(){
        return MESSAGE_OK+ this.viewOperationType.getValue();
    }
    
    public void resetViewOperation(){
        this.viewOperationType = ViewOperationType.REGISTER;
        this.personSession = new Person();
    }

    public Person getPersonSession() {
        return personSession;
    }

    public void setPersonSession(Person personSession) {
        this.personSession = personSession;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public String getMESSAGE_OK() {
        return MESSAGE_OK;
    }

    public void setMESSAGE_OK(String MESSAGE_OK) {
        this.MESSAGE_OK = MESSAGE_OK;
    }
}