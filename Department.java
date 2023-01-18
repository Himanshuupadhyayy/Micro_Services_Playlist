package com.emp.entity;

import javax.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deptId;

    private String deptName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Manager manager;

}
