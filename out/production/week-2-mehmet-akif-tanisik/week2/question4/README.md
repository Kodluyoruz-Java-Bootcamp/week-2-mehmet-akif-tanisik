<!-- ABOUT THE PROJECT -->
## Project Description

### Question 4
Java dünyasindaki framework’ler ve çözdükleri problemler nedir? Kod Örneklendirini de
   içermelidir.

### Answer
### Spring

Web uygulamalarının geliştirilmesini çok kolay bir hale getirmiştir.
Proje oluşturmanın karmaşıklığı ve yavaşlığını ortadan kaldırarak saniyeler için proje oluşturmamıza olanak sağlar.
Web sunucusu veya uygulama sunucusu olmadan lightweight container deneyimini sunar.
Geriye dönük uyumluluğun kontrol edilmesini ve aynı zamanda karmaşık test durumlarını kolaylaştırır.
JDBC'ye destekler.
Modülerliği destekler. Hem XML hem de anotasyon-bazlı konfigürasyon yapılandırmalarını sağlar.

```
@SpringBootApplication
@RestController
public class DemoApplication {

public static void main(String[] args) {
SpringApplication.run(DemoApplication.class, args);
}

@GetMapping("/hello")
public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
return String.format("Hello %s!", name);
}
}
```
<hr>

### Grails

View için oluşturması kolay tagleri sağlar.
Restful Api'ler için yerleşik destek sağlar.
Groovy ve Javayı bu Framework sayesinde aynı anda kullanabiliriz.
Çok hızlı proje geliştirmeleri için mükemmeldir.
Yapılandırma özellikleri dinamik şekilde gerçekleşir. Sunucuyu yeniden başlatmamıza gerek kalmaz.

Basit bir Grails uygulaması oluşturma
```
grails create-app Firstapp
```
Yeni oluşturulmuş Grails uygulamasını localhost ta çalıştırma
```
grails run-app
````
Boş domain sınıfı oluşturma
```
grails create-domain-class Student
```
Boş domain sınıfı bu şekilde gözükecek
```
package firstapp

class Student {

    static constraints = {
        }
    }
```
Boş sınıfımıza özellikler ekleyebiliriz
```
package firstapp

class Student {
    String name
    String gender
    Date dateOfBirth
    Integer position
    static constraints = {
        }
    }
```
Controller sınıfı oluşturma
```
grails create-controller Student
```
Controller sınıfımız bu şekilde görünecek
```
package firstapp

class StudentController {

    def index() { }
    }
```
<hr>

### Google Web Toolkit(GWT)

Açık kaynak kodludur ve geliştirici dostudur.
Frontend scripting dillerinde çok geniş bilgi birikiminiz olmadan kolayca çok güzel arayüzler tasarlamanızı sağlar.
Hata ayıklamaları yapmak çok kolaydır.
Java kaynak kodlarını tüm tarayıcılarda çalışabilir Javascript dosyalarına derler.

Basit GWT uygulaması
```
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;

public class HelloWorld implements EntryPoint {
   public void onModuleLoad() {
      Window.alert("Hello, World!");
   }
}
```
<hr>

### Struts

Çok esnek ve başlangıç için kolaylıklar sağlar.
Güvenilirlik sunar ve MVC mimarisine dayalıdır.
REST, JSON ve AJAX ile entegrasyonu sağlanabilir.
Yaratıcı temalar ve şablonlar geliştirmeniz gereken görevleri hızlandırır.
Geliştirme sürenizi minumuma indirir ve daha yoğun çaba göstermezsiniz.

Model sınıfının oluşturulması
```
package org.apache.struts.helloworld.model;

public class MessageStore {
    private String message;
    
    public MessageStore() {
        message = "Hello Struts User";
    }

    public String getMessage() {
        return message;
    }
}
```
Action sınıfının oluşturulması
```
package org.apache.struts.helloworld.action;

import org.apache.struts.helloworld.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore() ;
        
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}
```
JSP'nin oluşturulması
```
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello World!</title>
  </head>
  <body>
    <h2><s:property value="messageStore.message" /></h2>
  </body>
</html>
```
XML konfigürasyonu
```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE struts PUBLIC
		"-//Apache Software Foundation//DTD Struts Configuration 2.5//EN"
		"http://struts.apache.org/dtds/struts-2.5.dtd">
<struts>
    <constant name="struts.devMode" value="true" />

    <package name="basicstruts2" extends="struts-default">
        <action name="index">
            <result>/index.jsp</result>
        </action>
		
        <action name="hello" class="org.apache.struts.helloworld.action.HelloWorldAction" method="execute">
            <result name="success">/HelloWorld.jsp</result>
        </action>
    </package>
</struts>
```
URL Action'in oluşturulması
```
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Struts 2 Application - Welcome</title>
    </head>
    <body>
        <h1>Welcome To Struts 2!</h1>
        <p><a href="<s:url action='hello'/>">Hello World</a></p>
    </body>
</html>
```
<hr>

### JavaServer Faces (JSF)
  Geniş kütüphanesi vardır ve tekrar kullanılabilir UI bileşenlerine sahiptir.
  Çok fazla kodlama gerektirmeyen kullanımı kolay frontend araçlarına sahiptir.
  Üretkenliğin ve tutarlılığın geliştirilmesine yardım eder.
  Doğrulamalar ve method çağrıları için Ajax etklinlikleri ile kullanıcı deneyimini zenginleştirir.
  Java kullanmak yerine UI bileşenlerini görselleştirmek ve yönetmek için API sağlar ve görünüm işleme için XML kullanılır.

Kullanıcı Arayüzü oluşturulması
```
// index.xhtml  
<?xml version='1.0' encoding='UTF-8' ?>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN""http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">  
<html xmlns="http://www.w3.org/1999/xhtml"  
xmlns:h="http://xmlns.jcp.org/jsf/html">  
<h:head>  
<title>User Form</title>  
</h:head>  
<h:body>  
<h:form>  
<h:outputLabel for="username">User Name</h:outputLabel>  
<h:inputText id="username" value="#{user.name}" required="true" requiredMessage="User Name is required" /><br/>  
<h:commandButton id="submit-button" value="Submit" action="response.xhtml"/>  
</h:form>  
</h:body>  
</html>  
```
Response sayfasının oluşturulması
```
<?xml version='1.0' encoding='UTF-8' ?>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN""http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">  
<html xmlns="http://www.w3.org/1999/xhtml"  
xmlns:h="http://xmlns.jcp.org/jsf/html">  
<h:head>  
<title>Welcome Page</title>  
</h:head>  
<h:body>  
<h2>Hello, <h:outputText value="#{user.name}"></h:outputText></h2>  
</h:body>  
</html>  
```
Managed Bean'in oluşturulması
```
package managedbean;  
Facelet Title  
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped;  
@ManagedBean  
@RequestScoped  
public class User {  
String name;  
  
public String getName() {  
return name;  
}  
public void setName(String name) {  
this.name = name;  
}  
}  
```
XML Konfigürasyonu
```
<?xml version="1.0" encoding="UTF-8"?>  
<web-app version="3.1" xmlns="http://xmlns.jcp.org/xml/ns/javaee"   
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee   
http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd">  
<context-param>  
<param-name>javax.faces.PROJECT_STAGE</param-name>  
<param-value>Development</param-value>  
</context-param>  
<servlet>  
<servlet-name>Faces Servlet</servlet-name>  
<servlet-class>javax.faces.webapFacelet Titlep.FacesServlet</servlet-class>  
<load-on-startup>1</load-on-startup>  
</servlet>  
<servlet-mapping>  
<servlet-name>Faces Servlet</servlet-name>  
<url-pattern>/faces/*</url-pattern>  
</servlet-mapping>  
<session-config>  
<session-timeout>  
30  
</session-timeout>  
</session-config>  
<welcome-file-list>  
<welcome-file>faces/index.xhtml</welcome-file>  
</welcome-file-list>  
</web-app>  
```
<hr>

### Hibernate

Light-weight bir yapıya sahiptir, ölçeğinin büyütülmesi, değiştirilmesi ve yapılandırması kolaydır.
Daha az kod yazarak karmaşık veri işlemlerinin yapılmasını sağlar.
Yüksek üretkenlik ve taşınabilirlik sağlar.
RDBMS ve NoSQL veritabı için kullanılır.
Komut satırı araçlarına ve IDE eklentilerine sahiptir. Bu da deneyiminizi zenginleştirir.

Employee Sınıfının Oluşturulması
```
public class Employee {  
private int id;  
private String firstName,lastName;  
  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getFirstName() {  
    return firstName;  
}  
public void setFirstName(String firstName) {  
    this.firstName = firstName;  
}  
public String getLastName() {  
    return lastName;  
}  
public void setLastName(String lastName) {  
    this.lastName = lastName;  
}  
}  
```
Employee sınıfı için bir mapping oluşturulması
```
<?xml version='1.0' encoding='UTF-8'?>  
<!DOCTYPE hibernate-mapping PUBLIC  
 "-//Hibernate/Hibernate Mapping DTD 5.3//EN"  
 "http://hibernate.sourceforge.net/hibernate-mapping-5.3.dtd">  
  
 <hibernate-mapping>  
  <class name="com.javatpoint.mypackage.Employee" table="emp1000">  
    <id name="id">  
     <generator class="assigned"></generator>  
    </id>  
            
    <property name="firstName"></property>  
    <property name="lastName"></property>  
            
  </class>  
            
 </hibernate-mapping>  
```
Konfigürasyon Yapılması
```
<?xml version='1.0' encoding='UTF-8'?>  
<!DOCTYPE hibernate-configuration PUBLIC  
          "-//Hibernate/Hibernate Configuration DTD 5.3//EN"  
          "http://hibernate.sourceforge.net/hibernate-configuration-5.3.dtd">  
  
<hibernate-configuration>  
  
    <session-factory>  
        <property name="hbm2ddl.auto">update</property>  
        <property name="dialect">org.hibernate.dialect.Oracle9Dialect</property>  
        <property name="connection.url">jdbc:oracle:thin:@localhost:1521:xe</property>  
        <property name="connection.username">system</property>  
        <property name="connection.password">jtp</property>  
        <property name="connection.driver_class">oracle.jdbc.driver.OracleDriver</property>  
    <mapping resource="employee.hbm.xml"/>  
    </session-factory>  
  
</hibernate-configuration>  
```
Verileri çekmek yada veri eklemek için Bir sınıf daha yapalım
```
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
    
public class StoreData {    
public static void main(String[] args) {    
        
    //Create typesafe ServiceRegistry object    
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
          
   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
  
SessionFactory factory = meta.getSessionFactoryBuilder().build();  
Session session = factory.openSession();  
Transaction t = session.beginTransaction();   
            
    Employee e1=new Employee();    
    e1.setId(101);    
    e1.setFirstName("Mehmet Akif");    
    e1.setLastName("Tanisik");    
        
    session.save(e1);  
    t.commit();  
    System.out.println("successfully saved");    
    factory.close();  
    session.close();    
        
}    
}   
```
<hr>

### Play

Asenkron işlemler için yüksek performans sağlar.
Reaktif ilkelere sahip olduğundan geliştiricilerin üretkenliğini artırır.
Hataların çoğu derleme süresi sırasında yakalanır. Bu yüzden geliştirme yaşam döngüsünün başlarında birçok hatayı erkenden çözebilirsiniz.
Yapılandırmada herhangi bir değişiklik için kolay ve hızlı yeniden yükleme sağlar.
Basit JAR dosyaları oluşturmak çok kolaydır.

Play ile bir proje başlangıcı yapmak çok ama çok kolay
Komut satırına proje oluşturmak için şunu yazalım ancak sisteminizde sbt olması gerekiyor.
```
sbt new playframework/play-java-seed.g8
```
Projemizi çalıştırmak için
```
sbt run
```
Projemizin karşılama sayafını görmek için browserdan localhostunuza bağlanın
```
 http://localhost:9000/
```
<hr>

### Vaadin

Geliştirici üretkenliğini artırır ve hızlı geliştirmeye olanak sağlar
Web bileşenlerinin standartları üzerine inşa edilmiştir.
Birçok bileşen ve farklı dinleyicileri size sağlar
İstemci-sunucu iletişimini ve yönlendirmeyi otomatikleştirir
Güzel bir dökümantasyona ve aktif bir topluluğu sahip olduğundan eksik bilgilerinizi tamamlamanız kolaydır.

Vaading ile "Hello World"
```
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@Title("My UI")
public class HelloWorld extends UI {
    @Override
    protected void init(VaadinRequest request) {
        // Create the content root layout for the UI
        VerticalLayout content = new VerticalLayout();
        setContent(content);

        // Display the greeting
        content.addComponent(new Label("Hello World!"));

        // Have a clickable button
        content.addComponent(new Button("Push Me!",
            click -> Notification.show("Pushed!")));
    }
}
```
<hr>

### Wicket

Light-weight tir. Çok hızlı bir frameworktür.
Birim testlerinin kolay yapılmasına olanak sağlar.
Sıfır XML konfigürasyon dosyası.
Back-Button problemi yoktur.
Bookmarkable projeler oluşturmak çok kolaydır.

Wicket ile "Hello World"
```
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HelloWorld extends WebPage {
    public HelloWorld() {
        add(new Label("message", "Hello World!"));
    }
}
```
Hello World için bir html oluşturalım
```
<html>
<body>
    <span wicket:id="message">Message goes here</span>
</body>
</html>
```
<hr>

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

