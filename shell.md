# Linux Shell

### Linux vi Editor
* Linux, Unix 환경에 가장 널리 사용되는 Text Editor
* 최초실행을 하면 명령어 입력상태가 된다.
* i, o(편집모드) 눌러 내용을 추가, 수정, 삭제 하려면 편집상태로 변환해야 한다
* 저장, 끝내기 등을 수행하려면 명령어 입력상태가 되어야 한다
* 이때는 ESC눌러(입력상태로 만듦) 

* :w -누르면 명령어 입력상태, 편집한 내용을 저장하기
* :q -누르면 명령어 입력상태, 현재 편집기를 종료하기
* :wq -누르면 명령어 입력상태, 편집한 내용을 저장하고 종료를 동시에 수행
* 편집하는 도중에 문서내용이 얽히게 되어 내용이 많이 망가질 경우에는 현재
편집된 내용을 포기하고 최초에 파일을 열었던 상태로 유지하고 싶을 때가 있다
이럴 때는 편집포기를 누른다 :q! 세개 같이 누르면 편집포기(저장하지않고끝내기)

## shell 명령어
#### cd(change dir) : 현재 작업 디렉토리(폴더)를 변경하는 명령어
* cd 명령만 입력 : 사용자의 home 디렉토리로 이동하는 명령(/home/callor)
* cd 디렉토리이름 : 특정한 디렉토리로 이동하기
* cd /(슬래시) : root 디렉토리로 이동하기 (윈도우는 \역슬래시) 주소의 맨 앞줄에 있는 뿌리로 이동하라 ,최상위 디렉토리로 이동!
* .(점 1개) 또는 ..(점 2개) : 디렉토리 개념에 매우 중요!!
* 점 1개 . 는 현재 디렉토리를 나타냄
* 점 2개 .. 는 나의 부모디렉토리를 나타냄
* cd aaa 디렉토리 : 현재 디렉토리에 가지가 붙어있는 aaa 디렉토리로 이동하라
* cd ../aaa : 현재 디렉토리에서 부모 디렉토리로 이동한 후 가지가 붙어있는
aaa 디렉토리로 이동하라
* cd/c/biz/work/java : 일단 root로 이동하고 거기에서부터 순서대로 biz디렉토리-
			work로 이동-java 디렉토리로 이동하라

### mkdir : 디렉토리를 생성!
### ls : 현재 디렉토리에 저장되어 있는 파일, 디렉토리를 보여달라(list)- 윈도우  cmd에서는 dir 명령
### ls -al : 현재 디렉토리에 저장되어 있는 파일, 디렉토리를 모두 자세히 보여달라
숨김파일도 모두 보여준다
* 리눅스에서 .으로 시작되는 파일은 숨김파일이다. ls명령으로는 숨김파일을 볼 수 없고 ls -al 명령으로만 확인할 수 있다.



