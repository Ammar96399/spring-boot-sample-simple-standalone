package sample.simple.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import sample.simple.interfaces.IClient;
import sample.simple.interfaces.IRun;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Client implements IClient, IRun {
    private Long id;
    private String name;
    private LocalDateTime dateOfBirth;
    private Address address;
    private String phoneNumber;
    private String email;
    private Long bankAccountAddress;

    private @Nullable Runnable callback;

    @Override
    public void run() {
        if (Objects.nonNull(this.callback)) {
            this.callback.run();
        }
    }

    public void registerCallback(Runnable callback) {
        this.callback = callback;
    }
}
