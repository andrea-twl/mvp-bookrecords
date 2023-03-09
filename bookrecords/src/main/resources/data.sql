INSERT INTO books(id, name, "created_at", "updated_at") VALUES (1, 'Good Omens', NOW(), NOW());
INSERT INTO books(id, name, "created_at", "updated_at") VALUES (2, 'Mort', NOW(), NOW());
INSERT INTO books(id, name, "created_at", "updated_at") VALUES (3, 'Guards! Guards!', NOW(), NOW());
INSERT INTO books(id, name, "created_at", "updated_at") VALUES (4, 'Reaper Man', NOW(), NOW());
INSERT INTO books(id, name, "created_at", "updated_at") VALUES (5, 'Coraline', NOW(), NOW());
INSERT INTO books(id, name, "created_at", "updated_at") VALUES (6, 'American Gods', NOW(), NOW());

INSERT INTO authors(id, name, "created_at", "updated_at") VALUES (1, 'Neil Gaiman', NOW(), NOW());
INSERT INTO authors(id, name, "created_at", "updated_at") VALUES (2, 'Terry Pratchet', NOW(), NOW());

INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 1, 1);
INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 2, 1);
INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 1, 5);
INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 1, 6);
INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 2, 2);
INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 2, 3);
INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 2, 4);

INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (1, 'Alice Tan', NOW(), NOW(), 1);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (2, 'Bob Lee', NOW(), NOW(), 1);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (3, 'Charlie Phua', NOW(), NOW(), 1);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (4, 'Daphne Tay', NOW(), NOW(), 1);

INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (5, 'Elliot Teo', NOW(), NOW(), 2);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (6, 'Felicia Ng', NOW(), NOW(), 2);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (7, 'Gavin Lim', NOW(), NOW(), 2);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (8, 'Hazel Chua', NOW(), NOW(), 2);

INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (9, 'Isabelle Neal', NOW(), NOW(), 3);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (10, 'Josh McLaughlin', NOW(), NOW(), 3);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (11, 'Keane Tan', NOW(), NOW(), 3);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (12, 'Lesley Clearwater', NOW(), NOW(), 3);

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 1, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 1, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 1, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 1, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (2, 1, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (2, 1, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (2, 1, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (3, 1, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (3, 1, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (4, 1, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (2, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (2, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (3, 2, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (2, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (2, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (4, 3, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 4, NOW(), NOW());


INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (5, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (5, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (5, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (5, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (6, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (6, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (6, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (7, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (7, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (7, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (8, 2, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (5, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (5, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (5, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (6, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (6, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (7, 3, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (5, 4, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (6, 4, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (6, 4, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 4, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 4, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 4, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (5, 5, NOW(), NOW());


INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (10, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (10, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (10, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (11, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (11, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (12, 3, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 4, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 4, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 4, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (10, 4, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (10, 4, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (11, 4, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 5, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (10, 5, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (10, 5, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 5, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 5, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 5, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 6, NOW(), NOW());
