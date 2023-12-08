package bg.softuni.pcstore.service.impl;

import bg.softuni.pcstore.model.entity.RoleEntity;
import bg.softuni.pcstore.model.entity.UserEntity;
import bg.softuni.pcstore.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class PcStoreUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    public PcStoreUserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .map(PcStoreUserDetailService::map)
                .orElseThrow(() -> new UsernameNotFoundException("User " + username + " not found!"));
    }
    private static UserDetails map(UserEntity userEntity) {
        return User
                .withUsername(userEntity.getUsername())
                .password(userEntity.getPassword())
                .authorities(map(userEntity.getRole()))
                .disabled(userEntity.isDisabled())
                .build();
    }

    private static GrantedAuthority map(RoleEntity roleEntity) {
        return new SimpleGrantedAuthority("ROLE_" + roleEntity.getRoleName().name());
    }
}
