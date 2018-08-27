package pl.training.contacts;
import org.aspectj.lang.annotation.*;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.event.ApplicationEventMulticaster;


@Aspect
public class SuspiciousPersonLogger  implements ApplicationEventPublisherAware {
    private static final String SEPARATOR = "ASPECT ##########################################################################";

    private ApplicationEventPublisher publisher;
    private ApplicationEventMulticaster caster;

    @AfterReturning("execution(void pl.training.contacts.ContactsService.add(..)) && args(contact)")
    public void check(Contact contact) {
        if (contact.getLastName().equals("Urbanski")) {
            System.out.format("%s\n%s\n", SEPARATOR, contact);
            publisher.publishEvent(contact);
        }
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        publisher = applicationEventPublisher;
    }
}
