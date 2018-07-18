package Utils;
/*
* <p> Class to include all common utility methods to be reused <p>
*
*
*     private static Class<?>

Class is a parametrizable class, hence you can use the syntax Class<T> where T is a type
You're declaring a Class object which can be of any type (? is a wildcard)
Class type is a type that contains metainformation about a class.
It's always good practice to refer to a generic type by specifying his specific type, by using Class<?>
you're respecting this practice (you're aware of Class to be parametrizable) but you're not restricting your
parameter to have a specific type.
"I know this is a generic class, but I don't know or care about the actual type, so instead of giving a concrete type
 I'm giving the ? wildcard.". If you don't give the wildcard, the compiler assumes that you either forgot the type or
 didn't know the class was generic and will warn you about it
Class is not known until runtime, making your code more dynamic


calling Class.forName(String) returns the Class object associated with the class or interface with the given string name
            String classname = "page_objects." +pagename;
            setPageObjectClass(Class.forName(classname));

            return: class passed ny callee 'pagename'

*/
