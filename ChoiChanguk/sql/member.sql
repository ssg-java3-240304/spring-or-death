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
    ('choi@example.com', 'password102', '최지현', '2023-05-01 14:00:00'),
    ('gilmon@naver.com', '123', '길몬', '2024-01-01 10:00:00'),
    ('graimon@naver.com', '123', '그레이몬', '2023-02-01 11:00:00'),
    ('krong@naver.com', '123', '크롱', '2023-03-01 12:00:00'),
    ('pairi@naver.com', '123', '파이리', '2023-04-01 13:00:00'),
    ('picachu@naver.com', '123', '피카츄', '2023-05-01 14:00:00'),
    ('ponita@naver.com', '123', '포니타', '2023-05-01 16:00:00'),
    ('rejamong@naver.com', '123', '리자몽', '2023-05-01 13:00:00'),
    ('rejard@naver.com', '123', '리자드', '2024-05-01 11:00:00'),
    ('poby@naver.com', '123', '포비', '2024-02-01 15:00:00'),
    ('gyarados@naver.com', '123', '가랴도스', '2024-01-01 14:00:00');

insert into member(member_email, member_password, member_name,registration_date)
VALUES ('cstangga@example.com', 'password123', '홍길동', LOCALTIME);

select *
from member;
