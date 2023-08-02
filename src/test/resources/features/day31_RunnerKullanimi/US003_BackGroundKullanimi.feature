@tech
Feature: US001 TechProEducation Sayfasi Testi

  #Feature file içinde Scenario larda ortak kullanilan step'lerde Background: yapisini kullanabiliriz.
  #Her scenario'dan önce buradaki step çalışır sonra scenario'daki stepler çalişmaya devam eder

  Background: Kullanici TechProEducation Sayfasina Gider
    Given Kullanici techpro sayfasina gider

  Scenario: Tc01 Satfada Arama Yap
    Then arama kutusunda qa aratir
    And Sayfa basliginin qa icerdigini test eder


  Scenario: TC02 Sayfada Arama Yapar
    Then arama kutusunda java aratir
    And Sayfa basliginin java icerdigini test eder.



  Scenario: TC03 Sayfada Arama Yapar
    Then arama kutusunda mobil aratir
    When cikan dropdawn'da mobil developer linkine tiklar
    And Sayfa basliginin mobil icerdigini test eder.
    And sayfayi kapatir.

    # Featurelarin istedigimiz siraya gore veya alfabetik olarak calismasini istiyorsak file larin basina a b c vs gibi koyabiliriz