package pl.training.contacts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Beans.class)) {
            ContactsService contactsService = applicationContext.getBean(ContactsService.class);
            contactsService.add(new Contact("Jan", "Kowalski"));
            contactsService.add(new Contact("Szymon", "Urbanski"));
            System.out.println(contactsService.getByLastName("Kowalski"));
            System.out.println(contactsService.getByLastName("Urbanski"));
        }
    }

}
