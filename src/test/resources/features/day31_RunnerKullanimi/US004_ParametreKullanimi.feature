
 #Parametreli method kullanimi icin file da "" icine aramak istedigimiz kelimeyi yazariz.
 # Daha sonra step definition da bir tane parametreli method olusturur.
 #Parametreli bir method olusturdugu icin file sadece istedigimiz kelimeyi degistirerek bunu birden fazla kez kullanabiliriz.
 #Boylece tekrar tekrar her step icin method olusturmamis oluruz. Asagidaki orneklerde de bunu gorebiliriz.
Feature: US004 TechproEducation Arama Testi
  Scenario: Tc01 Satfada Arama Yap
    Given Kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "mobile" aratir
    When cikan dropdawn'da mobil developer linkine tiklar
    And Sayfa basliginin qa icerdigini test eder
    And sayfayi kapatir.

  Scenario: Tc02 Satfada Arama Yap
    Given Kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "qa" aratir
    And sayfayi kapatir.

  Scenario: Tc03 Satfada Arama Yap
    Given Kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "java" aratir
    And sayfayi kapatir.

  Scenario: TC04 Sayfada Arama Yapar
    Given Kullanici "https://google.com" sayfasina gider

  Scenario: TC05 Sayfada Arama Yapar
    Given Kullanici "https://youtube.com" sayfasina gider

  Scenario: TC06 Sayfada Arama Yapar
    Given Kullanici "https://yahoo.com" sayfasina gider