from flask import Flask, render_template ,request
import datetime 
import random
import requests

#지금부터 flask 서버의 이름이 app
app = Flask(__name__)

#url를 관리해주는 친구 >app.route('/')
@app.route("/") 
def hello():
    return "안녕!!"


@app.route("/dday")
def dday():
    today = datetime.datetime.now()
    print(today)
    final = datetime.datetime(2020,6,9)
    
    result = final - today
    return f"{result.days}일 남았습니다"


# is it christmas ? 라우터 만들기
# "/christmas"
@app.route("/christmas")
def christmas():
    today = datetime.datetime.now()
    #xmas = datetime.datetime(2019,12,25)
    
    real_month = today.date().month
    real_day = today.date().day

    print(f"{real_month}월 {real_day}일 ")

    if real_month == 12 and real_day == 25:
        return "<h1>Christmas Yes!</h1>"
    else :
        return "<h1>No Christmas!</h1>"


# html 넘겨주는 파일 만들기
@app.route("/movies")
def movies():
    movies=["겨울왕국2","클라우스","어바웃타임","나홀로 집에1","러브액츄얼리"]
    names = ["y","e","w","o","n"]
    return render_template("movie.html",movies = movies ,names = names) 
    # movie.html 의 movies 에 = 함수내에서 사용하고 있는 movies를 보내겠다.


# dynamic parameter 
@app.route("/greeting/<name>")
def greeting(name):
    return f"안녕하세요 {name}님! "


#return타입은 str
@app.route("/cube/<int:num>")
def cube(num):
    result = num**3
    return str(result)

@app.route("/lunch/<int:num>")
def lunch(num):
    menu_list = ["짜장면","짬뽕","오므라이스","볶음밥","고추잡채밥"]

    result = [] 
    for i in range(num):
        result.append(random.sample(menu_list,1))
    
    answer = sum(result, [])

    return render_template("movie.html",movies=answer,Text="점심메뉴")


@app.route("/vonvon")
def vonvon():
    return render_template("vonvon.html")


@app.route("/godmademe")
def godmademe():
    name = request.args.get("name")
    print(name)

    ### 매력 list
    first_list = ["못생김","봐줄만함","착하게 생김"]
    second_list = ["애교","잘난척","소심함","자신감"]
    thrid_list = ["허세","식욕","지름신","연애 운"]

    #first = random.sample(first_list,1)
    #하나만 추출하는 함수 choice 
    first = random.choice(first_list)
    second = random.choice(second_list)
    third = random.choice(thrid_list)

    return render_template("gotmademe.html",name = name, first = first, second=second,third=third)


#flask run - flask 에서 제공하는 run
# 맨아래 있어야함.
# Debug 모드  >python app.py
if __name__ =="__main__":
    app.run(debug=True)
