package search.mafunes.com.search;

import org.junit.Test;

import search.mafunes.com.search.validators.SearchValidator;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class SearchValidatorTest {

    @Test
    public void stringNoEmpty() throws Exception {
        assertTrue(SearchValidator.isValid("query"));
    }

    @Test
    public void stringBlank() throws Exception {
        assertFalse(SearchValidator.isValid(" "));
    }

    @Test
    public void stringEmpty() throws Exception {
        assertFalse(SearchValidator.isValid(""));
    }
}