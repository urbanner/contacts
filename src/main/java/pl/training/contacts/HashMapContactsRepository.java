package pl.training.contacts;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HashMapContactsRepository implements ContactsRepository {

    private Map<String, Contact> contacts = new HashMap<>();

    @Override
    public void add(Contact contact) {
        contacts.put(contact.getLastName(), contact);
    }

    @Override
    public Optional<Contact> getByLastName(String lastName) {
        return Optional.ofNullable(contacts.get(lastName));
    }

}
