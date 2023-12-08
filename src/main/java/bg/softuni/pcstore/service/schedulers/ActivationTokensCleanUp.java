package bg.softuni.pcstore.service.schedulers;

import bg.softuni.pcstore.service.UserActivationService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ActivationTokensCleanUp {
    private final UserActivationService userActivationService;

    public ActivationTokensCleanUp(UserActivationService userActivationService) {
        this.userActivationService = userActivationService;
    }

    @Scheduled(cron = "* 1 * * * *")
    public void cleanUp() {
        userActivationService.cleanUpLinks();
    }
}
