CREATE TABLE category(
    category_code INT AUTO_INCREMENT PRIMARY KEY,
    category_name VARCHAR(30) CHECK(category_name IN('공통', '운동', '등산', '게임', '낚시', '요리', '기타'))
);

INSERT INTO category (category_name) VALUES('공통');
INSERT INTO category (category_name) VALUES('운동');
INSERT INTO category (category_name) VALUES('등산');
INSERT INTO category (category_name) VALUES('게임');
INSERT INTO category (category_name) VALUES('낚시');
INSERT INTO category (category_name) VALUES('요리');
INSERT INTO category (category_name) VALUES('기타');
COMMIT;

CREATE TABLE board (
   board_no INT AUTO_INCREMENT PRIMARY KEY,
   board_type INT NOT NULL CHECK(board_type IN (1, 2)),
   category_code INT,
   board_title VARCHAR(100),
   board_body VARCHAR(4000) NOT NULL,
   member_id INT NOT NULL,
   board_count INT DEFAULT 0 NOT NULL,
   created_date DATE,
   modified_date DATE,
   board_status VARCHAR(1) DEFAULT 'Y',
   FOREIGN KEY (member_id) REFERENCES member(member_id),
   FOREIGN KEY (category_code) REFERENCES category(category_code)
);


INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '1 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '2 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '3 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '4 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '5 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);


INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '6 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '7 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '8 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '9 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '10 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);

INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '11 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '12 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '13 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '14 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '15 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '16 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '17 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '18 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '19 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '20 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);

INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '21 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '22 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '23 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '24 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '25 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '26 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '27 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '28 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '29 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '30 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);

INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '31 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '32 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '33 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '34 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '35 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '36 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '37 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '38 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '39 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '40 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);

INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '41 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '42 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '43 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '44 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '45 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '46 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '47 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '48 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '49 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '50 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);

INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '51 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '52 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '53 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '54 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '55 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '56 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '57 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '58 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '59 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '60 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);

INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '61 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '62 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '63 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '64 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '65 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '66 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '67 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '68 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '69 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '70 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);

INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '71 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '72 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '73 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '74 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '75 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '76 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '77 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '78 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '79 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '80 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);

INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '81 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '82 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '83 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '84 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '85 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '86 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '87 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '88 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '89 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '90 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);

INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '91 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '92 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '93 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '94 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '95 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '96 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '97 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '98 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '99 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '100 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);

INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '101 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '102 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '103 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '104 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '105 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '106 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '107 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '108 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '109 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '110 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);

INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '111 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '112 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '113 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '114 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '115 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '116 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '117 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '118 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '119 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '120 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);

INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '121 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '122 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);
INSERT INTO board (board_type, category_code, board_title, board_body, member_id)
VALUES (1, 1, '123 번째 게시물 입니다.', '내용은 없습니다. WE CAN DO IT!~', 2);

COMMIT;
