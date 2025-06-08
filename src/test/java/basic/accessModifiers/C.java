package basic.accessModifiers;

public class C {
    /*
     ✅ Access Modifier Rules for Classes in Java

     Modifier      | Allowed on Top-Level Class? | Allowed on Inner Class? | Accessible From
     -----------------------------------------------------------------------------------------
     public        | ✅ Yes                      | ✅ Yes                   | ✅ Same class
                   |                             |                          | ✅ Same package
                   |                             |                          | ✅ Subclass (even in other packages)
                   |                             |                          | ✅ Other packages

     default       | ✅ Yes                      | ✅ Yes                   | ✅ Same class
     (no modifier) |                             |                          | ✅ Same package

     protected     | ❌ No                       | ✅ Yes                   | ✅ Same class
                   |                             |                          | ✅ Same package
                   |                             |                          | ✅ Subclass (even in other packages)

     private       | ❌ No                       | ✅ Yes                   | ✅ Same class only
    */

    // You can add class logic here if needed
}
