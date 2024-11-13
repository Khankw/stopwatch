# Stopwatch
- Thread 와 StringBuffer를 활용한 stopwatch 구현

> #### 설명
- Time과 Input 두 thread가 구동되며 StringBuffer를 통해 입력된 값을 체크하여 컨트롤한다.
  - Input을 통해 h를 입력 받으면 Time은 시간출력과 초누적을 멈춘다.
  - Input을 통해 q또는 h가 아닌 다른 값을 입력 받으면 Time은 시간출력과 초누적을 이어간다.
  - Input을 통해 q를 입력 받으면 Time은 루프를 멈추고 결과를 출력한다.

> #### Class Diagram
![클래스 다이어그램](https://github.com/Khankw/stopwatch/blob/main/resources/classdiagram.png)

> #### Demo
<img src="https://github.com/Khankw/stopwatch/blob/main/resources/demo.gif" width="400px">
