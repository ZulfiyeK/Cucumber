#https://editor.datatables.net adresine gidiniz
#Sayfadaki tabloda new butonuna basalım
#Çıkan pencerede verilen bilgileri girelim
#Create butonuna basalım
#Search bölümüne girdiğimiz firstname bilgisini girelim
#Başarılı bir şekilde giriş yapıldığını doğrulayalım
#Sayfayı kapatalım

Feature: US004 DataTables Testi

  Scenario Outline: TC01 TadaTables Veri Girisi
    Given Kullanici "https://editor.datatables.net" url sayfasina gider.
    Then Kullanici sayfadaki tablodaki new butonuna tiklar.
    And Cikan pencerede "<firstName>","<lastName>","<position>","<office>","<extention>","<date>","<salary>" bilgiler girilir.
    And Kullanici 3 saniye bekler.
    And Kullanici create butonuna basar.
    And Kullanici 3 saniye bekler.
    And Kullanici searc bolumune "<firstName>" bilgisini girer.
    And Kullanici 3 saniye bekler.
    And Kullanici "<firstName>" ile basarili giris yapildigini dogrular.
    And Kullanici 2 saniye bekler.
    And sayfayi kapatir.
    Examples:
      | firstName | lastName | position    | office  | extention | date       | salary  |
      | john      | smith    | tester      | NYC     | 2134      | 2023-02-25 | 80000   |
      | sam       | walton   | businessman | LA      | 5262      | 2021-02-21 | 2000000 |
      | nancy     | brown    | developer   | Dallas  | 2346      | 2021-02-26 | 850000  |
      | george    | bush     | politician  | Dallas  | 9931      | 2021-02-24 | 9850000 |
      | barry     | allen    | unknown     | Central | 2103      | 2021-02-23 | 1000000 |
