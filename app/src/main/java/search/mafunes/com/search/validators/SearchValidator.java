package search.mafunes.com.search.validators;

public class SearchValidator {

    private SearchValidator() {};

    public static boolean isValid(String text){
        return (text != null) && (!text.isEmpty()) && (!text.replaceAll(" ", "").isEmpty());
    }
}
