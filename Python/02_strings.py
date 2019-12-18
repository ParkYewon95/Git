'''
String 조작하기  
1. 글짜 합체
string + string

2. 글짜 삽입(수술)

3. 글자 자르기

'''

# 1
hphk = 'happy'+'hacking'
print(hphk)

# 2
name = 'yewon'
age = 20
text = "안녕하세요 저는 {}입니다. 나이는 {}입니다".format(name,age)
print(text)

f_text = f"저는 {name}입니다. 나이는 {age}입니다."
print(f_text)

# 3
# string[start index :end index -1 까지]
text_name = text[1:3]
print(text_name)

# split(변수) - 변수가 공백일 경우 띄어쓰기로 구분 
text_sp = text.split('.')
print(text_sp)