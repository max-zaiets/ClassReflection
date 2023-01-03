public class Main {
    public static void main(String[] args) {
        Class<Zebra> cl = Zebra.class;

        System.out.println((char) 27 + "[34m" + "Інформація про клас " + (char) 27 + "[39m");
        SomeClass.getClassName(cl);

        System.out.println((char) 27 + "[34m" + "Модифікатори класу " + (char) 27 + "[39m");
        SomeClass.modifierInfo(cl);

        System.out.println((char) 27 + "[34m" + "Поля класу " + (char) 27 + "[39m");
        SomeClass.fieldInfo(cl);

        System.out.println((char) 27 + "[34m" + "Конструктори класу " + (char) 27 + "[39m");
        SomeClass.constructorInfo(cl);

        System.out.println((char) 27 + "[34m" + "Методи класу " + (char) 27 + "[39m");
        SomeClass.methodInfo(cl);
    }
}
