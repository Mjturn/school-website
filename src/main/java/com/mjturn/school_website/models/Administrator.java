package com.mjturn.school_website.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="administrators")
public class Administrator extends User {
}
