package bg.softuni.pcstore.service;

import bg.softuni.pcstore.model.dto.UserRegisterDto;

public interface UserService {
    void register(UserRegisterDto userRegisterDto);

    boolean activateAccount(String token);
}
