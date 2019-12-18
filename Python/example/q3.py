'''
문제 3.
숫자를 입력 받아 짝수/홀수를 구분하는 코드를 작성해주세요 :)
'''

number = int(input('숫자를 입력하세요: '))
# 아래에 코드를 작성해 주세요.

print(bool(number%2))

if number <0 :
    print("음수!")
elif number ==0 :
    print("0!")
elif number%2==0: 
    print("짝수!")
elif number%2==1:
    print("홀수!")
