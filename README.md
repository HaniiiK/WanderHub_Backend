# WanderHub

> **여행 동행 커뮤니티 WanderHub!**

<p align='center'>
<img src="https://github.com/WanderHub/WanderHub_Frontend/assets/123078739/75e40e8d-ee49-4c9b-978c-1fd21af0f6f8" width="300px" height="300px" alt="SiteLogo"></img></p><br/>

## 🔗 배포 주소

> 프론트 서버 : https://wanderhubtravel.netlify.app <br>
> 백엔드 서버 : http://ec2-3-34-80-242.ap-northeast-2.compute.amazonaws.com:8080/

## 🗺️ 팀 소개

### 🧳 팀원

<table>
  <tbody>
    <tr>
      <td align="center"><a href="https://github.com/jgkang9402"><img src="https://avatars.githubusercontent.com/u/93317914?v=4" width="130px;" alt="FE강정구 깃허브"/><br /><sub><b>FE 강정구</b></sub></a><br /></td>
      <td align="center"><a href="https://github.com/jjangeunyeong"><img src="https://avatars.githubusercontent.com/u/123078739?v=4" width="130px;" alt="FE장은영 깃허브"/><br /><sub><b>FE 장은영</b></sub></a><br /></td>
      <td align="center"><a href="https://github.com/HaniiiK"><img src="https://avatars.githubusercontent.com/u/127297705?v=4" width="130px;" alt="BE김하은 깃허브"/><br /><sub><b>BE 김하은</b></sub></a><br /></td>
  </tbody>
</table>

### 📌 Convention

#### 깃 컨벤션

- feat : 기능 추가
- fix : 오류 수정
- hostfix : 급한 오류 수정
- docs : 문서 수정
- refactor : 리팩토링
- test : 테스트 코드
- chore : 빌드 관련 코드
- style : 코드 스타일 수정 (세미 콜론 누락, 코드 포맷 변경 등)
- design : CSS 등 사용자 UI 디자인 추가/수정
- rename : 파일 및 폴더명 수정
- remove : 파일 삭제
- env : 개발환경 셋팅

#### 코드 컨벤션

> **FE**

- 파일명 : 첫글자 대문자, PascalCase
- any : 되도록 지양!
- 컴포넌트 prop의 type은 해당 컴포넌트 위에 바로 작성
- 그 외의 type은 types 폴더에 분리
- commit 시, Git Convention 지키기
- commit 시, 구현 내용은 한글로 작성 ok!

> **BE**

- **패키지명 전체 소문자**
- 클래스명, 인터페이스명 CamelCase
- 클래스 이름 명사 사용
- 상수명 SNAKE_CASE
- Controller, Service, Dto, Repository, Mapper 앞에 접미사로 통일(ex. MemberController)
- **service 계층** **메서드**명 create, update, find, delete로 CRUD 통일(ex. createMember)
- Test 클래스는 접미사로 Test 사용(ex. memberFindTest)

## 🌏 프로젝트 소개

> "Wander"는 "배회하다"라는 의미로 여행의 특징을 잘 나타내며, "Hub"는 중심지나 중심으로서의 역할을 의미합니다. 따라서 이 이름은 여행 커뮤니티가 모여 소통하고 정보를 공유하는 중심지라는 메시지를 전달할 수 있습니다.

### 🛠️ 기술 스택

> **BE** <br>
> <img src="https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white" />
> <img src="https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=MySQL&logoColor=white" />
> <img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=flat&logo=Spring Boot&logoColor=white" />
> <img src="https://img.shields.io/badge/Amazon AWS-232F3E?style=flat&logo=Amazon AWS&logoColor=white" />
> <img src="https://img.shields.io/badge/Amazon EC2-FF9900?style=flat&logo=Amazon EC2&logoColor=white" />
> <img src="https://img.shields.io/badge/Amazon RDS-527FFF?style=flat&logo=Amazon RDS&logoColor=white" />

### 💻 화면 구성

|                           |                           |
| ------------------------- | ------------------------- |
| 홈 화면                   | 로그인 모달               |
| <img width="329" src=""/> | <img width="329" src=""/> |
| 동행 페이지               | 여행지 페이지             |
| <img width="329" src=""/> | <img width="329" src=""/> |
| 커뮤니티 페이지           | 마이 페이지               |
| <img width="329" src=""/> | <img width="329" src=""/> |

### ⚙️ 주요 기능

#### 🔍 소셜 로그인, 로그아웃 기능

#### 🔍 지역, 날짜에 따른 동행 글 작성 기능

#### 🔍 여행지 페이지 기능(기술필요)

#### 🔍 커뮤니티 글 작성 기능

#### 🔍 마이페이지 나의 정보, 나의 글 조회 기능

#### 🔍 페이지 네이션, 페이징

- 동행 페이지의 동행 글, 커뮤니티 페이지의 커뮤니티 글 조회 시, 페이지네이션과 페이징
- 10개씩 리스트로 보여줌

### 📖 [API](https://www.notion.so/REST-DOCS-df44b88728224b5dab3366bfbc032da0)

