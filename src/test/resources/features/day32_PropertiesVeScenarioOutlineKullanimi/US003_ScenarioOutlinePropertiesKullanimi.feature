Feature: US003 Google Sayfasi Testi

  Scenario Outline: Arama kutusunda ford aratir
    Given Kullanici "googleUrl" sayfasina gitti.
    Then Kullanici google arama kutusunda "<aranacakArac>" aratti.
    But Kullanici 2 saniye bekler.
    And Google sayfa basliginin "<aranacakArac>" icerdigini test ettir.
    And sayfayi kapatir.
    Examples:
      | aranacakArac |
      | arac1        |
      | arac2        |
      | arac3        |
      | arac4        |

     #Eğer Scenario Outline ile verileri .properties dosyasından almak istersek Examples altındaki verileri
#.properties dosyasinda oluşturduğumuz key'leri yazariz. Step definitionda oluşturduğuz parametreli method
#ile de ConfigReader sayesinde bu keylerin değerini kullanmış oluruz