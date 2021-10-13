#Autor Lewis Vargas Florez
  @stories
  Feature: Página uTest
    As a professional I want to learn new topics in technology and they recommended the uTest page to me
  @Scenario1
  Scenario: I search the internet for the uTest page
    Given Jose click on Join Today to start filling in the basic user data
    | strName | strLastName | strEmail | strDate |
    | Nombre  | Apellidos   | Correo   | FechaN  |
    When He continues to fill out the form with secondary data that the page indicates
    | strCity | strZipCode | strCountry | strComputador | strVersion | strLenguage | strMobile | strModel | strSystemOperating |
    | Ciudad  | Postal     | Pais       | Computador    | Version    | Lenguaje     | Celular   | Marcar   | SistemaOperativo  |
    Then They ask you as a user to establish a password to log in
    | strPassword | strConfirmPassword |
    | Clave       | ConfirmarClave     |
