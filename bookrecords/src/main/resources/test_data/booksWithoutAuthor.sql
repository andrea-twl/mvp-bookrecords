DELETE FROM book_rents;
DELETE FROM author_books;
DELETE FROM books;
DELETE FROM authors;
DELETE FROM people;

INSERT INTO books(id, name, "created_at", "updated_at") VALUES (1, 'Good Omens', NOW(), NOW());
INSERT INTO books(id, name, "created_at", "updated_at") VALUES (2, 'Reaper Man', NOW(), NOW());

INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (1, 'Alice Tan', NOW(), NOW(), 1);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (2, 'Bob Lee', NOW(), NOW(), 1);

INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 1, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (2, 1, NOW(), NOW());
INSERT INTO book_rents(person_id, book_id, "created_at", "updated_at") VALUES (1, 2, NOW(), NOW());
