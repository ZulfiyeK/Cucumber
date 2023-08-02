Feature: US001 Google Sayfasi Testi

  Background: Google sayfasina gidilir.
    Given Kullanici "googleUrl" sayfasina gitti.

    Scenario: Arama kutusunda volvo aratir.
      Then Kullanici google arama kutusunda "volvo" aratir.
      And Google sayfa basliginin "volvo" icerdigini test eder.
      And sayfayi kapatir.
