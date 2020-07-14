# DBExplorer
Программа позволяет просматривать содержимое любой базы данных PostgreSQL, обладает графическим интерфейсом. Можно видеть все схемы (schemas) в базе данных и просматривать содержимое любой таблицы в схеме (schema). 

Приложение обладает простейшей аутентификацией и в программу можно входить с двумя ролями: админ и гость. Есть функция фильтрации столюцов в таблице.
Гость может только смотреть таблицы и применять готовые фильтры, администратор может создавать, удалять фильтры, которые потому будут доступны всем пользователям. Фильтры будут сохранены для конкретной базы данных и сохраняются между сеансами.

Детали реализации:
- Java 14
- GUI : JavaFX 14
- Built using Maven
- DBMS: PostgreSQL

Выложенная версия содержит не только исходные файлы, но и все необходимые компоненты для работы приложения из коробки. 
Однако для работы использует базу данных, размещённую в облаке Azure, автор не следит за этим облаком, поэтому запуск приложения по инструкции ниже может быть невозможен. В этом случае нужно пересоздать базу данных приложения, некоторые SQL инструкции можно найти в папке resources/SQL. 

Чтобы запустить программу
- необходимо скачать архив из Github (или использовать Git для клонирования репозитория);
- распаковать архив;
- открыть папку app;
- запустить exec.bat (для Windows) и, возможно, немного подождать;

Можно использовать следующие логин / пароль: 
  admin / admin.
