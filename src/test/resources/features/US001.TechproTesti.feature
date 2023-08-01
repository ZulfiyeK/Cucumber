Feature: US001 TechProEducation Sayfasi Testi
  Scenario: Tc01 Satfada Arama Yap
    Given Kullanici techpro sayfasina gider
    Then arama kutusunda qa aratir
    And Sayfa basliginin qa icerdigini test eder
    And sayfayi kapatir.

 #Feature fille da daha once olusturdugumuz bir method'u baska bir scenario larda tekrar olusturmadan kullanabiliriz
  #Yukaridaki ornekte sayfayi kapatir step'i ocon daha once amazonStepDefinition class'inda olusturdugumuz methodu kullanabiliriz