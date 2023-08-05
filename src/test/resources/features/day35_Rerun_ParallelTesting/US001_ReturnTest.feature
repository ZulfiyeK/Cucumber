Feature: US001 Google Sayfasi Testi

  Background: Google sayfasina gidilir.
    Given Kullanici "googleUrl" sayfasina gitti.

  @arc
  Scenario: Arama kutusunda volvo aratir.
    Then Kullanici google arama kutusunda "arac1" aratir.
    But Kullanici 2 saniye bekler.
    And Google sayfa basliginin "arac1" icerdigini test eder.
    And sayfayi kapatir.

  @arc
  Scenario: Arama kutusunda ford aratir.
    Then Kullanici google arama kutusunda "arac2" aratir.
    But Kullanici 2 saniye bekler.
    And Google sayfa basliginin "arac2" icerdigini test eder.
    And sayfayi kapatir.

  @arc
  Scenario: Arama kutusunda audi aratir.
    Then Kullanici google arama kutusunda "arac3" aratir.
    But Kullanici 2 saniye bekler.
    And Google sayfa basliginin "arac3" icerdigini test eder.
    And sayfayi kapatir.