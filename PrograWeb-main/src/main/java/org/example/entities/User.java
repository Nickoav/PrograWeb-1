package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name="users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="email", nullable = false, length = 100)
    private String email;

    @Column(name="password", nullable = false, length = 100)
    private String password;

    @Column(name="nickname", nullable = false, length = 100)
    private String nickname;

    @Column(name="tipdoc", nullable = false)
    private Long tipdoc;

    @Column(name="document", nullable = false, length = 100)
    private String document;

    @Column(name="firstname", nullable = false, length = 100)
    private String firstname ;

    @Column(name="lastname", nullable = false, length = 100)
    private String lastname;

    @Column(name = "birtdate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar birtdate;

    @Column(name="notify", nullable = false)
    private Long notify;

    @Column(name="tac", nullable = false)
    private Long tac;

    @Column(name="quantity", nullable = false)
    private Long quantity;

    @OneToOne
    @JoinColumn(name = "user_membership_id", nullable = false)
    private User_Membership user_membership;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public User setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public Long getTipdoc() {
        return tipdoc;
    }

    public User setTipdoc(Long tipdoc) {
        this.tipdoc = tipdoc;
        return this;
    }

    public String getDoc() {
        return document;
    }

    public User setDoc(String document) {
        this.document = document;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public User setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public User setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public Calendar getBirtdate() {
        return birtdate;
    }

    public User setBirtdate(Calendar birtdate) {
        this.birtdate = birtdate;
        return this;
    }

    public Long getNotify() {
        return notify;
    }

    public User setNotify(Long notify) {
        this.notify = notify;
        return this;
    }

    public Long getTac() {
        return tac;
    }

    public User setTac(Long tac) {
        this.tac = tac;
        return this;
    }

    public Long getQuantity() {
        return quantity;
    }

    public User setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public User_Membership getUser_Membership() {
        return user_membership;
    }

    public User setUser_Membership(User_Membership user_membership) {
        this.user_membership = user_membership;
        return this;
    }
}
