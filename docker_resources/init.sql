CREATE TABLE IF NOT EXISTS accounts(
    id SERIAL,
    "name" text,
    age int,
    PRIMARY KEY(id)
);

insert into
    accounts (id, name, age)
VALUES
    (9999, '竹内', 24),
    (8888, 'まっきー', 24),
    (7777, 'たつひこ', 32)
    ;