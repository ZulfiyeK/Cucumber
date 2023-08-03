Feature:US001 Google Sayfasinda Urun Aramasi

  Scenario: TC01 Arama kutusunda Verilen Urunler Aratilir.
    Given Kullanici "googleUrl" sayfasina gitti.
    Then Kullanici data tableden verilen bilgileri aratir.
      | Datalar  |
      | Samsung  |
      | Nokia    |
      | Apple    |
      | Motorola |
    And sayfayi kapatir.

  # DataTable Scenario Outline daki gibi birden fazla veriyi ayni scenario'da test etmek icin kullanilir
  # Scenario Outline' dan farkli olarak verilerle ilgili tablolari istedigimiz stepten sonra kendimiz olusturabiliriz
  # Tabloyu olusturdugumuz step'in methoduna parametre olarak cucumber.io dan 'DataTable' parametresini ekleriz.
  # Bu parametre sayesinde olusturmus oldugumuz tabloyu bir list' e donusturup loop ile verileri kullanabiliriz.
  # Birden fazla sutün oluşturduysak yine DataTable parametresi sayesinde excel'den bildiğimiz row() methodu ile
  # bu datalara ulaşabiliriz.
