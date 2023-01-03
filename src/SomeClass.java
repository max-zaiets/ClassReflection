import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class SomeClass {
    public static void getClassName (Class<?> cl) {
        System.out.print(cl + "\n");
    }

    public static void fieldInfo  (Class<?> cl) {
        System.out.println((char) 27 + "[33m" + "\tPublic поля класу" + (char) 27 + "[39m");
        Field[] fieldPublic = cl.getFields();
        for (Field temp : fieldPublic) {
            System.out.println(temp);
        }
        System.out.println((char) 27 + "[33m" + "\tУсі поля класу" + (char) 27 + "[39m");
        Field[] field = cl.getDeclaredFields();
        for (Field temp : field) {
            System.out.println(temp);
        }
    }

    public static void modifierInfo (Class<?> cl) {
        int mods = cl.getModifiers();
        if (Modifier.isPrivate(mods)) {
            System.out.print("private ");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.print("abstract ");
        }
        if (Modifier.isStatic(mods)) {
            System.out.print("static ");
        }
        if (Modifier.isFinal(mods)) {
            System.out.print("final ");
        }
        System.out.println();
    }
    public static void constructorInfo(Class<?> cl) {
        Constructor<?>[] constructor = cl.getConstructors();
        for (Constructor<?> temp : constructor) {
            System.out.println(temp);
        }


    }
    public static void methodInfo(Class<?> cl) {
        Method[] method = cl.getMethods();
        for (Method temp : method) {
            System.out.println(temp);
        }
    }
}
