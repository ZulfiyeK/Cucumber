Feature: US001 Google Sayfasi Testi

  Background: Google sayfasina gidilir.
    Given Kullanici "googleUrl" sayfasina gitti.

    Scenario: Arama kutusunda volvo aratir.
      Then Kullanici google arama kutusunda "volvo" aratir.
      But Kullanici 2 saniye bekler.
      And Google sayfa basliginin "volvo" icerdigini test eder.
      And sayfayi kapatir.


  Scenario: Arama kutusunda ford aratir.
    Then Kullanici google arama kutusunda "ford" aratir.
    But Kullanici 2 saniye bekler.
    And Google sayfa basliginin "ford" icerdigini test eder.
    And sayfayi kapatir.


  Scenario: Arama kutusunda audi aratir.
    Then Kullanici google arama kutusunda "audi" aratir.
    But Kullanici 2 saniye bekler.
    And Google sayfa basliginin "audi" icerdigini test eder.
    And sayfayi kapatir.

    #Srting kullaniminda "" ile parametreli method olusturuyoruz.
    # Numeric kullanimda yani sayfayi x saniye bekle gibi kullanimlarda da
    # sayi belirttigimiz zaman int olarak parametreli bir method olusturur.
    # Bunu feature file'da belirtme sebebimiz, step definition icinde yaptigimiz beklemeyi stepleri okuyan kisi ya da developer bilmez
    # ama bilmesi gerekiyorsa feature file'da bunu gorur ve webelemente ulasilmasi icin bekleme koyuldugunu anlamis olur.

