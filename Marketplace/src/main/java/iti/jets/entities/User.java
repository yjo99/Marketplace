package iti.jets.entities;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "marketplacedb", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User implements java.io.Serializable {

    private int userId;
    private Address address;
    private String firstName;
    private String lastName;
    private String gender;
    private String phone;
    private String email;
    private String password;
    private String creditCard;
    private Set<Userorderproduct> userorderproducts = new HashSet<Userorderproduct>(0);
    private Set<Userreviewproduct> userreviewproducts = new HashSet<Userreviewproduct>(0);

    public User() {
    }

    public User(int userId, Address address, String firstName, String lastName, String email, String password) {
        this.userId = userId;
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public User(int id, String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userId = id;
    }

    public User(int userId, Address address, String firstName, String lastName, String gender, String phone,
            String email, String password, String creditCard, Set<Userorderproduct> userorderproducts,
            Set<Userreviewproduct> userreviewproducts) {
        this.userId = userId;
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.creditCard = creditCard;
        this.userorderproducts = userorderproducts;
        this.userreviewproducts = userreviewproducts;
    }

    @Id
    @Column(name = "userId", unique = true, nullable = false)
    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addressId", nullable = true)
    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Column(name = "firstName", nullable = false, length = 45)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "lastName", nullable = false, length = 45)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "gender", length = 45)
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "phone", length = 11)
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "email", unique = true, nullable = false, length = 255)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "creditCard", length = 255)
    public String getCreditCard() {
        return this.creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public Set<Userorderproduct> getUserorderproducts() {
        return this.userorderproducts;
    }

    public void setUserorderproducts(Set<Userorderproduct> userorderproducts) {
        this.userorderproducts = userorderproducts;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public Set<Userreviewproduct> getUserreviewproducts() {
        return this.userreviewproducts;
    }

    public void setUserreviewproducts(Set<Userreviewproduct> userreviewproducts) {
        this.userreviewproducts = userreviewproducts;
    }

}
