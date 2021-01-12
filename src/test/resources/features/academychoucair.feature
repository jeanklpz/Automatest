# Autor: Jean Lopez
  @stories
  Feature: Academy Choucair
    As a user, i want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario Outline: search for an automation course
    Given than LeBron wants to learn automation at the Choucair academy
    | strUser       | strPassword   |
    |   <strUser>   | <strPassword> |
    When he search for the course on the Choucair academy platform
    | strCourse    |
    |  <strCourse> |
    Then he finds the course called resources
    | strCourse      |
    | <strCourse>  |

    Examples:
      | strUser       | strPassword   | strCourse                             |
      | 1123634455    | Choucair2020* | Prueba Técnica - Analista Bancolombia |