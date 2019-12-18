# 반복문

hphk = "해피해킹"

for i in range(5):
    print("happy hacking")
    print(hphk)


menu1 = "순남 시래기"
menu2 ="양자강"
menu3 = "웰 스토리"

menu_list = [menu1,menu2,menu3]
print(menu_list)
print(menu_list[0])
print("-----------------------------")

# 전화번호부 저장 - dictionary
dict_num = {
    menu1:"010-1111-1111",
    menu2:"010-222-2222",
    menu3:"010-3333-3333"
}
print(dict_num["순남 시래기"]) # 없으면 에러남
print(dict_num.get("ㅇㅇ")) # 없으면 null나옴