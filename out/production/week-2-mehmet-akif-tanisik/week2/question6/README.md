<!-- ABOUT THE PROJECT -->
## Project Description

### Question 6
SOA - Web Service - Restful Service - HTTP methods kavramlarını örneklerle açıklayınız.

### Answer
### Service Oriented Architecture (SOA)

Yazılım bileşenlerinin hizmet arabirimleri aracılığıyla yeniden kullanılabilir ve birlikte çalışabilir hale getirilmesine SOA yada hizmet odaklı mimari denir. Kullanılan
hizmetler yeni uygulamalara hızlı dahil edilebilmeleri için ortak arabirim standartları ve bir mimari model kullanır. Bu aslında daha önceden mevcut işlevselliği yeniden
geliştiren veya mevcut işlevlerle nasıl bağlanılacağını veya birlikte çalışılabilirlik sağlayacağını bilmek zorunda olan uygulama geliştiricisinin görevlerini kaldırır.

Bir SOA'daki her hizmet, eksiksiz, ayrı bir iş işlevini yürütmek için gereken kodu ve verileri içerir. Servis arayüzleri loosely-coupled sağlar, yani servisin nasıl uygulandığına
dair çok az bilgiyle veya hiç bilgi olmadan çağrılabilirler ve uygulamalar arasındaki bağımlılıkları azaltırlar.

Bu arayüz, servis sağlayıcısı ile servis tüketicisi arasındaki servis, sözleşmesidir. Hizmet arabiriminin arkasındaki uygulamalar Java veya herhangi bir programlama dilinde
yazılabilir. Servis arayüzleri sıklıkla xml tabanlı standart bir etiket yapısı olan Web Service Definition Language (WSDL) kullanılarak tanımlanır.

Hizmetler, verileri okuma veya değiştirme istekleri göndermek için standart ağ protokolleri(SOAP/HTTP veya Restful HTTP(JSON/HTTP)) kullanılarak açığa çıkarılır. Hizmet yönetimi
geliştirme için yaşan döngüsünü kontrol eder ve uygun aşamada hizmetler, geliştiricilerin bunları hızlı bir şekilde bulmasını ve yeni uygulamaları veya iş süreçlerini bir araya
getirmek için yeniden kullanmasını sağlayan bir kayıt defterinde yayınlanır.

Bahsedilen hizmetler sıfırdan oluşturulabilir, ancak genellikle eski kayıt sistemlerindeki işlevlerin hizmet arabirimleri olarak gösterilmesiyle oluşturulur.

SOA uzun bir süredir uygulama geliştirme ve entegrasyonun evriminde önemli bir aşamayı temsil ediyor. 1990 ların sonraların SOA ortaya çıkmadan önce, bir uygulamayı başka bir
sistemde barındırılan verilere veya işlevselliğe bağlamak, karmaşık entegrasyonlarlar gerektiriyordu. Bu işlevlerin SOA hizmetleri aracılığıyla kullanıma sunulması, geliştiricinin
mevcut yeteneği sabitçe yeniden kullanmasına ve SOA ESB mimarisi araılığıyla bağlanmasına izin verdi.

SOA ile bizler sistemi ayrı hizmetlere ayırırız. Örneğin:

- Point-of-Sale (POS)
- Ödeme Süreçleri
- Envanter
- Sipariş Tamamlanması
- Nakliye

Yukarıdaki hizmetleri kullanıcak farkı servisler yazılarak yukarıdaki hizmetler tekrar ve tekrar kullanılabilirler.


### Web Services

Basitçe web servisleri uygulamalar ve sistemler arasındaki veri alışverişleri için kullanılan açık protokoller ve standartlar topluluğudur. Çeşitli programlama dillerinde
yazılmış ve çeşitli platformlarda çalışan yazılım uygulamaları, tek bir bilgisayardaki süreçler arası iletişime benzer bir şekilde İnternet gibi bilgisayar ağları üzerinden
veri alışverişi yapmak için web servislerini kullanabilir. Bu birlikte çalışabilirlik açık standartların kullanılmasından kaynaklanmaktadır.

Özetlemek gerekirse, eksiksiz bir web servisi aşağıdakilerine sahip olmalıdır:

- İnternet veya özel(intranet) ağlar üzerinden kullanılabilmesi.
- Standartlaştırılmış bir XML mesajlaşma sisteminin kullanılması.
- Herhangi bir işletim sistemine veya programlama diline bağlı değildir.
- Ortak bir XML dilbilgisi yoluyla kendini tanımlası.
- Basit bir bulma mekanizması aracılığıyla keşfedilebilir olması.

Web Servislere örnek olarak:

- E-Banka
- E-Mail
- E-Ticaret
- Sosyal Medya

ve daha web üzerinde çalışan uygulamalar web servislere örnek olarak gösterilebilirler.

### RESTful Service

RESTful web hizmetleri, Web'de en iyi şekilde çalışacak şekilde oluşturulmuştur. Temsili Durum Aktarımı (REST-Representational State Transfer), bir web hizmetine
uygulandığında hizmetlerin Web'de en iyi şekilde çalışmasını sağlayan performans, ölçeklenebilirlik ve değiştirilebilirlik gibi arzu edilen özellikleri tetikleyen
tek tip arabirim gibi kısıtlamaları belirten bir mimari stildir. REST mimari stilinde, veriler ve işlevsellik kaynaklar olarak kabul edilir ve bunlara, genellikle
Web üzerindeki bağlantılar olan Uniform Resource Identifiers (URI'ler) kullanılarak erişilir. Kaynaklar, bir dizi basit, iyi tanımlanmış işlem kullanılarak
harekete geçirilir. REST mimari stili, bir mimariyi bir istemci/sunucu mimarisiyle sınırlar ve tipik olarak HTTP olan durum bilgisi olmayan bir iletişim protokolünü
kullanmak üzere tasarlanmıştır. REST mimarisi stilinde, istemciler ve sunucular, standartlaştırılmış bir arabirim ve protokol kullanarak kaynakların temsillerini değiştirir.

Restful Web Service Mimari Kısıtlamaları:

- Uniform Interface
- Stateless
- Cacheable
- Client-Server
- Layered System
- Code on Demand

Yukarıdaki mimari kısıtlamalara sahip olan ve veri aktarımını çift taraflı olarak gerçekleştiren tüm sistemler RESTful web servislerine örnek olarak verilebilir.

### HTTP METHODS

HTTP fiilleri, "tekdüze arayüz" kısıtlamamızın büyük bir bölümünü oluşturur ve bize isim tabanlı kaynağın eylem karşılığını sağlar.

En çok kullanılan HTTP metodları ve örnekler:

- POST
  - http://www.example.com/customers
  - http://www.example.com/customers/12345/orders

- GET			
  - http://www.example.com/customers/12345
  - http://www.example.com/customers/12345/orders
  - http://www.example.com/buckets/sample

- PUT		    
  - http://www.example.com/customers/12345
  - http://www.example.com/customers/12345/orders/98765
  - http://www.example.com/buckets/secret_stuff

- PATCH			
  - http://www.example.com/customers/12345
  - http://www.example.com/customers/12345/orders/98765
  - http://www.example.com/buckets/secret_stuff

- DELETE		
  - http://www.example.com/customers/12345
  - http://www.example.com/customers/12345/orders
  - http://www.example.com/bucket/sample

Diğer HTTP metodları:

- HEAD
- CONNECT
- OPTIONS
- TRACE
- PATCH



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

