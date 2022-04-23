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

    @Column(name="tipdoc", nullable = false, length = 100)
    private Long tipdoc;

    @Column(name="doc", nullable = false, length = 100)
    private String doc;

    @Column(name="payment_method", nullable = false, length = 100)
    private String firstname ;

    @Column(name="payment_method", nullable = false, length = 100)
    private String lastname;

    @Column(name = "birtdate", nullable = false, length = 100)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar birtdate;

    @Column(name="notify", nullable = false, length = 100)
    private Long notify;

    @Column(name="tac", nullable = false, length = 100)
    private Long tac;

    @Column(name="qty", nullable = false, length = 100)
    private Long qty;

    @OneToOne
    @JoinColumn(name = "userXMembership_id", nullable = false)
    private UserXMembership userXMembership;

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
        return doc;
    }

    public User setDoc(String doc) {
        this.doc = doc;
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

    public Long getQty() {
        return qty;
    }

    public User setQty(Long qty) {
        this.qty = qty;
        return this;
    }

    public UserXMembership getUserXMembership() {
        return userXMembership;
    }

    public User setUserXMembership(UserXMembership userXMembership) {
        this.userXMembership = userXMembership;
        return this;
    }
}
