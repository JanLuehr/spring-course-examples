// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package net.gfu.seminar.spring.domain;

import net.gfu.seminar.spring.domain.Guest;

privileged aspect Guest_Roo_JavaBean {
    
    public String Guest.getFirstname() {
        return this.firstname;
    }
    
    public void Guest.setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String Guest.getLastname() {
        return this.lastname;
    }
    
    public void Guest.setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}
