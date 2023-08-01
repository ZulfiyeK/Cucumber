Feature: US001 TechProEducation Sayfasi Testi
  Scenario: Tc01 Satfada Arama Yap
    Given Kullanici techpro sayfasina gider
    Then arama kutusunda qa aratir
    And Sayfa basliginin qa icerdigini test eder
    And sayfayi kapatir.
