Feature: US002 BlueRentalCar Excel Login
  Scenario: TC001 Pozitif Login Testi
    Given Kullanici "blueRentalUrl" sayfasina gitti.
    But Kullanici 2 saniye bekler.
    And Kullanici Excel'deki "customer_info" sayfasindaki bilgiler ile giris yapildigini test eder.
    And sayfayi kapatir.