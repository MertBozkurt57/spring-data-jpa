Spring Data JPA - Database Management Project

Bu proje, **Spring Boot** ve **Spring Data JPA** teknolojilerini kullanarak veritabanı yönetimini ve CRUD işlemlerini, anatasyonları ve mimariyi modernize etmek amacıyla geliştirilmiştir. 

Proje, veritabanı şemasını otomatik olarak yönetmek ve Java nesneleri ile SQL tabloları arasındaki eşleşmeyi (ORM) kolaylaştırmak için yapılandırılmıştır.

---

Öne Çıkan Özellikler

* **Spring Data JPA:** Veritabanı etkileşimi için güçlü repository soyutlaması.
* **Hibernate ORM:** Otomatik tablo yönetimi ve veri eşleme.
* **SQL Schema:** `schema.sql` üzerinden özelleştirilmiş veritabanı başlangıç yapısı.
* **Maven Wrapper:** Sistemde Maven yüklü olmasa bile projeyi derleme imkanı.

---

Proje Yapısı

* `src/main/java`: Uygulamanın çekirdek mantığı (Entity, Repository, Service).
* `src/main/resources`: Veritabanı konfigürasyonları ve SQL scriptleri.
* `pom.xml`: Proje bağımlılıkları ve kütüphane yönetimi.
* `schema.sql`: Başlangıçta çalıştırılacak veritabanı şeması tanımları.

---

Kurulum ve Çalıştırma

Projeyi kendi bilgisayarınızda çalıştırmak için:

1.  **Depoyu Klonlayın:**
    ```bash
    git clone [https://github.com/MertBozkurt57/spring-data-jpa.git](https://github.com/MertBozkurt57/spring-data-jpa.git)
    ```
2.  **Dizine Geçiş Yapın:**
    ```bash
    cd spring-data-jpa
    ```
3.  **Projeyi Derleyin ve Çalıştırın:**
    ```bash
    ./mvnw spring-boot:run
    ```

---

Yapılandırma (Configuration)

Veritabanı bağlantı detaylarını `src/main/resources/application.properties` dosyasından güncelleyebilirsiniz:

```properties
# Örnek H2 Veritabanı Yapılandırması
spring.datasource.url=jdbc:h2:mem:testdb
spring.jpa.hibernate.ddl-auto=update
spring.show-sql=true
