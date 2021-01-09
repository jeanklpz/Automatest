# Autor: Jean Lopez
  @stories
  Feature: Academy Choucair
    As a user, i want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: search for an automation course
    Given than LeBron wants to learn automation at the Choucair academy
    | strUser       | strPassword   |
    | 1123634455    | Choucair2020* |
    When he search for the course on the Choucair academy platform
    | strCourse                 |
    | Prueba Técnica - Analista Bancolombia  |
    Then he finds the course called resources
    | strCourse                               |
    | Prueba Técnica - Analista Bancolombia  |