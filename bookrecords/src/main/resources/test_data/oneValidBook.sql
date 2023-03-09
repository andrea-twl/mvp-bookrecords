DELETE FROM book_rents;
DELETE FROM author_books;
DELETE FROM books;
DELETE FROM authors;
DELETE FROM people;

INSERT INTO books(id, name, "created_at", "updated_at") VALUES (1, 'Good Omens', NOW(), NOW());

INSERT INTO authors(id, name, "created_at", "updated_at") VALUES (1, 'Neil Gaiman', NOW(), NOW());
INSERT INTO authors(id, name, "created_at", "updated_at") VALUES (2, 'Terry Pratchet', NOW(), NOW());

INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 1, 1);
INSERT INTO author_books("created_at", "updated_at", author_id, book_id) VALUES (NOW(), NOW(), 2, 1);

INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (1, 'Alice Tan', NOW(), NOW(), 1);

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 1, NOW(), NOW());
