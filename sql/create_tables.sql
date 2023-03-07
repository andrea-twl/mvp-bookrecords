CREATE SEQUENCE people_id_seq;
CREATE SEQUENCE books_id_seq;
CREATE SEQUENCE authors_id_seq;

--this is the people table
CREATE TABLE IF NOT EXISTS people (
    id integer NOT NULL DEFAULT nextval('people_id_seq'::regclass),
    name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    "createdAt" timestamp with time zone NOT NULL,
    "updatedAt" timestamp with time zone NOT NULL,
    country_id bigint,
    CONSTRAINT people_pkey PRIMARY KEY (id)
);

--this is the book table
CREATE TABLE IF NOT EXISTS books (
    id integer NOT NULL DEFAULT nextval('books_id_seq'::regclass),
    name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    "createdAt" timestamp with time zone NOT NULL,
    "updatedAt" timestamp with time zone NOT NULL,
    CONSTRAINT books_pkey PRIMARY KEY (id)
);

-- this is the author table
CREATE TABLE IF NOT EXISTS authors (
    id integer NOT NULL DEFAULT nextval('authors_id_seq'::regclass),
    name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    "createdAt" timestamp with time zone NOT NULL,
    "updatedAt" timestamp with time zone NOT NULL,
    CONSTRAINT authors_pkey PRIMARY KEY (id)
);

-- this is the author and book multi to multi relationship table
CREATE TABLE IF NOT EXISTS author_books (
    "createdAt" timestamp with time zone NOT NULL,
    "updatedAt" timestamp with time zone NOT NULL,
    author_id integer NOT NULL,
    book_id integer NOT NULL,
    CONSTRAINT author_books_pkey PRIMARY KEY (author_id, book_id),
    CONSTRAINT author_books_author_id_fkey FOREIGN KEY (author_id)
        REFERENCES authors (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT author_books_book_id_fkey FOREIGN KEY (book_id)
        REFERENCES books (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

--this is the book renting history table
CREATE TABLE IF NOT EXISTS book_rents (
    person_id bigint NOT NULL,
    book_id bigint NOT NULL,
    "createdAt" time with time zone NOT NULL,
    "updatedAt" time with time zone NOT NULL,
	CONSTRAINT book_rents_person_id_fkey FOREIGN KEY (person_id)
        REFERENCES authors (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT book_rents_book_id_fkey FOREIGN KEY (book_id)
        REFERENCES books (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);


