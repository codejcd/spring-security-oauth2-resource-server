# Spring-boot-oauth2-ResourceServer
Spring-boot-oauth2-ResourceServer

# 내용
스프링 부트 기반 Oauth2 리소스 서버

# 개발 환경
Spring Boot 2.1.6 / Maven 4.0.0 / Mybatis 2.1.0 / MySQL 5.6

# Oauth2 인증 방식 
Authorization Code, Implicit, password credential, client credential 중 __password credential__ 사용

# 테스트
### POSTMAN 같은 API TEST 가능한 툴로 아래의 요건으로 호출.
1. 리소스 자원 접근 
* URI :  http://localhost:8094/user/list
* HTTP METHOD : GET
* HTTP HEADER : Bearer Token
  * token: 인증 서버로 받은 Bearer token 값

# 참고 
인증 서버 : https://github.com/codejcd/Spring-boot-oauth2-AuthenticationServer
