package tests.lesson12;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import lections.lesson12.inheritance.Cat;
import lections.lesson12.library.Book;
import lections.lesson12.library.Library;
import lections.lesson12.pom_xml.Project;

public class XmlTests {

    @Test
    public void simpleCatXmlTest() throws IOException {
        Cat cat = new Cat("Барсик", 3, 4);
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(cat);

        xmlMapper.writeValue(System.out, cat);

       // Cat cat1 = xmlMapper.readValue(new File("src/test/java/tests/lesson12/cat.xml"), Cat.class);
    }

    @Test
    public void libraryBooksTest() throws IOException {
        List<Book> books = Arrays.asList(new Book(2), new Book(100), new Book(555));
        Library library = new Library(books);

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(System.out, library);
    }

    @Test
    public void pomXmlTest() throws IOException {
        XmlMapper mapper = new XmlMapper();
        Project xml = mapper.readValue(new File("C:\\Users\\George\\Desktop\\atstudyjavacore\\pom.xml"), Project.class);
    }
}
