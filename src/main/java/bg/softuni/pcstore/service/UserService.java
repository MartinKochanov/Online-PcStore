package bg.softuni.pcstore.service;

import bg.softuni.pcstore.model.dto.UserShortSummaryDTO;
import bg.softuni.pcstore.model.dto.UserRegisterDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    void register(UserRegisterDto userRegisterDto);

    boolean activateAccount(String token);

    Page<UserShortSummaryDTO> getAllUsers(Pageable pageable, String keyword);

    void deleteUser(String username);

    void makeAdmin(String username);
}
