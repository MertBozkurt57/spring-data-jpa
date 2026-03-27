# 1️⃣ Projeyi klonla
git clone https://github.com/MertBozkurt57/spring-data-jpa.git
cd spring-data-jpa

# 2️⃣ PostgreSQL’de bir veritabanı oluştur (örnek: postgres)
# Bu adımı PGAdmin veya psql ile yapabilirsin
# Örn: CREATE DATABASE postgres;

# 3️⃣ Veritabanı şemasını yükle
psql -U postgres -d postgres -f schema.sql

# 4️⃣ Projeyi çalıştır
mvn spring-boot:run
