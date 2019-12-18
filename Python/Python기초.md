# Python 101



* dictionary 

  * dict = { key:value, ~~}

  * value 를 얻는 방법

    (1) dict[key]

    ​	- key가 없으면 error 발생

    (2) dict.get(key)

    ​	- key 가 없으면 none 출력



* visual studio 단축키 
  * 행 복사 = shift + alt + 방향키
  * 행 삭제 = shift + delete 



* control + shif + ~  (물결) 

  : visual studio code에 bash창 삽입





## 1. 저장

### 	1) 숫자

- 연산자 
  - a/b : 나누기
  - a//b : 몫
  - a%b : 나머지

  ### 2) 문자

* print format

  ```python
  name = 'yewon'
  age = 20
  text = "안녕하세요 저는 {}입니다. 나이는 {}입니다".format(name,age)
  print(text)
  
  f_text = f"저는 {name}입니다. 나이는 {age}입니다."
  print(f_text)
  ```

* string index

  ```python
  # string[start index :end index -1 까지]
  text_name = text[1:3]
  print(text_name)
  
  # split(변수) - 변수가 공백일 경우 띄어쓰기로 구분 
  text_sp = text.split('.')
  print(text_sp)
  ```

  

## 2. 조건

* boolean type

  * 한국어 변수도 된다..! 

  ```python
  참 = True
  거짓 = False
  
  if 참 :
      print("참참참")
  if not 거짓 :
      print("거짓거짓")
  if 거짓:
      print("노노노")
      
  ====================
  참참참
  거짓거짓
  ```





## 3. 반복

