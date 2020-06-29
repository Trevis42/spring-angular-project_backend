package com.companyABC.ticket.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Ticket
 */
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" }) // dont delete stuff in db
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String grievance;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private Date messageDate;
    private boolean contact;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getMessageDate() {
        return this.messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public boolean isContact() {
        return this.contact;
    }

    public boolean getContact() {
        return this.contact;
    }

    public void setContact(boolean contact) {
        this.contact = contact;
    }

    public String getGrievance() {
        return this.grievance;
    }

    public void setGrievance(String grievance) {
        this.grievance = grievance;
    }
}