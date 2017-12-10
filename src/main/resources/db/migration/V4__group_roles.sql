CREATE TABLE groups
(
  id SERIAL,
  name VARCHAR(30),
  CONSTRAINT groups_pkey PRIMARY KEY (id)
);

CREATE TABLE roles
(
  id SERIAL,
  name VARCHAR(50) NOT NULL,
  CONSTRAINT roles_pkey PRIMARY KEY (id)
);
CREATE TABLE groups_roles
(
  groups_id INTEGER NOT NULL,
  roles_id INTEGER NOT NULL,
  CONSTRAINT groups_roles_pkey PRIMARY KEY (groups_id, roles_id),
  CONSTRAINT fk1 FOREIGN KEY (groups_id) REFERENCES groups (id),
  CONSTRAINT fk2 FOREIGN KEY (roles_id) REFERENCES roles (id)
);

ALTER TABLE accounts ADD COLUMN group_id INTEGER;
ALTER TABLE accounts ADD CONSTRAINT fk_accounts_groups_roles FOREIGN KEY (group_id) REFERENCES groups (id);
ALTER TABLE accounts ADD COLUMN enabled boolean;