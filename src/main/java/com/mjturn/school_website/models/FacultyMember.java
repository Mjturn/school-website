package com.mjturn.school_website.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="faculty_members")
public class FacultyMember extends User {
}
