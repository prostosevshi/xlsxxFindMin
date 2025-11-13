## N-th MINIMUM NUMBER SERVICE
Java + Spring Boot + Swagger + Excel

Описание проекта:
-----------------
Это Spring Boot REST-сервис, который находит N-ное минимальное число
из Excel-файла с одним столбцом целых чисел. 

Особенности:
- Swagger UI
- Один контроллер с одним методом:
    GET /api/nth-min?path=<ПУТЬ_К_ФАЙЛУ>&n=<НОМЕР_N>
- N-ое минимальное число ищется с помощью алгоритма QuickSelect

Инструкция по сборке и запуску:
--------------------------------
1. Клонируем проект:
   git clone <URL_репозитория>
   cd <папка_проекта>

2. Собираем проект:
   ./gradlew clean build

3. Запуск через Gradle:
   ./gradlew bootRun

4. Swagger UI доступен по адресу:
   http://localhost:8080/swagger-ui.html

Тестирование API через Swagger:
-------------------------------
- Метод: GET /api/nth-min
- Параметры:
  path=<абсолютный путь к локальному Excel-файлу>
  n=<номер минимального числа>
- Пример запроса:
  GET /api/nth-min?path=C:\data\numbers.xlsx&n=3

Возможные ответы:
- 200 OK: возвращает число
- 400 Bad Request: неверный путь, n <= 0, n > количество чисел
- 500 Internal Server Error: ошибка чтения файла (например, файл не Excel)
98
5
4567
356
76
3
1
