[![CircleCI](https://circleci.com/gh/imadham/pet-clinic.svg?style=svg)](https://circleci.com/gh/imadham/pet-clinic)

# pet-clinic

Для начала приложения используем команду "mvn clean install spring-boot:run" и по ссылке "http://localhost:8080/"

В данной работе проект разделён на два пакета:
  1-й пакет содержит модули проекта,
  2-й пакет содержит контроллеры, форматеры и шаблоны HTML 

# Модули проекта 
  BaseEntity: модуль, от которого наследуются все модули (содержит ID)
  Person: модуль, от которого наследуют ветеринар и владелец (содержит Ф.И.)
  Owner: Данные владельца (адрес, телефон, домашние животные...)
  Pet: Данные домашнего животного(имя, тип, дата рождения)
  PetType: тип животного
  Vet: Данные ветеринара(имя, специальности...)
  Specialty: специальность
  Visit: дата визита к ветеринару и болезни животного
 
 # ERD
![alt text](https://github.com/imadham/pet-clinic/blob/master/blob/ERD.png)
 
# Сервисы
  Проект содержет сервисы для каждого модуля.
  Сервисы реализуются, используя CrudRepository (и есть пример реализации, используя hashmap)
 
# Контроллеры
  В контроллерах используется mapping(RequestMapping, get/post mapping) WebDataBinder, Model и ModelAndView
  
# template engine
  Используется thymeleaf
  
# Тестирования
  Mockito, JUnit

# БД
  существует два варианта БД:
    h2 и mysql.
  Для h2 используем класс bootstrap, в котором загружаются данные.
  Для выбора БД используется файл application.properties
  https://github.com/imadham/pet-clinic/blob/master/pet-clinic-web/src/main/resources/application.properties
