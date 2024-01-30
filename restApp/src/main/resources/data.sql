
SET @roleCount = (SELECT COUNT(*) FROM role);
IF @roleCount = 0 THEN
INSERT INTO role (title)
VALUES ('ADMINISTRATOR'),
       ('SALE_USER'),
       ('CUSTOMER_USER'),
       ('SECURE_API_USER');
END IF;


SET @userCount = (SELECT COUNT(*) FROM users);
IF @userCount = 0 THEN
INSERT INTO users (role_id, firstname, lastname, patronymic, email)
               VALUES (1, 'firstname1','lastname1','patronymic1', 'K@email.com'),
               (2, 'firstname2','lastname2','patronymic2', 'F@email.com'),
               (3, 'firstname3','lastname3','patronymic3', 'I@email.com'),
               (4, 'firstname4','lastname4','patronymic4', 'D@email.com'),
               (1, 'firstname5','lastname5','patronymic5', 'E@email.com'),
               (2, 'firstname6','lastname6','patronymic6', 'B@email.com'),
               (3, 'firstname7','lastname7','patronymic7', 'G@email.com'),
               (4, 'firstname8','lastname8','patronymic8', 'H@email.com'),
               (1, 'firstname9','lastname9','patronymic9', 'C@email.com'),
               (2, 'firstname10','lastname10','patronymic10', 'J@email.com'),
               (3, 'firstname11','lastname11','patronymic11', 'A@email.com');
END IF;