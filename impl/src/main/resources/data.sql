INSERT INTO user_authentication (id, user_id, password, active) VALUES (1, 'james.butt', 'Password', true);
INSERT INTO user_authentication (id, user_id, password, active) VALUES (2, 'josephine.darakjy', 'Password', true);
INSERT INTO user_authentication (id, user_id, password, active) VALUES (3, 'art.venere', "Password', true);
INSERT INTO user_authentication (id, user_id, password, active) VALUES (4, 'dhiraj.raut', "Password', true);

INSERT INTO user_roles (id, role_name, active) VALUES (1, 'readonly', true);
INSERT INTO user_roles (id, role_name, active) VALUES (2, 'readwrite', true);
INSERT INTO user_roles (id, role_name, active) VALUES (3, 'administrator', true);

INSERT INTO user_mapping (id, user_id, role_id) VALUES (1, 1, 1);
INSERT INTO user_mapping (id, user_id, role_id) VALUES (2, 2, 1);
INSERT INTO user_mapping (id, user_id, role_id) VALUES (3, 2, 2);
INSERT INTO user_mapping (id, user_id, role_id) VALUES (4, 3, 1);
INSERT INTO user_mapping (id, user_id, role_id) VALUES (5, 4, 1);
INSERT INTO user_mapping (id, user_id, role_id) VALUES (6, 4, 2);
INSERT INTO user_mapping (id, user_id, role_id) VALUES (7, 4, 3);