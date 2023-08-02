
Feature: US002 Amazon Urun Aramasi
  @iphone
  Scenario: TC01 Amazon iphone aramasi
    Given kullanici amazon sayfasina gider.
    And sayfayi yeniler
    Then Kullanici arama kutusunda iphone aratir.
    And basligin iphone icerdigini test eder.
    And sayfayi kapatir.


    @samsung
    Scenario: TC02 Amazonda samsung aramasi
      Given kullanici amazon sayfasina gider.
      And sayfayi yeniler
      And Kullanici arama kutusunda samsung aratir.
      And Basligin samsung icerdigini test eder
      And sayfayi kapatir.