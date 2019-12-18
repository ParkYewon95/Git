'''
문제 5.
표준 입력으로 물품 가격 여러 개가 문자열 한 줄로 입력되고, 각 가격은 ;(세미콜론)으로 구분되어 있습니다.
입력된 가격을 높은 가격순으로 출력하는 프로그램을 만드세요.
# 입력 예시: 300000;20000;10000;40000;20000
'''

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