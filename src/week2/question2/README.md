<!-- ABOUT THE PROJECT -->
## Project Description

### Question 2
Creational Design Pattern’lar incelenmelidir. Örneklerle anlatiniz.

### Answer

### Creational Design Patterns --> <a href="" target="_blank">Code Example</a>
Bu tasarım kalıpları nesneleri yaratmanın yolu ile ilgilidir. Bu tasarım kalıplarının kullanılacağı kararı sınıfların somut halde oluşturulması
sırasında olur ve projemizin sınıfları bu kalıpların biriyle oluşturulabilir. Java ile nesne oluşturmanın yolunu biliyoruz örnek olarak:

``` Vehicle v1 = new Vehicle(); ```

Hard-code iyi bir programlama yaklaşımı değildir. Yukarıdaki örneğimizde new anahtar kelimesini kullanarak şablon sınıfımızdan yeni bir obje
türetiyoruz. Bazı durumlarda nesnenin doğası aslında programın doğasına göre değiştirilmelidir. Bu gibi durumlarda, daha genel ve esnek bir
yaklaşım sağlamak için kreatif tasarım kalıplarından yardım alıyoruz.

Kreatif Tasarım Kalıplarının Tipleri:

- Factory Method Pattern
- Abstract Factory Pattern
- Singleton Pattern
- Prototype Pattern
- Builder Pattern
- Object Pool Pattern


### Factory Method Pattern --> <a href="https://github.com/Kodluyoruz-Java-Bootcamp/week-2-mehmet-akif-tanisik/tree/main/src/week2/question2/factorypattern" target="_blank">Code Example</a>

Factory Pattern yada Factory Method Pattern'ler açıkça şunu belirtiyorlar, nesne oluşturmamız için interface ve abstract sınıfları tanımlamamız
gerektiğini fakat oluşturulacak nesnelerin oluşturulma sorumluluğunun türetilmiş sınıflarda olmasını ifade ediyorlar. Başka bir deyişle, türetilmiş
sınıflar ana sınıfların örneğinin oluşturulmasından sorumlu olmalıdırlar.

Factory Method Pattern , Sanal Yapıcı Method (Virtual Constructor) olarak da bilinirler.

#### Factory Method Pattern'in Avantajları
- Türetilmiş sınıfların oluşturulacak nesnelerin türünün seçilmesine izin verir.
- Programa özgü sınıfları koda bağlama ihtiyacını ortadan kaldırarak gevşek bağlantıyı (loose-coupling) destekler. Bu aslında kodun yalnızca
  interface ve abstract sınıflarla etkileşime girdiği anlamına gelir, böylece bahsedilen interfaceleri implemente eden veya bahsedilen soyut sınıflardan
  türetilen herhangi bir sınıfla kodlarımız çalışır.

#### Factory Method Pattern'lerin Kullanım Durumları
- Sınıfın hangi türetilmiş sınıfların somutlaştırılıp kullanılacağını bilmediğinde
- Sınıfın alt sınıflardan türetilecek nesnelerin oluşturulmasını belirtmek istediğinde
- Base sınıfların alt sınıflardan oluşturulacak nesneleri seçmek istediği durumda.

### Abstract Factory Pattern --> <a href="https://github.com/Kodluyoruz-Java-Bootcamp/week-2-mehmet-akif-tanisik/tree/main/src/week2/question2/abstractfactorypattern" target="_blank">Code Example</a>

Abstract Factory Pattern şunu belirtir; somut türetilmiş sınıflar kullanmadan birbiri ile alakalı(bağlantılı) nesne gruplarının oluşturulması için
interface veya abstract sınıfların oluşturulmasını söylemektedir. Aslında bu Abstract Factory nin tek bir sınıfı bir fabrika görevi görecek şekilde
oluşturulmasını ifade eder. Bu yüzden bu tasarım kalıbını Factory Method Pattern'den bir seviye daha yukarda görebiliriz. Abstract Factory Pattern'leri
'kit' olarak da isimlendirebiliyoruz.

#### Abstract Factory Pattern'lerin Avantajları
- Bu kalıp istemci codelarını concrete(implemente edilmiş) sınıflardan izole eder.
- Nesne ailelerinin değiş tokuşlarını kolaylaştırır.
- Nesneler arasında tutarlılığı destekler.

#### Abstract Factory Method Pattern'lerin Kullanım Durumları
- Sistemdeki nesnelerin nasıl oluşturulduğu, birbirlerine bağlandığı ve sunulduğunun sistemden bağımsız olması durumunda.
- Birbirleri ile ilgili aile nesnelerinin birlikte kullanılmak istendiğinde bu sınırlandırmalar kullanılabilir.
- Uygulamaları göstermeyen ve yalnızca arayüzleri gösteren bir nesne kitaplığının sağlanmak istenmesi durumunda.
- Sistemin birden çok nesne ailesinden biriyle yapılandırılması gerektiğinde.


### Singleton Pattern --> <a href="https://github.com/Kodluyoruz-Java-Bootcamp/week-2-mehmet-akif-tanisik/tree/main/src/week2/question2/singletonpattern" target="_blank">Code Example</a>

Singleton Pattern şunu belirtir; sadece bir örnek oluşturulabilecek bir sınıfımızın olduğunu düşünün ve bu objeye küresel anlamda erişim
sağlanarak kullanılmasından bahseder. Başka bir deyişle bir sınıf tek bir örneğin oluşturulmasını ve tek bir nesnenin diğer tüm sınıflar
tarafından kullanılmasını sağlamalıdır.

#### Single Pattern'in iki biçimi vardır:

- Early Instantiation: Yükleme zamanında örneğin oluşturulması
- Lazy Instantiation: Gerektiği takdirde örneğin oluşturulması

#### Singleton Pattern'in Avantajı
- Her istekte nesne oluşturulmadığı için bellek tasarrufu sağlar. Yalnızca tek bir örnek tekrar tekrar kullanılır.

#### Singleton Pattern'in Kullanım Durumu
- Bu tasarım kalıbı çoğunlukla çok görevli uygulamalarda ve veritabı uygulamalarında kullanılır. Loglamada, catchlemede, görev havuzlarında,
  konfigürasyon ayarlarında kullanılır.

### Prototype Pattern --> <a href="https://github.com/Kodluyoruz-Java-Bootcamp/week-2-mehmet-akif-tanisik/tree/main/src/week2/question2/prototypepattern" target="_blank">Code Example</a>

Prototype Pattern yeni bir nesne oluşturmak yerine mevcut bir nesnenin klonlanmasının ve ihtiyaca göre özelleştirilebileceğini ifade eder.
Yeni bir nesne oluşturmanın maliyeti pahalı ve yoğun kaynak gerektiriyorsa bu model izlenmelidir.

#### Prototype Pattern'in Avantajları
- Child sınıf oluşturma ihtiyacını azaltır.
- Nesne oluşturmanın karmaşıklığını gizler.
- İstemciler ne tür bir nesne alacağını bilmeden yeni nesneler alabilirler.
- Runtime'da nesneleri eklemenizi veya kaldırmanızı sağlar.

#### Prototype Pattern'in Kullanım Durumları
- Sınıflar çalışma zamanında başlatıldığında.
- Bir nesne oluşturmanın maliyetli ve karmaşık olduğu durumlarda.
- Bir uygulamada sınıf sayısının minumum değerde tutulmak istendiğinde.
- İstemci uygulamasının nesne oluşturma ve temsilden habersiz olması gerektiğinde.


### Builder Pattern --> <a href="https://github.com/Kodluyoruz-Java-Bootcamp/week-2-mehmet-akif-tanisik/tree/main/src/week2/question2/builderpattern" target="_blank">Code Example</a>

Builder Pattern  karmaşık nesnelerin oluşturulması için adım adım daha basit nesnelerin oluşturulup sonunda karmaşık olan nesnenin oluşturulmasını
ifade eder. Çoğunlukla karmaşık bir nesnenin seri hale getirilmesinde olduğu gibi, nesne tek adımda oluşturulamadığında kullanılır.

#### Builder Pattern'in Avantajı
- Bir nesnenin yapısı ve temsili arasında açık bir ayrım vardır.
- Nesnelerin oluşturulma süreçlerinde çok iyi bir kontrol sağlanmasını sağlar.
- Nesnelerin dahili temsillerini değiştirmeyi destekler.




### Object Pool Pattern --> <a href="https://github.com/Kodluyoruz-Java-Bootcamp/week-2-mehmet-akif-tanisik/tree/main/src/week2/question2/objectpoolpattern" target="_blank">Code Example</a>

Genellikle, program geliştirme ve nesne oluşturulmasında anahtar sorun performans olabiliyor.Bu da aslında karşımıza maliyet olarak çıkıyor.
Object Pool Pattern şunu ifade ediyor, oluşturulması maliyetli olan nesnelerin yeniden kullanılması.

Temel olarak, bir Object Pool belirli miktarda nesne içeren bir havuz görevi görüyor. Havuzdan bir nesne alınıp geri yerine koyulana kadar o nesne
havuzda bulunmaz. Havuzdaki her nesnenin bir yaşam döngüsü vardır: oluşturma, doğrulama ve yok edilmeleridir.

Bir havuz aslında mevcut kaynakların daha iyi bir şekilde yönetilmesine yardımcı olur. Birçok kullanım örneği vardır: özellikle uygulama
sunucularında veri kaynağı havuzları, çoklu görev havuzları vardır.


#### Object Pool Pattern'in Avantajları
- Uygulamanın performansını önemli ölçüde artırır.
- Bir sınıf örneğini başlatma oranının yüksek olduğu bir durumda en etkilidir.
- Bağlantıları yönetir ve yeniden kullanmanın ve paylaşmanın bir yolunu sunar.
- Ayrıca, oluşturulabilecek maksimum nesne sayısı için sınır sağlayabilir.

#### Object Pool Pattern'in Kullanım Durumu
- Bir uygulama, oluşturulması pahalı olan nesneler gerektirdiğinde.
  Örn: veritabanı için çok fazla bağlantı açma ihtiyacı vardır, bu durumda yeni bir tane oluşturmak
  çok uzun sürer ve veritabanı sunucusu aşırı yüklenir.
- Farklı zamanlarda aynı kaynağa ihtiyaç duyan birkaç istemci olduğunda.


<!-- TECHNOLOGIES -->
### Technologies

<a href="https://www.java.com/" target="_blank"><img src="../../../outputImages/logos/java.svg" alt="Java" height="80" /></a>





<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.




<!-- CONTACT -->
## Contact

### Mehmet Akif Tanisik

<a href="https://github.com/mehmet-akif-tanisik" target="_blank">
<img  src=https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white alt=github style="margin-bottom: 20px;" />
</a>
<a href = "mailto:matnsk@outlook.com?subject = Feedback&body = Message">
<img src=https://img.shields.io/badge/send-email-email?&style=for-the-badge&logo=microsoftoutlook&color=CD5C5C alt=microsoftoutlook style="margin-bottom: 20px; margin-left:20px" />
</a>
<a href="https://linkedin.com/in/mehmet-akif-tanisik" target="_blank">
<img src=https://img.shields.io/badge/linkedin-%231E77B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white alt=linkedin style="margin-bottom: 20px; margin-left:20px" />
</a>  
<a href="https://twitter.com/makiftanisik" target="_blank">
<img src=https://img.shields.io/badge/twitter-%2300acee.svg?&style=for-the-badge&logo=twitter&logoColor=white alt=twitter style="margin-bottom: 20px; margin-left:20px" />
</a>

<!-- PROJECT-BOOTCAMP-PRACTICUM PART -->
<br />

## Java Bootcamp - Kodluyoruz & Solmaz
<div align="center">
  <a href="https://www.solmaz.com">
    <img src="../../../outputImages/logos/solmaz-logo.jpg" alt="Logo" width="220" height="200">
  </a>

<h3 align="center">Company: Solmaz Customs Consultancy/Brokerage Co.</h3>
</div>

<div align="center">
  <a href="https://kodluyoruz.org/tr/kodluyoruz/">
    <img src="../../../outputImages/logos/kodluyoruz-logo.png" alt="Logo" width="350" height="300">
  </a>
<h3 align="center">Organizer: Kodluyoruz.org</h3>
</div>

