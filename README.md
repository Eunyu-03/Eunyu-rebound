# Rebound - 실패 사례 공유를 통한 심리 치료 플랫폼

## 1. 기획 의도

<img width="1968" height="1108" alt="image" src="https://github.com/user-attachments/assets/8026e344-05da-4ac7-a441-e6a955d6094f" />

다수가 겪는 **실패**, 하지만 경우가 다양하여 극복 방법을 알기가 어렵다. 하여 마음의 병으로 고통받는 일이 빈번히 발생한다. 이러한 일상 속의 크고 작은 실패를 공유하고 그에 대한 극복의 이야기를 나누는 공간의 필요성을 느꼈다.

## 2. 기대 효과

<img width="1957" height="1099" alt="image" src="https://github.com/user-attachments/assets/8e55b132-fa1b-44ee-89e4-2841abf31de8" />

마음의 휴식처 마련하고, 위안을 받고 또 주는 선순환을 생성하여 실패를 부정적만 여기는 사회 분위기 타파에 도움을 줄 수 있을 것으로 보인다.



## 3. 프로젝트 사용 툴&스킬

- Java
- Java Script
- tomcat
- MyBatis
- Spring Boot
- Postgre
- intelli J
- JSON
- JDK
- HTML, CSS
- JSP
- Spring Boot
- JUnit
- Mysql
- Mybatis
- AWS-EC2
- AWS-IAM
- Thymeleaf
- VS Code
- Intelli J
- DBeaver
- Kakao DEVELOPER API
- JavaMail
- Git(Git-hub)
- Git-Bash
- YML
- Gradle
- Slack


## 4. ERD

<img width="4004" height="4356" alt="image" src="https://github.com/user-attachments/assets/111d85e5-2f70-4566-b9c5-634d51e0bdd9" />


## 5. 담당 업무

### 1. 프론트엔드

<img width="1527" height="550" alt="image" src="https://github.com/user-attachments/assets/ff688077-9f7b-4167-aefc-74efe623fcb0" />

기업 콘솔
- 기업 홈(공고와 광고 관련 정보 표시)
- 기업 프로필 편집
- 체험 공고 등록
- 체험 공고 목록
- 체험 공고 수정
- 인턴 공고 등록
- 인턴 공고 목록
- 인턴 공고 수정
- 새 광고
- 광고 목록
- 결제 내역

### 2. 백엔드

<img width="2381" height="375" alt="image" src="https://github.com/user-attachments/assets/6137c258-2264-4a06-8d6f-6c52f687c773" />
 
체험 공고
- 체험 공고 목록 불러오기
- 키워드와 카테고리 선택으로 체험 공고 목록 필터링
- 체험 공고 상세 불러오기
- 체험 공고 저장하기
- 체험 공고 공유하기(url 복사)
- 체험 간편 지원하기

인턴 공고
- 인턴 공고 목록 불러오기
- 키워드와 카테고리 선택으로 인턴 공고 목록 필터링
- 인턴 공고 상세 불러오기
- 인턴 공고 저장하기
- 인턴 공고 공유하기(url 복사)
- 인턴 간편 지원하기

마이페이지
- 프로필 편집(프로필 사진 변경, 이름 변경, 직군 카테고리 변경, 소개 변경)
- 내 게시글 목록(클릭 시 해당 게시글 상세로 이동)
- 저장한 체험 공고 목록(클릭 시 해당 공고 상세로 이동)
- 저장한 인턴 공고 목록(클릭 시 해당 공고 상세로 이동)
- 지원한 체험 공고
- 체험 공고 지원 취소
- 지원한 인턴 공고
- 인턴 공고 지원 취소
- 결제 내역 목록 불러오기
- 보관함에 이력서 파일 저장
- 보관함 이력서 파일 목록 불러오기
- 보관함에 저장된 이력서 파일 삭제

지원자 평가
- 체험 공고에 합격했고, 체험일이 지난 지원자 평가 남기기

## 6. 느낀 점

### 어려웠던 부분
<img width="1048" height="223" alt="image" src="https://github.com/user-attachments/assets/3e80f818-b29a-49db-8a9f-aebd9b064e73" />

1. 체험 공고와 인턴 공고 기능을 구현하면서 가장 어려웠던 점은 다양한 필터 조건을 고려한 공고 목록 조회 로직이었음. 키워드, 카테고리, 저장 여부, 지원 여부 등 여러 조건이 동시에 적용될 수 있어 효율적인 쿼리 작성이 필요함을 느낌.

<img width="730" height="139" alt="image" src="https://github.com/user-attachments/assets/5025074e-e4ba-428b-88a1-daf01a0ff90b" />

2. 파일 저장 기능에서는 파일 업로드와 S3 연동이 어려웠음. 파일 경로를 받아올 때 http로 시작하지 않아 조회 시 파일이 제대로 불러와지지 않음

### 해결한 부분
<img width="749" height="814" alt="image" src="https://github.com/user-attachments/assets/663721a6-0f9a-4d18-b499-2ee0c48c6df7" />

<img width="990" height="716" alt="image" src="https://github.com/user-attachments/assets/36b70a0a-ae44-4a30-836a-6fb8e9f09108" />

1. 키워드는 DB 접근으로, 카테고리는 화면에 표시되므로 js로 단순히 처리함. 또한 저장 여부와 지원 여부를 각각 따로 가져와 코드 가독성과 유지 보수성을 높임.

<img width="801" height="559" alt="image" src="https://github.com/user-attachments/assets/7697dc2c-5289-4fdb-a53f-bef42f99a56c" />

2. getPreSignedUrl 메소드를 통해 S3에 저장된 파일은 바로 보일 수 있도록 함.

### 총평

이번 프로젝트를 통해 백엔드 개발자로서 도메인 중심 설계(DDD)와 RESTful API 설계, 그리고 보안과 성능을 고려한 개발 경험을 쌓음. 유지 보수를 위해 용도별로 간결하고 정갈하게 코드를 작성하는 것이 얼마나 중요한지 체감함.

무엇보다 사용자 중심의 기능을 개발하면서, 단순한 CRUD를 넘어서 실제 서비스에서 필요한 디테일한 로직과 예외 상황을 다루는 능력이 향상되었다고 느낌. 앞으로도 더 많은 실전 경험을 통해 백엔드 개발자로서의 깊이를 키워가고 싶다고 생각함.

