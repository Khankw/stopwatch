# Stopwatch
- Thread 와 StringBuffer를 활용한 stopwatch 구현

> #### 설명
- Time과 Input으로 만들어진 두 thread가 구동되며 StringBuffer를 통해 입력된 값을 체크하여 컨트롤한다.
  - Input은 입력값을 StringBuffer에 넣어주는 역할을 한다.
  - Input은 q를 입력받으면 루프가 멈춘다.
  - Time은 StringBuffer값이 h이면 시간출력과 초누적을 멈춘다.
  - Time은 StringBuffer값이 q와 h가 아닌 다른 값이면 시간출력과 초누적을 이어간다.
  - Time은 StringBuffer값이 q이면 루프를 끝내고 결과를 출력한다.
  - Time과 Input으로 만들어진 두 thread는 각 루프가 끝나면 종료된다.

> #### Class Diagram
![클래스 다이어그램](https://github.com/Khankw/stopwatch/blob/main/resources/classdiagram.png)

> #### Demo
<img src="https://github.com/Khankw/stopwatch/blob/main/resources/demo.gif" width="400px">
