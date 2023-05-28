# 🍄&nbsp;&nbsp;강아지 산책은 멍더와 함께

</br>

## 🔥&nbsp;&nbsp;MVP Version 1.0

- https://mungther.toppings.co.kr/

<br/>

## 🛠️&nbsp;&nbsp;Tech Stack

<table>
<!-- Programming Language -->
  <tr>
    <td align=center><b>Language</b></td>
    <td><img src="https://cdn-icons-png.flaticon.com/512/226/226777.png" width="15px" alt="_icon"/>&nbsp;&nbsp;Java</td>
    <td>객체지향 설계의 <a href="https://ko.wikipedia.org/wiki/SOLID_(%EA%B0%9D%EC%B2%B4_%EC%A7%80%ED%96%A5_%EC%84%A4%EA%B3%84)"/>SOLID 원칙</a>을 준수하며,<br/><a href="https://agilemanifesto.org/iso/ko/manifesto.html"/>애자일 소프트웨어 개발 선언</a>에 입각한 개발</td>
  </tr>
<!-- Web Development -->
  <tr>
    <td rowspan=4 align=center><b>Web Framework<br>DB Access</b></td>
    <td><img src="https://user-images.githubusercontent.com/112257466/209075018-0a1f7f14-a910-4d16-a4e4-51929b99e1ae.png" width="15px" alt="_icon"/>&nbsp;&nbsp;Spring</td>
    <td>강력한 기능과 확장성을 자랑하는 <br/>Spring 프레임워크 기반으로, 백엔드 서버를 설계</td>
  </tr>
  <tr>
	<td><img src="https://user-images.githubusercontent.com/112257466/209075280-78be8487-7d6a-485c-92a8-d6677f0caab9.png" width="15px" alt="_icon"/>&nbsp;&nbsp;Spring Boot</td>
    <td>간편한 설정과 내장 Tomcat을 활용해, 편리한 개발을 지원<br/>다양한 Spring 모듈과 라이브러리 호환성을 위하여 사용</td>  
</tr>
  <tr>
    <td><img src="https://minkukjo.github.io/assets//img/spring-data-logo.png" width="15px" alt="_icon"/>&nbsp;&nbsp;Spring Data JPA</td>
    <td>객체 관계 매핑을 편리하게 하고, 자동 구현 레포지토리 사용<br/>다양한 DB와의 호환과, 동적 쿼리 메서드 생성을 위해 활용</td>
    </tr>
  <tr>
    <td><img src="https://oopy.lazyrockets.com/api/v2/notion/image?src=https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F72ed675a-8f36-4783-81d1-030165bb15c7%2Ficon-querydsl.png&blockId=cac4d554-8846-4a57-a113-a9160f63ff78" width="15px" alt="_icon"/>&nbsp;&nbsp;QueryDsl</td>
    <td>Fluent API를 활용해 직관적이고, 가독성이 높은 쿼리 작성<br/>코드 재사용과 유지보수가 용이한 라이브러리</td>
    </tr>
    <tr>
    <td rowspan=2 align=center><b>Database</b></td>
<td><img src="https://user-images.githubusercontent.com/112257466/209078356-d9120e3d-9498-4ee4-a38d-139a263910f4.png" width="15px" alt="_icon"/>&nbsp;&nbsp;MySQL</td>
    <td>무료 오픈소스 RDBMS로, 높은 성능과 확장성을 가졌으며<br/>보안성과 범용성을 갖춘 Toppings Main Database</td>  
</tr>
  <tr>
    <td><img src="https://user-images.githubusercontent.com/77544214/233575040-896e521c-0529-4432-a398-ad1a3e3f58c0.svg" width="15px" alt="_icon"/>&nbsp;&nbsp;Redis</td>
    <td>다양한 데이터 구조를 지원하는 In-Memory DB로,<br/>메세지 기반 비동기 통신을 구현</td>  
</tr>

  <tr>
  	<td rowspan=3 align=center><b>Security</b></td>
    <td><img src="https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FNlhH7%2Fbtrmfi74Bkr%2FkbXesWwORBSYFm1xurKzB0%2Fimg.png" width="15px" alt="_icon"/>&nbsp;&nbsp;Spring Security</td>
    <td>강력한 인증/인가 기능을 제공하는 프레임워크로,<br/>다양한 인증과 프로토콜을 지원하고 OAuth 확장을 위해 사용</td>  
</tr>
  <tr>
    <td><img src="https://blog.kakaocdn.net/dn/cqbtEQ/btrZISJO4rM/psTAeZ2SeJr4mw2z80gt00/img.png" width="15px" alt="_icon"/>&nbsp;&nbsp;JWT</td>
    <td>세션 정보를 저장하지 않고, 토큰을 포함한 요청을 처리하고,<br/>사용자 인증과, 보안성을 위해 활용</td>
    </tr>
  <tr>
    <td><img src="https://static-00.iconduck.com/assets.00/oauth-icon-512x511-baa2vilm.png" width="15px" alt="_icon"/>&nbsp;&nbsp;OAuth2</td>
    <td>KAKAO OAuth2를 통해 간편하고 안전한 인증 프로세스를 제공,<br/>사용자에게 신속하고, 편리한 회원가입 경험 제공</td>
</tr>
<!-- Testing -->
  <tr>
    <td rowspan=2 align=center><b>Testing<br/>API Documentation</b></td>
    <td><img src="https://junit.org/junit5/assets/img/junit5-logo.png" width="15px" alt="_icon"/>&nbsp;&nbsp;JUnit5</td>
    <td>빌드 도구와 연동하여 테스트 자동화 수행을 지원<br/>RestDocs와의 연동을 통한 검증된 API 명세 제공</td>  
</tr>
<tr>
<td><img src="https://images.velog.io/images/max9106/post/a8abf615-c610-40aa-b997-b24542845ad0/%E1%84%89%E1%85%B3%E1%84%91%E1%85%B3%E1%84%85%E1%85%B5%E1%86%BC%20rest%20docs.png" width="15px" alt="_icon"/>&nbsp;&nbsp;Spring RestDocs</td>
<td>테스트코드에 기반한 API 문서화를 통해,<br/>신뢰할 수 있고, 안정적인 API 명세를 문서화</td>
</tr>
<!-- DevOps -->
  <tr>
    <td rowspan=2 align=center><b>DevOps<br>Version Control</b></td>
    <td><img src="https://avatars.githubusercontent.com/u/44036562?s=280&v=4" width="15px" alt="_icon" />&nbsp;&nbsp;Github Actions</td>
    <td>CI/CD 파이프라인 자동화를 통해,<br/>코드 PR간 AutoAssign, 테스트 자동화 지원</td> 
</tr>
  <tr>
    <td><img src="https://www.docker.com/wp-content/uploads/2022/03/Moby-logo.png" width="15px" alt="_icon" />&nbsp;&nbsp;Docker</td>
    <td>일관된 개발 환경과, 빠른 배포, 확장성을 위해 활용</td>
</tr>
<!-- Cloud Computing -->
  <tr>
    <td align=center><b>Cloud Computing</b></td>
    <td><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/AWS_Simple_Icons_AWS_Cloud.svg/2560px-AWS_Simple_Icons_AWS_Cloud.svg.png" width="15px" alt="_icon" />&nbsp;&nbsp;AWS</td>
    <td>안정성과 신뢰성, 보안성을 확보한 클라우드 서비스 이용</td>
</tr>
</table>

<br/>

## 💂️&nbsp;&nbsp;Developers

<br/>
<div>
<table border=""2 width="100%">
  <tr>
     <td align="center"><a href="http://github.com/h-beeen"><img src="https://avatars.githubusercontent.com/u/112257466?v=4" width="180px;" style="vertical-align:top" alt=""/>
   <td align="center"><a href="https://github.com/k-gn"><img src="https://avatars.githubusercontent.com/u/77544214?v=4" width="180px;" style="vertical-align:top" alt=""/>
  </tr>

  <tr>
  <td align="center"><a href="https://github.com/h-beeen"><b>🐧 변해빈 🐧</b></a></td>
  <td align="center"><a href="https://github.com/k-gn"><b>🐤 김규남 🐤</b></a></td>
  </tr>
</table>
</div>
<br/>
