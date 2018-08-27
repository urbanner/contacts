package pl.training.contacts;

import java.util.Optional;

public interface ContactsRepository {

    void add(Contact contact);

    Optional<Contact> getByLastName(String lastName);

}
