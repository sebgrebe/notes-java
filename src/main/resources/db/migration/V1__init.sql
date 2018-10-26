DROP TABLE IF EXISTS notes;

CREATE TABLE notes (
  id bigserial PRIMARY KEY,
  content varchar(250) NOT NULL
);