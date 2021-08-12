# Mayın Tarlası Oyunu 

## Oyun Kuralları :

- Oyun metin tabanlıdır. 
- Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı. 
- Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli. 
- Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. 
- Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli. 
- Seçilen noktanın dizinin sınırları içerisinde olup olmadığı kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli. 
- Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli. 
- Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı,solu,yukarısı,aşağısı,sol üst çapraz,sağ üst çapraz,sağ alt çapraz,sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı. 
- Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.

### Kaybetme Senaryosu 

``` output 
Matris boyutlarını giriniz.
Satır sayısı : 3
Sütun sayısını giriniz : 3
Mayınların Konumu : 
- - - 
- * - 
- - * 
=================================
Mayın Tarlası Oyununa Hoşgeldiniz !
- - - 
- - - 
- - - 
Satır giriniz : 0
Sütun Giriniz : 0
=================================
1 - - 
- - - 
- - - 
Satır giriniz : 0
Sütun Giriniz : 2
=================================
1 - 1 
- - - 
- - - 
Satır giriniz : 0
Sütun Giriniz : 2
Önceden bu değerleri girdiniz. Lütfen başka değerler giriniz. 
Satır giriniz : 0
Sütun Giriniz : 1
=================================
1 1 1 
- - - 
- - - 
Satır giriniz : 1
Sütun Giriniz : 0
=================================
1 1 1 
1 - - 
- - - 
Satır giriniz : 3
Sütun Giriniz : 0
Geçerli bir sayı giriniz.
=================================
1 1 1 
1 - - 
- - - 
Satır giriniz : 1
Sütun Giriniz : 1
Game Over!!
=================================
```



### Kazanma Senaryosu 

``` output
Matris boyutlarını giriniz.
Satır sayısı : 3
Sütun sayısını giriniz : 3
Mayınların Konumu : 
- - - 
- * * 
- - - 
=================================
Mayın Tarlası Oyununa Hoşgeldiniz !
- - - 
- - - 
- - - 
Satır giriniz : 0
Sütun Giriniz : 0
=================================
1 - - 
- - - 
- - - 
Satır giriniz : 0
Sütun Giriniz : -6
Geçerli bir sayı giriniz.
=================================
1 - - 
- - - 
- - - 
Satır giriniz : 0
Sütun Giriniz : 2
=================================
1 - 2 
- - - 
- - - 
Satır giriniz : 0
Sütun Giriniz : 5
Geçerli bir sayı giriniz.
=================================
1 - 2 
- - - 
- - - 
Satır giriniz : 1
Sütun Giriniz : 0
=================================
1 - 2 
1 - - 
- - - 
Satır giriniz : 2
Sütun Giriniz : 0
=================================
1 - 2 
1 - - 
1 - - 
Satır giriniz : 2
Sütun Giriniz : 2
=================================
1 - 2 
1 - - 
1 - 2 
Satır giriniz : 2
Sütun Giriniz : 1
=================================
1 - 2 
1 - - 
1 2 2 
Satır giriniz : 0
Sütun Giriniz : 1
Oyunu Kazandınız !
1 2 2 
1 - - 
1 2 2 
=================================
```

