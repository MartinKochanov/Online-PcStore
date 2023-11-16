package bg.softuni.pcstore.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;

@Entity
@Table(name = "verification_tokens")
public class VerificationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String token;
    private Instant created;
    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private UserEntity user;

    public Long getId() {
        return id;
    }

    public VerificationToken setId(Long id) {
        this.id = id;
        return this;
    }

    public String getToken() {
        return token;
    }

    public VerificationToken setToken(String token) {
        this.token = token;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public VerificationToken setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public Instant getCreated() {
        return created;
    }

    public VerificationToken setCreated(Instant created) {
        this.created = created;
        return this;
    }
}
