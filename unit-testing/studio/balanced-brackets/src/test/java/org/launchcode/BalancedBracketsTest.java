package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    //POSITIVE TESTS

    @Test
    public void onlyOneBracketsReturnsTrue() {
        String msg = "Returns true for only one set of correct order balanced brackets";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), msg);
    }

    @Test
    public void multipleOnlyBracketsReturnsTrue() {
        String msg = "Returns true when multiple sets of correct order balanced brackets";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"), msg);
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"), msg);
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"), msg);

    }

    @Test
    public void emptyStringReturnsTrue() {
        String msg = "Returns true with an empty string";
        assertTrue(BalancedBrackets.hasBalancedBrackets(""), msg);
    }

    @Test
    public void noBracketsReturnsTrue() {
        String msg = "Returns true with no brackets in string";
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launchcode"), msg);
    }
    @Test
    public void lettersAndBracketsReturnTrue() {
        String msg = "Returns true for string with single set of correct order balanced brackets no matter placement in string";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launchcode"), msg);
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]code"), msg);
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"), msg);
    }

    @Test
    public void multipleBracketsStringReturnsTrue() {
        String msg = "Returns true with multiple correct order brackets no matter placement in string";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[Launch]]]code"), msg);
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[Launchcode]]]"), msg);
        assertTrue(BalancedBrackets.hasBalancedBrackets("[L][a][u][n][c][h]"), msg);
    }

    //NEGATIVE TESTS

    @Test
    public void singleOpeningBracketReturnsFalse() {
        String msg = "Returns false for single opening bracket";
        assertFalse(BalancedBrackets.hasBalancedBrackets("["), msg);
    }

    @Test
    public void singleClosingBracketReturnsFalse() {
        String msg = "Returns false for single closing bracket";
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"), msg);
    }

    @Test
    public void singleBracketsInStringReturnsFalse() {
        String msg = "Returns false for single brackets no matter placement with string";
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode"), msg);
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[code"), msg);
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launchcode["), msg);
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launchcode"), msg);
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]code"), msg);
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launchcode]"), msg);
    }

    @Test
    public void nonBalancedBracketsReturnFalse() {
        String msg = "Returns false when brackets not balanced";
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch]code"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]code]]"));
    }

    @Test
    public void reverseOrderBracketReturnFalse() {
        String msg = "Returns false when brackets in reverse order with or without string no matter placement";
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("][Launchcode"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launch[code"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launchcode["));
    }

    @Test
    public void nonBalancedReverseOrderBracketsReturnFalse() {
        String msg = "Returns false when brackets not balanced in reverse order with or without string no matter placement";
        assertFalse(BalancedBrackets.hasBalancedBrackets("][Launchcode]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("][Launch[code"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch][code]"));
    }
}