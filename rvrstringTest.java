import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

class rvrstringTest{
    @Test
    public <String> void StringReverse() {
        if (rvrstring.method("").isEmpty()) {
            System.out.println("Empty");
        }
    }
    @Test
    public <String>void special() {
        if (rvrstring.method("  ").endsWith(" ")) {
            System.out.println("Extra spaces");
        }
        System.out.println("running");
    }
    @Test
    public <String> void StringReverse1() {
        if (rvrstring.method("*").matches("[!@#$%^&*()_+]")) {
            System.out.println("Contains Symbols");
        }
    }

    @Test
    public <String> void StringReverse2() {
        if (rvrstring.method("9").matches("[0-9]")) {
            System.out.println("Contains numbers");
        }
    }
}