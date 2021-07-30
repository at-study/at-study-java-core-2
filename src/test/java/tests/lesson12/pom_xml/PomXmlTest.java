package tests.lesson12.pom_xml;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import lections.lesson12.pom_xml.Project;

public class PomXmlTest {

    @Test
    public void pomXmlTest() throws IOException {
        XmlMapper mapper = new XmlMapper();
        Project xml = mapper.readValue(new File("C:\\Users\\George\\Desktop\\atstudyjavacore\\pom.xml"), Project.class);

    }
}
