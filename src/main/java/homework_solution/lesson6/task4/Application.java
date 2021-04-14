package homework_solution.lesson6.task4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Application {

    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        for (int i = 0; i < 500; i++) {
            persons.add(Person.random());
        }

        // Считаем типы документов:
        Map<IdentityDocumentType, Integer> counters = new TreeMap<>();
        for (IdentityDocumentType documentType : IdentityDocumentType.values()) {
            counters.put(documentType, 0);
        }
        for (Person person : persons) {
            IdentityDocumentType docType = person.getIdentityDocument().getDocumentType();
            counters.put(docType, counters.get(docType) + 1);
        }

        // Создадим список кодов документа, отсортированный в порядке убывания:
        List<String> identityDocumentTypeCodes = new ArrayList<>();
        for (IdentityDocumentType documentType : IdentityDocumentType.values()) {
            identityDocumentTypeCodes.add(documentType.getCode());
        }
        Collections.sort(identityDocumentTypeCodes);
        Collections.reverse(identityDocumentTypeCodes);

        // Выводим информацию на экран
        for (String code : identityDocumentTypeCodes) {
            IdentityDocumentType documentType = IdentityDocumentType.byCode(code);
            System.out.printf("%s (%s): %d%n", documentType.getDescription(), code, counters.get(documentType));
        }

        // Удаляем всех людей, у кого код документа не равен "21"
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (!person.getIdentityDocument().getDocumentType().getCode().equals("21"))
                iterator.remove();
        }

        System.out.println("Количество людей в списке: " + persons.size());


    }

}
