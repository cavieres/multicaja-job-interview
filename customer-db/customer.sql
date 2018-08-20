CREATE TABLE
    customer
    (
        id BIGINT NOT NULL,
        nombre_completo VARCHAR,
        rut VARCHAR,
        createdAt DATETIME,
        updatedAt DATETIME,
        PRIMARY KEY (id)
    );

CREATE TABLE
    hibernate_sequence
    (
        next_val BIGINT
    );

INSERT INTO customer (id, nombre_completo, rut, createdAt, updatedAt)
  VALUES (1, 'Genaro Alvez', '1-9', 4419619200000, NULL);
INSERT INTO customer (id, nombre_completo, rut, createdAt, updatedAt)
  VALUES (2, 'Felipe Mautz', '2-10', DATE('now'), NULL);
INSERT INTO customer (id, nombre_completo, rut, createdAt, updatedAt)
  VALUES (3, 'Andres Soto', '4-12', DATE('now'), NULL);

INSERT INTO hibernate_sequence (next_val) VALUES (4);

