CREATE TABLE IF NOT EXISTS companies (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cnpj VARCHAR(14) NOT NULL,
    company_legal_name VARCHAR(80) NOT NULL,
    company_address_street VARCHAR(80) NOT NULL,
    company_address_district VARCHAR(40) NOT NULL,
    company_fantasy_name VARCHAR(80) NOT NULL,
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


INSERT INTO companies (
    cnpj, company_legal_name, company_address_street, company_address_district, company_fantasy_name,
    company_type, company_cep, company_state, company_city_code, company_city,
    company_region, company_country_id, company_phone_code, company_phone,
    company_birth_date, company_home_page, company_store_id_number, company_country_description, is_active
) VALUES
-- 1: Google Brasil
('06123042000100', 'GOOGLE BRASIL INTERNET LTDA.', 'Av. Brigadeiro Faria Lima, 3477', 'Itaim Bibi', 'Google',
 'r', '04538-133', 'São Paulo', '3550308', 'São Paulo',
 'SU', 'BR', '11', '2395-8400', '2005-10-04', 'https://www.google.com.br', 1, 'Brasil', true),

-- 2: Magazine Luiza
('4796095000192', 'MAGAZINE LUIZA S/A', 'Rua do Paraíso, 148', 'Paraíso', 'Magalu',
 'r', '04103-000', 'São Paulo', '3550308', 'São Paulo',
 'SU', 'BR', '11', '3504-2000', '1957-11-16', 'https://www.magazineluiza.com.br', 2, 'Brasil', true),

-- 3: Natura
('71096315000150', 'NATURA COSMÉTICOS S/A', 'Av. Alexandre Colares, 1188', 'Vila Jaguara', 'Natura',
 'r', '05106-000', 'São Paulo', '3550308', 'São Paulo',
 'SU', 'BR', '11', '4380-9000', '1969-08-28', 'https://www.natura.com.br', 3, 'Brasil', true),

-- 4: Porto Seguro
('61026944000158', 'PORTO SEGURO CIA DE SEGUROS GERAIS', 'Av. Rio Branco, 1489', 'Campos Elíseos', 'Porto Seguro',
 'r', '01205-001', 'São Paulo', '3550308', 'São Paulo',
 'SU', 'BR', '11', '3366-2000', '1945-08-27', 'https://www.portoseguro.com.br', 4, 'Brasil', true),

-- 5: Ambev
('07526557000100', 'AMBEV S/A', 'Rua Dr. Renato Paes de Barros, 1017', 'Itaim Bibi', 'Ambev',
 'r', '04530-001', 'São Paulo', '3550308', 'São Paulo',
 'SU', 'BR', '11', '2122-1414', '1999-07-01', 'https://www.ambev.com.br', 5, 'Brasil', true),

-- 6: Petrobras Distribuidora S.A.
('33000114000106', 'PETROBRAS DISTRIBUIDORA S.A.', 'Rua Real Grandeza, 219', 'Botafogo', 'Petrobras',
    'r', '22281-000', 'Rio de Janeiro', '3304557', 'Rio de Janeiro',
    'SU', 'BR', '21', '3504-5000', '1971-02-10', 'https://www.petrobras.com.br', 6, 'Brasil', true),

-- 7: Banco Itaú S.A.
('60701190000104', 'BANCO ITAÚ S.A.', 'Praça Alfredo Egydio de Souza Aranha, 100', 'Vila Olímpia', 'Itaú',
 'r', '04546-042', 'São Paulo', '3550308', 'São Paulo',
 'SU', 'BR', '11', '4004-4828', '1924-05-05', 'https://www.itau.com.br', 7, 'Brasil', true),

-- 8: BRF S.A.
('07538133000195', 'BRF S.A.', 'Rua Gomes de Carvalho, 1501', 'Vila Olímpia', 'BRF',
 'r', '04547-005', 'São Paulo', '3550308', 'São Paulo',
 'SU', 'BR', '11', '3090-6000', '2009-06-29', 'https://www.brf-br.com', 8, 'Brasil', false),

-- 9: Embraer S.A.
('61664258000146', 'EMBRAER S.A.', 'Avenida Brigadeiro Faria Lima, 2170', 'São José dos Campos', 'Embraer',
 'r', '12227-901', 'São Paulo', '3549904', 'São José dos Campos',
 'SU', 'BR', '12', '3927-1000', '1969-08-19', 'https://www.embraer.com.br', 9, 'Brasil', true),

-- 10: Amil Assistência Médica Internacional S.A.
('62169123000103', 'AMIL ASSISTÊNCIA MÉDICA INTERNACIONAL S.A.', 'Rua Emílio Bertolini, 154', 'Jardim Ipiranga', 'Amil',
 'r', '06713-030', 'São Paulo', '3550308', 'São Paulo',
 'SU', 'BR', '11', '4004-2929', '1978-11-10', 'https://www.amil.com.br', 10, 'Brasil', false);

-- user: maicon.macedo
-- pass: 12345
