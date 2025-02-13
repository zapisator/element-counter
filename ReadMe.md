# element-counter
## Описание
Этот проект содержит реализацию утилиты для подсчета элементов в списке/массиве на Java и Groovy.
## Задание
### Цель:
Написать утилиту, которая подсчитывает количество каждого уникального элемента в списке и возвращает ассоциативный массив (Map), где:
- ключ – элемент списка
- значение – количество этих элементов в списке.

**Пример**:
```
[1, 3, 4, 5, 1, 5, 4] -> {1 : 2, 3 : 1, 4 : 2, 5 : 2}
```

**Требования**:
- Реализовать утилиту на двух языках: Java и Groovy.
- Обе реализации должны находиться в одном проекте Gradle.
- Предусмотреть обработку крайних случаев (пустой список, список с null значениями).
- Написать unit-тесты для проверки корректности работы.

Структура проекта
```
element-counter/
├── settings.gradle
├── build.gradle       
    └── src/
        └── main/
            ├── groovy/
                └── org/example/
                    └── ElementCounterGroovy.java    
            └── java/
                └── org/example/
                    └── ElementCounterJava.java
        └── test/
            ├── groovy/
                └── org/example/
                    └── ElementCounterGroovyTest.java    
            └── java/
                └── org/example/
                    └── ElementCounterJavaTest.java
```
### Запуск тестов
```bash
./gradlew test
```

### Замечания
Java и Groovy реализации могут по-разному обрабатывать null значения в списке.
Подробности реализации и обработки крайних случаев смотрите в коде и тестах.
