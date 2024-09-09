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

// float
        float f = 3.14f;
        System.out.println(f); // Вывод: 3.14
        f = -3.14f;
        System.out.println(f); // Вывод: -3.14

// double
        double d = 3.14159265358979;
        System.out.println(d); // Вывод: 3.14159265358979
        d = -3.14159265358979;
        System.out.println(d); // Вывод: -3.14159265358979



// char - символьный тип
        System.out.println("char");
        char c = 'A';
        System.out.println(c); // Вывод: A
        c = '\u0041'; // Шестнадцатеричный код символа 'A'
        System.out.println(c); // Вывод: A
    }
}