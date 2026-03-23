## `java-practice-archive` 저장소 정리 문서

### 1. 목적

이 저장소는 자바 학습 과정에서 나온 결과물을 한 곳에 정리하는 아카이브 저장소다.

포함 대상:

- 자바 개념 실습
- 코딩테스트 문제 풀이
- 챌린지/프리코스/복습형 프로젝트

---

### 2. 최종 저장소 구조

```
java-practice-archive/
├── README.md
├── .gitignore
├── docs/
│   └── repository-guide.md
│
├── practice/
│   ├── lectures/
│   ├── books/
│   └── experiments/
│
├── coding-test/
│   ├── baekjoon/
│   │   ├── bronze/
│   │   ├── silver/
│   │   ├── gold/
│   │   ├── platinum/
│   │   └── unclassified/
│   │
│   ├── programmers/
│   │   ├── level1/
│   │   ├── level2/
│   │   ├── level3/
│   │   ├── level4/
│   │   ├── level5/
│   │   └── unclassified/
│   │
│   ├── book-problems/
│   │   ├── 이것이-코딩테스트다/
│   │   └── other-books/
│   │
│   └── data-structures/
│       ├── stack/
│       ├── queue/
│       ├── deque/
│       ├── linked-list/
│       ├── tree/
│       ├── heap/
│       ├── graph/
│       └── hash/
│
└── programming-challenges/
    ├── wanted/
    ├── woowa-precourse/
    ├── youthcon/
    └── other/
```

---

### 3. 폴더 역할

### `practice/`

자바 개념 실습, 책 예제, 인강 코드, 실험 코드 보관

예:

- 스트림 실습
- 제네릭 테스트
- enum 연습
- 컬렉션 비교 코드

### `coding-test/`

문제풀이 및 자료구조 구현

포함:

- 백준
- 프로그래머스
- SQL 문제
- 책 문제
- 자료구조 직접 구현

### `programming-challenges/`

우테코, wanted, youthcon 등 외부 챌린지뿐만 아니라
요구사항 기반으로 진행한 **프로젝트성 과제**를 보관한다.

특징:

* 단순 알고리즘 풀이가 아니라
* 요구사항 분석, 객체지향 설계, 테스트, 리팩토링 등을 포함하는 결과물

하위 폴더 설명:

* `wanted/`, `woowa-precourse/`, `youthcon/`

    * 외부 프로그램 참여 결과물

* `other/`

    * 외부 참여 없이 개인적으로 진행한 프로젝트성 과제
    * 복습형 미션, 재구현 프로젝트, 리팩토링 연습 등을 포함

---

### 4. 문제풀이 분류 원칙

### 4-1. 플랫폼 우선 분류

문제는 **주제별보다 플랫폼별로 먼저 분류**한다.

이유:

- 백준과 프로그래머스는 제출 방식이 다름
- 클래스명 규칙이 다름
- 문제 관리와 회고가 플랫폼 기준으로 더 쉬움

### 4-2. 동일 문제 중복 저장 금지

같은 문제를 여러 폴더에 중복 저장하지 않는다.

원칙:

- 백준/프로그래머스에 실제 제출한 문제 → 해당 플랫폼에 저장
- 책에서만 푼 문제 → `book-problems/` 에 저장

예:

- 책에서 봤지만 실제로 백준에 제출했다 → `baekjoon/`
- 책에서만 연습했다 → `book-problems/`

---

### 5. 문제 폴더 네이밍 규칙

### 백준

```
bj_문제번호_문제이름-영문요약
```

예:

- `bj_1000_a-plus-b`
- `bj_1920_find-number`
- `bj_1874_stack-sequence`

클래스명은 기본적으로 `Main`

### 프로그래머스

```
pg_문제번호_문제이름-영문요약
```

예:

- `pg_12982_budget`
- `pg_42586_function-development`
- `pg_43165_target-number`

클래스명은 기본적으로 `Solution`

문제번호 관리가 어려운 경우에만:

- `pg_level1_budget`
- `pg_level2_target-number`

---

### 6. 문제별 README 작성 원칙

모든 문제에 README를 만들지는 않는다.

작성 대상:

- 헷갈렸던 문제
- 다시 볼 가치가 큰 문제
- 대표 유형 문제
- 실수 기록이 중요한 문제

쉬운 문제는 코드만 저장 가능

### README 템플릿

```
# 문제 정보
- 플랫폼:
- 문제 번호:
- 문제 이름:
- 링크:

# 풀이 아이디어
- 사용 알고리즘:
- 핵심 자료구조:
- 시간 복잡도:

# 배운 점
-

# 실수한 점
-

# 다시 풀 때 포인트
-
```

---

### 7. 자료구조 구현 원칙

자료구조 구현은 문제풀이와 구분해서 `data-structures/` 아래에 저장한다.

예:

```
coding-test/data-structures/
├── stack/
│   └── array-stack/
├── queue/
│   └── array-queue/
├── linked-list/
│   └── singly-linked-list/
└── heap/
    └── max-heap/
```

---

### 8. Git 운영 원칙

### 8-1. 커밋 메시지 규칙

형식:

```
prefix: 한글 설명
```

사용 prefix:

- `feat`
- `refactor`
- `docs`
- `test`
- `chore`

예:

- `feat: 백준 1920 수 찾기 풀이 추가`
- `docs: 리포지토리 가이드 문서 추가`
- `refactor: programming-challenges 하위 구조 정리`
- `chore: 빈 디렉터리 추적을 위한 gitkeep 추가`

### 8-2. 빈 디렉터리 처리

Git은 빈 디렉터리를 추적하지 않으므로 필요한 경우 `.gitkeep` 사용

---

### 9. 기존 저장소/이력 처리 원칙

### 현재 메인 저장소

- 기존 `programming-challenges` 저장소를 `java-practice-archive`로 이름 변경하여 계속 사용

### 이유

- 기존 챌린지/프리코스 기록 유지
- 기존 커밋 이력과 잔디 유지
- 별도 새 저장소로 분리하지 않고 하나의 아카이브로 확장 가능

### 과거 코딩테스트 저장소

- 과거 코테 repo의 **커밋 이력까지 새 저장소 안에 포함하고 싶다면 `subtree` 사용**
- 단순 복사/이동은 파일만 들어오고 기존 커밋 히스토리는 새 저장소에 포함되지 않음

운영 원칙:

- 과거 코테 repo는 `subtree`로 아카이브성 경로에 포함
- 앞으로 새로 푸는 문제는 현재 구조 기준으로 새롭게 관리

---

### 10. 현재 최종 결정 요약

- 저장소는 `spring-study-records`, `java-practice-archive` 2개 체제로 운영
- `java-practice-archive` 내부는 `practice / coding-test / programming-challenges` 3축 구조
- 문제풀이는 플랫폼 우선 분류
- 같은 문제는 한 군데만 저장
- 백준/프로그래머스는 폴더명으로 식별, 클래스명은 단순화
- 과거 코테 repo 히스토리까지 포함하려면 subtree 사용