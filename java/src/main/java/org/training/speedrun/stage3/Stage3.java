package org.training.speedrun.stage3;

/**
 * Remove all the code duplications.
 */
public class Stage3 {

    public String doTheThing(String input) {

        String result = input;
        String preprocessedInput = specialCharactersToLowerCase(input);
        if (input.length() % 2 == 0) {
            return addPrefixTo(preprocessedInput, "even");
        }
        return addPrefixTo(preprocessedInput, "odd");
    }

    private String addPrefixTo(String result, String prefix) {
        String prefixedResult = prefix + "_" + result;
        if (result.length() < 10) {
            return "short_" + prefixedResult;
        }
        return "long_" + prefixedResult;
    }

    private String specialCharactersToLowerCase(String result) {
        result = replaceToLowerCase(result, 'A');
        result = replaceToLowerCase(result, 'E');
        result = replaceToLowerCase(result, 'I');
        result = replaceToLowerCase(result, 'O');
        result = replaceToLowerCase(result, 'U');
        result = replaceToLowerCase(result, 'Y');
        return result;
    }

    private String replaceToLowerCase(String result, char input) {
        result = result.replace(input, String.valueOf(input).toLowerCase().charAt(0));
        return result;
    }
}
