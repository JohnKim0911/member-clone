# 회원 프로젝트 연습

> 연습일: 2025.03.24(월) ➡️ 당일 완료

> 참고한 유튜브 강의 (채널명: 코딩레시피): https://youtu.be/RhM1bQ76Tv0?si=6oY8gFEk_DHcB7IP

## 주요 기능

- 회원가입
- 로그인
- 회원목록
- 회원조회
- 회원정보 수정
- 회원삭제
- 로그아웃

### 추가 기능

- ajax를 활용한 이메일(아이디) 중복체크 하기

## MySQL 설정

### 계정 생성 및 권한 부여

```
create database db_codingrecipe;
create user user_codingrecipe@localhost identified by '1234';
grant all privileges on db_codingrecipe.* to user_codingrecipe@localhost;
```

### Test

```
use db_codingrecipe;

create table test(
    col varchar(10));

select * from test;
```