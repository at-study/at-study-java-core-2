package tests.lesson12.xml_attributes;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlAttributesTest {
    
    @Test
    public void testAttributes() throws IOException {
        XmlMapper m = new XmlMapper();
        Address a = m.readValue(new File("src/test/java/tests/lesson12/xml_attributes/address.xml"), Address.class);

    }
}
