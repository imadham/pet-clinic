[![CircleCI](https://circleci.com/gh/imadham/pet-clinic.svg?style=svg)](https://circleci.com/gh/imadham/pet-clinic)

# pet-clinic

Для начала предложения используем команду "mvn clean install spring-boot:run" и по ссылке "http://localhost:8080/"

В данной работы проект разделён на два пакета
  1-й пакет содержет модули проекта
  2-й пакет содержет контроллеры, форматеры и шаблоны HTML 

# Модули проекта 
  BaseEntity: модул от которого наследуются все модули (содержит ID)
  Person: модуль от которого наследуют ветеринар и владелец (содержит Ф.И.)
  Owner: Данные владелца (адрес, телефон, домашние животные...)
  Pet: Данные домашного животного(имя, тип, дата рождения)
  PetType: тмп животного
  Vet: Данные ветеринара(имя, специальности...)
  Specialty: специальность
  Visit: дата визита к ветеринару и болезни животного
 
 # ERD
![alt text](https://github.com/imadham/pet-clinic/blob/master/blob/ERD.png)
 
# Сервисы
  Проект содержет сервисы для каждого модуля
  Сервисы реалезуются испульзуя CrudRepository (и есть пример реализации используя hashmap)
 
# Конроллеры
  В контроллеры используется mapping(RequestMapping, get/post mapping) WebDataBinder, Model и ModelAndView
  
# template engine
  Используется thymeleaf
  
# Тестирования
  Mockito, JUnit

# БД
  существует два варианта БД:
    h2 и mysql
  Для h2 используем класс bootstrap в котором
  Для выбора БД исползуется файл application.properties
  https://github.com/imadham/pet-clinic/blob/master/pet-clinic-web/src/main/resources/application.properties
