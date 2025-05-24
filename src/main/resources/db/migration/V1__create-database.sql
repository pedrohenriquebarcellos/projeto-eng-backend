CREATE TABLE IF NOT EXISTS companies (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cnpj VARCHAR(14) NOT NULL,
    company_legal_name VARCHAR(40) NOT NULL,
    company_address_street VARCHAR(80) NOT NULL,
    company_address_district VARCHAR(40) NOT NULL,
    company_fantasy_name VARCHAR(20) NOT NULL,
    company_type CHAR(1) NOT NULL,
    company_cep VARCHAR(9) NOT NULL,
    company_state VARCHAR(30) NOT NULL,
    company_city_code VARCHAR(10) NOT NULL,
    company_city VARCHAR(60) NOT NULL,
    company_region VARCHAR(3),
    company_country_id VARCHAR(5),
    company_phone_code VARCHAR(3) NOT NULL,
    company_phone VARCHAR(15) NOT NULL,
    company_birth_date VARCHAR(10),
    company_home_page VARCHAR(255),
    company_store_id_number INT NOT NULL,
    company_country_description VARCHAR(50),
    is_active BOOLEAN NOT NULL
    );

CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL
);

INSERT INTO users (id, username, password)
VALUES (1, 'maicon.macedo', '$2a$10$uReHnk1Wv6emfqJgJGP23uRD8HssjtxFYjYMwIqv.XmWE5YrShU6.');

-- user: jhon.doe
-- pass: 12345
