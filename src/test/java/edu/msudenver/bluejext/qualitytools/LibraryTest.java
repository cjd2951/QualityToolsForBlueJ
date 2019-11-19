package edu.msudenver.bluejext.qualitytools;

import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    Library unit;

    @Before
    public void setup() {
        unit = new Library();
    }

    @Test
    public void isCompatible() {
        assertTrue(unit.isCompatible());
    }

    @Test
    public void getVersion() {
        assertEquals("0.0.01", unit.getVersion());
    }

    @Test
    public void getName() {
        assertEquals("Quality Tools", unit.getName());
    }

    @Test
    public void terminate() {
        unit.terminate();
    }

    @Test
    public void getDescription() {
        assertEquals("BlueJ extension that integrates quality assessment tools", unit.getDescription());
    }

    @Test
    public void getURL() throws MalformedURLException {
        URL url = new URL("https://github.com/MetroCS/QualityToolsForBlueJ");
        assertEquals(url, unit.getURL());
    }
}
