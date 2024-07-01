package com.mjturn.school_website.mappers;

import com.mjturn.school_website.data_transfer_objects.UserDataTransferObject;
import com.mjturn.school_website.models.User;

public class UserMapper {
    public static UserDataTransferObject mapToUserDataTransferObject(User user) {
        return new UserDataTransferObject(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmailAddress(),
                user.getUsername(),
                user.getPassword()
        );
    }

    public static User mapToUser(UserDataTransferObject userDataTransferObject) {
        return new User(
                userDataTransferObject.getId(),
                userDataTransferObject.getFirstName(),
                userDataTransferObject.getLastName(),
                userDataTransferObject.getEmailAddress(),
                userDataTransferObject.getUsername(),
                userDataTransferObject.getPassword()
        );
    }
}
