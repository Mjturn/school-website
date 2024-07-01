package com.mjturn.school_website.data_transfer_objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDataTransferObject {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String username;
    private String password;
}
