# Python 101



* dictionary 

  * dict = { key:value, ~~}

    ```python
  dictionary = { 1 : "철수" , 2: "짱구", 3:"훈이"}
    ```

  * value 를 얻는 방법

    (1) `dict[key]`

    ​	- key가 없으면 error 발생
  
    (2) `dict.get(key)`
  
    ​	- key 가 없으면 none 출력

* List / String / Dictionary 의 size 
  * `len()`  함수 사용

* visual studio 단축키 
  * 행 복사 = shift + alt + 방향키
  * 행 삭제 = shift + delete 
  
  * control + shif + ~  (물결) 
  
    : visual studio code에 bash창 삽입

* print 
  - print( 변수 )
  - print( f" ~~~ { 변수 } " )
  - print("~~~{ }".format(변수,..))

* `sort()` 함수와 `sorted()` 함수의 차이.
  * list.sort() 함수는 list 자체를 정렬한다.
  * sorted(list) 함수는 list는 그대로 두고 정렬한 결과만 전달한다.



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

* string[ index ]

  * string_name[0] - 첫글자
  * string_name[-1] - 마지막 글자

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

* for 반복문

```python
menus = [1,2,3,4]

for menu in menus :
    print(menu)

print("===================")

for i in range(1,10,2):
    print(i)

print("===================")

for i in range(4):
    print(menus[i])

print("===================")

test = range(4)
for i in test:
    print(i)
```

```python
1
2
3
4
===================
1
3
5
7
9
===================
1
2
3
4
===================
0
1
2
3
```



# 문제 풀어보기

## Quiz ) 리스트 Str -> Int 변환해서 정렬하기

### 문제 5.

표준 입력으로 물품 가격 여러 개가 문자열 한 줄로 입력되고, 각 가격은 ;(세미콜론)으로 구분되어 있습니다.

입력된 가격을 높은 가격순으로 출력하는 프로그램을 만드세요.

\# 입력 예시: 300000;20000;10000;40000;20000

```python
prices = input('물품 가격을 입력하세요: ')
# 아래에 코드를 작성해 주세요.

price = prices.split(';') # str로 들어감 -> int로 변환이 필요함.

# 방법 1
price = [int(i) for i in price]
price.sort(reverse=True)

print(price)


# 방법 2
empty = []
for ps in price:
    empty.append(int(ps))
empty.sort(reverse=True)

print(empty)

======================================================
물품 가격을 입력하세요: 300000;20000;10000;40000;20000
[300000, 40000, 20000, 20000, 10000]
[300000, 40000, 20000, 20000, 10000]
```



