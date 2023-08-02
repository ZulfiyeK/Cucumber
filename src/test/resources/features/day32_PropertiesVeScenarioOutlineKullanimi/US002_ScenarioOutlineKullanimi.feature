Feature: US002 Google Sayfasi Testi

  Scenario Outline: Arama kutusunda ford aratir
    Given Kullanici "googleUrl" sayfasina gitti.
    Then Kullanici google arama kutusunda "<aranacakArac>" aratir.
    But Kullanici 2 saniye bekler.
    And Google sayfa basliginin "<aranacakArac>" icerdigini test eder.
    And sayfayi kapatir.
    Examples:
      | aranacakArac |
      | ford         |
      | volvo        |
      | audi         |
      | mercedes     |
