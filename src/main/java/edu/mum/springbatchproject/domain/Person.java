package edu.mum.springbatchproject.domain;



import org.springframework.batch.item.ResourceAware;
import org.springframework.core.io.Resource;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Person.findPersonByFirstname", query = "SELECT p.firstname FROM Person p  where p.firstname =:person"),
        @NamedQuery(name = "Person.findPersonById", query = "SELECT p.id FROM Person p where p.id =:id"),
        @NamedQuery(name = "Person.getAllPerson", query = "SELECT  p.firstname,p.lastname, p.gpa, p.dob FROM Person p where p.id is not null"),
})


public class Person implements ResourceAware {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "FirstName")
    private String firstname;

    @Column(name = "LastName")
    private String lastname;

    @Column(name = "GPA")
    private Double gpa;

    @Column(name = "DOB")
    private int dob;

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Double getGpa() {
        return gpa;
    }

    public int getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gpa=" + gpa +
                ", dob=" + dob +
                '}';
    }

    @Override
    public void setResource(Resource resource) {
        this.firstname = resource.getFilename ();

    }
}
