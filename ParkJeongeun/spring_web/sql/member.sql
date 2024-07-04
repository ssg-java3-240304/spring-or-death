use springdb;
CREATE TABLE member (
    member_id INT AUTO_INCREMENT PRIMARY KEY,
    member_email VARCHAR(255) NOT NULL UNIQUE,
    member_password VARCHAR(255) NOT NULL,
    member_name VARCHAR(100) NOT NULL,
    registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO member (member_email, member_password, member_name, registration_date)
VALUES
    ('hong@example.com', 'password123', '홍길동', '2023-01-01 10:00:00'),
    ('kim@example.com', 'password456', '김철수', '2023-02-01 11:00:00'),
    ('lee@example.com', 'password789', '이영희', '2023-03-01 12:00:00'),
    ('park@example.com', 'password101', '박민수', '2023-04-01 13:00:00'),
    ('choi@example.com', 'password102', '최지현', '2023-05-01 14:00:00');