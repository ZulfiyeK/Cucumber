Feature: US001 Google Sayfasi Testi
  @arac1
  Scenario: TC01 Arama kutusunda volvo aratir.
    Given Kullanici "googleUrl" sayfasina gitti.
    Then Kullanici google arama kutusunda "arac1" aratir.
    But Kullanici 2 saniye bekler.
    And Google sayfa basliginin "arac2" icerdigini test eder.
    And sayfayi kapatir.

    @arac2
  Scenario: TC02 Arama kutusunda volvo aratir.
    Given Kullanici "googleUrl" sayfasina gitti.
    Then Kullanici google arama kutusunda "arac2" aratir.
    But Kullanici 2 saniye bekler.
    And Google sayfa basliginin "arac2" icerdigini test eder.
    And sayfayi kapatir.

  @arac3
  Scenario: TC03 Arama kutusunda volvo aratir.
    Given Kullanici "googleUrl" sayfasina gitti.
    Then Kullanici google arama kutusunda "arac1" aratir.
    But Kullanici 2 saniye bekler.
    And Google sayfa basliginin "arac2" icerdigini test eder.
    And sayfayi kapatir.