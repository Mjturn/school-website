package com.mjturn.school_website.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student extends User {
}
