package basic.accessModifiers;

public class E {

    // ✅ private inner class - accessible only inside class E
    private class Inner1 {
        // Logic here
    }

    // ✅ protected inner class - accessible in same package and subclasses
    protected class Inner2 {
        // Logic here
    }

    // ❌ These are invalid: private/protected not allowed for top-level classes
    // private class E { }         // ❌ INVALID - top-level class cannot be private
    // protected class E { }      // ❌ INVALID - top-level class cannot be protected
}
