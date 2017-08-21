// Наследование в ООП. Абстрактные классы. Интерфейсы.
// Парадигмы ООП :
// 1. Инкапсуляция (сокрытие реализации членов класса)
// 2. Наследование (наследование потомком членов класса родителя)
// 3. Полиморфизм (возможность объектов с одинаковой спецификацией,
//    иметь разную реализацию)
// 4. Абстракция (выделение значимых членов класса из общей массы)
// 5. Посылка сообщений (вызов методов из разных классов)
// 6. Повторное использование (использование уже готового кода)

// 2. Наследование
// extends (ключевое слово) - наследовать класс
// implements (ключевое слово) - реализовать интерфейс
// В Java запрещенно множественное наследование.
// Т.е. Вы не можете наследовать один класс от нескольких родителей
// class DerivedClass extends BaseClass1, BaseClass2 - так делать нельзя
// Рассмотрим разницу между Классом, абстракным классом, интерфейсом
// Класс (успрощенно) - это шаблон объекта, который Вы можете
//        явно создать с помощью конструктора класса,
//        наследовать этот класс, и он сам может быть наследником.
// Абстракный класс (упрощенно) - это шаблон ЗНАЧИМЫХ в предметной области
//        свойств (полей) и методов класса. Явно создать
//        объект абстракного класса - невозможно.
//        Но, можно привесте объект класса наследника
//        к типу абстрактного класса (так всегда и делают).
//        см. package bankexample и см package gameexample
// Интерфейс (упрощенно) - это подтип абстрактного класса,
//        в котором запрещена реализация методов.

// Ctrl + ЛКМ - переход к определению

class GameForTargetPlatform
        extends Game{

}