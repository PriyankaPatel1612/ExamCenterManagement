
package Bean;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private long s_id;
    private String name, address, contact, admission_date, course, payment, password;
    private double fees;
    
    @Column(unique = true, nullable = false)
    private String username;
    public Student( String name, String address, String contact, double fees, String admission_date, String course, String payment, String username, String password) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.fees = fees;
        this.admission_date = admission_date;
        this.course = course;
        this.payment = payment;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    public String getAdmission_date() {
        return admission_date;
    }

    public void setAdmission_date(String admission_date) {
        this.admission_date = admission_date;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
    
    
}
