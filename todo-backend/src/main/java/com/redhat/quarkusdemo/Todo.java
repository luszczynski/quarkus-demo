package com.redhat.quarkusdemo;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Todo extends PanacheEntity {
    public String title;
    public String description;
    @Column(name = "ordering")
    public int order;
}