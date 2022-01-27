# DIMigration
Migration practice koin to Hilt

https://github.com/ahmedzain958/MVVMArchitecture-master.git

koin이 적용된 위 프로젝트를 Hilt로 마이그레이션하는 연습을 진행하는 레포입니다.



Dependency Injection

의존성 주입(Dependency Injection)은 여러 컴포넌트간의 의존성이 강한 안드로이드에서

클래스 간 의존성을 낮춰줍니다.

객체 생성 시 클래스 간 의존성이 생기게 되는데 이때, 객체의 생성을 클래스 내부에서 하는 게 아니라

클래스 외부에서 객체를 생성하여 주입시켜주는 디자인 패턴을 말합니다. 

그렇다면 의존성 주입이라는 용어는 어떤 의미일까요? 

의존성?

-> 클래스 간의 의존 관계를 가지는 상황으로 A클래스 내부에서 B클래스가 생성, 사용되는 경우라고 볼 수 있습니다.

주입?

-> 클래스 내부에서 객체 생성이 아니라, 외부에서 객체를 생성해서 넣어주는 경우입니다.

의존성 주입은 클래스 외부에서 객체를 생성하여 주입하는 것입니다.

koin : https://yejinson97gaegul.tistory.com/93

Dagger, Hilt : https://0391kjy.tistory.com/55
