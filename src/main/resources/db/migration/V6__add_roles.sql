INSERT INTO roles(id, name) VALUES (1000,'ADMIN');
INSERT INTO roles(id, name) VALUES (1001,'USER');

INSERT INTO groups(id, name) VALUES (1000,'ADMIN');
INSERT INTO groups(id, name) VALUES (1001,'USER');

INSERT INTO groups_roles(groups_id, roles_id) VALUES (1000, 1000);
INSERT INTO groups_roles(groups_id, roles_id) VALUES (1000, 1001);
INSERT INTO groups_roles(groups_id, roles_id) VALUES (1001, 1001);

UPDATE accounts
SET group_id =1000
WHERE login='admin';