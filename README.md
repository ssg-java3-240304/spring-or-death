# spring-or-death
스프링 또는 죽음을 리턴받는 프로젝트

## 참가대상자
- 😯웹환경 와서 허우적대는 모든 이들 오십시오.😯
- 😪동기/비동기 구분못하는 분들 오십시오.😪
- 😨GET/POST가 모호하거나, forward인지 redirect인지 모르는 분들 오십시오.😨
- 😫파일업로드 얘기 나오면 소화안되시는 분들 오십시오.😫

## 참가자 
본인영문이름 폴더를 만들고 README.md를 생성해 pr 보내고, 참가할 수 있습니다.
README.md에는 다음 서약내용이 포함되어 있어야 합니다.

###### 서약
- [ ] 나는 일일이슈를 반드시 완료해서 pr을 보내겠습니다. 
- [ ] 나는 진척없이 15분을 보내면 주저없이 친구/강사에게 도움을 요청하겠습니다.
- [ ] 나는 무조건 할수 있습니다.😁

## 진행방식
강사가 일일퀘스트를 이슈로 작성해 업로드하면, 내용을 복사해 본인 작업을 하시면 됩니다.
- ✏이슈의 세부사항을 추가적으로 작성합시다. ✏
- 🎃작업 진행사항을 이슈에 기록합니다. 조우한 오류, 번뜩이는 질문 무엇이든 좋습니다. 글, 코드, 이미지 모든 수단을 동원합시다 🎃
- 🎨작업을 완료하면, pr을 요청하고, 다음날 코드리뷰를 진행합니다.🎨


### 요구사항 명세서

| **기능**      | **하위 기능**    | **설명**                                                                                     |
|---------------|------------------|----------------------------------------------------------------------------------------------|
| 회원관리      | 회원 등록         | - 회원 가입 시 이름, 이메일, 비밀번호 입력<br>- 이메일 중복 확인                          |
| 게시물관리    | 목록조회          | - 게시물 목록 조회 가능<br>- 페이징 처리                                                    |
|               | 상세조회          | - 게시물 클릭 시 상세 내용 조회 가능                                                        |
|               | 등록              | - 로그인한 회원만 게시물 등록 가능                                                          |
|               | 수정              | - 게시물 작성자 및 관리자만 게시물 수정 가능                                                |
|               | 삭제              | - 게시물 작성자 및 관리자만 게시물 삭제 가능                                                |
