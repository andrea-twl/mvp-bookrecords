DELETE FROM book_rents;
DELETE FROM author_books;
DELETE FROM books;
DELETE FROM authors;
DELETE FROM people;

INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (1, 'Alice Tan', NOW(), NOW(), 1);
INSERT INTO people(id, name, "created_at", "updated_at", country_id) VALUES (2, 'Bob Lee', NOW(), NOW(), 1);
