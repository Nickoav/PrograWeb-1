package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name="User_Memberships")
public class User_Membership implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "indate", nullable = false, length = 100)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar indate;
    
    @Column(name = "exdate", nullable = false, length = 100)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar exdate;

    @Column(name="cycle", nullable = false, length = 100)
    private Long cycle;

    @ManyToOne
    @JoinColumn(name = "membership_id", nullable = false)
    private Membership membership;

    public Long getId() {
        return id;
    }

    public User_Membership setId(Long id) {
        this.id = id;
        return this;
    }

    public Calendar getIndate() {
        return indate;
    }

    public User_Membership setIndate(Calendar indate) {
        this.indate = indate;
        return this;
    }

    public Calendar getExdate() {
        return exdate;
    }

    public User_Membership setExdate(Calendar exdate) {
        this.exdate = exdate;
        return this;
    }

    public Long getCycle() {
        return cycle;
    }

    public User_Membership setCycle(Long cycle) {
        this.cycle = cycle;
        return this;
    }

    public Membership getMembership() {
        return membership;
    }

    public User_Membership setMembership(Membership membership) {
        this.membership = membership;
        return this;
    }
}
