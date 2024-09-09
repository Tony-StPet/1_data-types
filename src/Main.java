//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
// Целочисленные типы
        System.out.println("Целочисленные типы");
// byte
        byte b = 127;
        System.out.println("byte");
        System.out.println("b=" + b); // Вывод: 127
        b = -128;
        System.out.println("b=" + b); // Вывод: -128

// short
        System.out.println("short");
        short s = 32767;
        System.out.println("s=" + s); // Вывод: s=32767
        s = -32768;
        System.out.println("s=" + s); // Вывод: s=-32768

// int
        System.out.println("int");
        int i = 2147483647;
        System.out.println("i=" + i); // Вывод: i=2147483647
        i = -2147483648;
        System.out.println("i=" + i); // Вывод: i=-2147483648

// long
        System.out.println("long");
        long l = 9223372036854775807L;
        System.out.println("l=" + l); // Вывод: l=9223372036854775807
        l = -9223372036854775808L;
        System.out.println("l=" + l); // Вывод: l=-9223372036854775808

// Числа с плавающей точкой
        System.out.println("Числа с плавающей точкой");
// float
        System.out.println("float");
        float f = 3.14f;
        System.out.println("f=" + f); // Вывод: 3.14
        f = -3.14f;
        System.out.println("f=" + f); // Вывод: -3.14

// double
        System.out.println("double");
        double d = 3.14159265358979;
        System.out.println("d=" + d); // Вывод: 3.14159265358979
        d = -3.14159265358979;
        System.out.println("d=" + d); // Вывод: -3.14159265358979


// char - символьный тип
        System.out.println("символьный тип");
        System.out.println("char");
        char c = 'A';
        System.out.println("char c" + c); // Вывод: A
        c = '\u0041'; // Шестнадцатеричный код символа 'A'
        System.out.println("char c" + c); // Вывод: A

// Логический тип
        System.out.println("Логический тип");
// boolean
        System.out.println("boolean");
        boolean bool = true;
        System.out.println(bool); // Вывод: true
        bool = false;
        System.out.println(bool); // Вывод: false

//Ссылочные типы
        System.out.println("Ссылочные типы");
// String
        System.out.println("String - строка");
        String str = "Hello, World!";
        System.out.println(str); // Вывод: Hello, World!
        str = new String("Hello, World!");
        System.out.println(str); // Вывод: Hello, World!

// Массив
        System.out.println("Массив");
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for (int num : arr) {
            System.out.print(num + " "); // Вывод: 1 2 3 4 5
        }

        System.out.println(); // Просто пустая строка
// Класс
        System.out.println("Класс");
        class Person {
            String name;
            int age;
        }
        Person person = new Person();
        person.name = "John Doe";
        person.age = 30;
        System.out.println(person.name); // Вывод: John Doe
        System.out.println(person.age); // Вывод: 30

// Интерфейс
        interface Shape {
            double getArea();
        }

    }
}