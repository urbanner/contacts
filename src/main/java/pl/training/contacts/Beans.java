package pl.training.contacts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public ContactsRepository contactsRepository() {
        return new HashMapContactsRepository();
    }

    @Bean
    public ContactsService contactsService(ContactsRepository  contactsRepository) {
        return new ContactsService(contactsRepository);
    }

}
