package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="memberships")
public class Membership implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable = false, length = 100)
    private String name;

    @Column(name="desc", nullable = false, length = 100)
    private String desc;

    @Column(name="cost", nullable = false, length = 100)
    private Float cost;

    public Long getId() {
        return id;
    }

    public Membership setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Membership setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Membership setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Float getCost() {
        return cost;
    }

    public Membership setCost(Float cost) {
        this.cost = cost;
        return this;
    }

}
