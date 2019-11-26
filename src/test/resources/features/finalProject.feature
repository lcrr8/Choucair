@Tag0
Feature: I as a user i want to evaluate the quality of the jobs section of the Choucair website, in
  this page i want to verify that the information is right, i want to search a job and register the required fields.

  @Tag1
  Scenario: Interact on the services section of the Choucair website
    Given That User wants to evaluate the quality on the jobs section of the Choucair website
    When The User enters and checks the sections like ¿What is it to be Choucair? Announcements, and Prepare to apply
    Then The User gets the information corresponding to each section like
      | toBe  | call           | apply   |
      | SER   | CONVOCATORIAS  | APLICAR |

  @Tag2
  Scenario: Search a job and register the required data on the jobs section of the Choucair website
    Given That User wants to search a job and insert the data
    When The User searches a job and registers the data in the required fields
      | fullName         |  email            | phone      | studies             | experience    | knowAtumation                            | salary  | timeFree  | message |
      | Leidy Ruiz Rojas |  email@gmail.com  | 3004564333 | mechatronic systems | No Experience | I know a little but i would like to learn|  1      |  Inmediata| Nothing |
    Then The User can see the send button but doesn't do it
      | out     |
      | ENVIAR  |
