package pl.training.contacts;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class ContactsService {

    @NonNull
    private ContactsRepository contactsRepository;

    public void add(Contact contact) {
        contactsRepository.add(contact);
    }

    public Optional<Contact> getByLastName(String lastName) {
        return contactsRepository.getByLastName(lastName);
    }

}
