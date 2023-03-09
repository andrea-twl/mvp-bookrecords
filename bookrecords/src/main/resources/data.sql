INSERT INTO books(id, name, "created_at", "updated_at") VALUES (1, 'Good Omens', NOW(), NOW()); --1
INSERT INTO books(id, name, "created_at", "updated_at") VALUES (2, 'Mort', NOW(), NOW()); --2
INSERT INTO books(id, name, "created_at", "updated_at") VALUES (3, 'Guards! Guards!', NOW(), NOW()); --3
INSERT INTO books(id, name, "created_at", "updated_at") VALUES (4, 'Reaper Man', NOW(), NOW()); --4
INSERT INTO books(id, name, "created_at", "updated_at") VALUES (5, 'Coraline', NOW(), NOW()); --5
INSERT INTO books(id, name, "created_at", "updated_at") VALUES (6, 'American Gods', NOW(), NOW()); --6

INSERT INTO authors(id, name, "created_at", "updated_at") VALUES (1, 'Neil Gaiman', NOW(), NOW()); --1
INSERT INTO authors(id, name, "created_at", "updated_at") VALUES (2, 'Terry Pratchet', NOW(), NOW()); --2

INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 1, 1);
INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 1, 5);
INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 1, 6);
INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 2, 2);
INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 2, 3);
INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 2, 4);

INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (1, 'Andrea Tan', NOW(), NOW(), 1);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (2, 'Keane Tan', NOW(), NOW(), 1);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (3, 'Michelle Phua', NOW(), NOW(), 1);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (4, 'Matthew Tham', NOW(), NOW(), 1);

INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (5, 'Ivy Lee', NOW(), NOW(), 2);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (6, 'Eugene Tan', NOW(), NOW(), 2);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (7, 'Zhixin Lim', NOW(), NOW(), 2);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (8, 'Lan Qiao Xin', NOW(), NOW(), 2);

INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (9, 'Jessica Ng', NOW(), NOW(), 3);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (10, 'Rhett McLaughlin', NOW(), NOW(), 3);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (11, 'Link Neal', NOW(), NOW(), 3);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (12, 'Steve Jobs', NOW(), NOW(), 3);

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 1, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (2, 1, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (3, 1, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (4, 1, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (2, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (3, 2, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (2, 3, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 4, NOW(), NOW());


INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (5, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (6, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (7, 2, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (8, 2, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (5, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (6, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (7, 3, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (5, 4, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (6, 4, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (5, 5, NOW(), NOW());


INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (10, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (11, 3, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (12, 3, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 4, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (10, 4, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (11, 4, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 5, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (10, 5, NOW(), NOW());

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (9, 6, NOW(), NOW());
