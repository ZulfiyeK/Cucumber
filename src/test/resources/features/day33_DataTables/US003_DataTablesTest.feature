Feature: US003 BlueRentalCar Login Islemi

  Scenario: TC01 BlueRentalCar Pozotif test
    Given Kullanici "blueRentalUrl" sayfasina gitti.
    Then Kullani login butonuna tiklar.
    But Kullanici 2 saniye bekler.
    And Kullanici,verilen bilgileri ile login olur.
      |          Email                | Password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
      | kate.brown@bluerentalcars.com | tad1$Fas  |
    And  sayfayi kapatir.