package pl.training.contacts;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class SuspiciousCustomerEvent extends ApplicationEvent {

    private Contact contact;

    public SuspiciousCustomerEvent(Object source) {
        super(source);
    }

}
