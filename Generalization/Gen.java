/*
* простой обобщенный класс
* Здесь Т обозначает параметр типа,
* который будет заменен реальным типом
* при создании объекта типа Gen
*/

public class Gen<T> {
    T ob; // Объфвить объект типа Т

    // Передать констркутору ссылку на объект типа Т
    Gen(T o) {
        ob = o;
    }

    // вщзвратить объект ob
    T getOb() {
        return ob;
    }

    // показать тип Т
    void showType() {
        System.out.println("Типом Т является: " + ob.getClass().getName());
    }
}


// Продемострировать применение обобщенного класса
class GenDemo {
    public static void main(String[] args) {
        // Создать ссылку типа Gen для целых чисел
        Gen<Integer> iOb;
        /*
        * Создать объект типа Gen<Integer> и присвоить
        * ссылку на него переменной iOb. Обратите внимание
        * на применение автоупаковки для инкапсуляции значения 88
        * в объекте типа Integer
        */
        iOb = new Gen<Integer>(88);

        // Показать тип данных, хранящихся в переменной iOb
        iOb.showType();

        /*
        * Получиь значение переменной iOb. Обратите внимание но то,
        * что для этого не требуется никакого приведения типов
        */
        int v = iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        // создать люъект типа Gen для символьных строк
        Gen<String> strOb = new Gen<String>("Тест сообщений ");

        // показать тип данных, хранящихся в переменной strOb
        strOb.showType();

        /* Получить значение переменной strOb. И в этом случае
        * приведение типов не требуется */
        String str = strOb.getOb();
        System.out.println("Значение: " + str);

        /*
        * Вывод программы
        * Типом Т является: java.lang.Integer
        * Значение: 88
        *
        * Типом Т является: java.lang.String
        * Значение: Тест сообщений:
        */
    }
}
