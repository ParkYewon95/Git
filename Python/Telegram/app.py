from flask import Flask, render_template, request #요청받을 때
from decouple import config
import requests # 보내기용
import random

app = Flask(__name__)


token = config('TELEGRAM_BOT_TOKEN')
chat_id = config('CHAT_ID')

app_url = f"https://api.telegram.org/bot{token}"


# root
@app.route('/')
def hello():
    return "안녕하세요!"

@app.route('/write')
def write():
    # HTML file
    return render_template("write.html")


@app.route('/send')
def send():
    message = request.args.get("message")
    message_url = app_url + f"/sendMessage?chat_id={chat_id}&text={message}"
    # message 받아서 telegram 메시지 보내는 요청
    requests.get(message_url)
    return "메시지 전송 완료 했어요!"

#webhook
@app.route(f"/{token}", methods=['POST'])
def telegram():
    
    #print(request.get_json())

    response = request.get_json()
    
    #실습 1 : 사용자의 아이디랑 텍스트 불러오기
    chat_id = response["message"]["chat"]["id"] # message 디렉토리 안에 chat 디렉토리 안에 id
    text = response["message"]["text"]
    # print(chat_id)
    # print(text)

    # 앵무새
    # 실습 2 : 텔레그램 메시지 보내기 요청
    # message_url = app_url + f"/sendMessage?chat_id={chat_id}&text={text}"
    # requests.get(message_url)
    
    # if 만약 /로또 입력이 되면 text > 6 개 숫자 추천.
    if text == "/로또":
        texts =sorted(random.sample(range(1,46),6))
        
    elif text == "/점심":
        menus = ["20층","양자강","맥도날드","바스버거"]
        texts = random.choice(menus)
    
    message_url = app_url + f"/sendMessage?chat_id={chat_id}&text={texts}"
    requests.get(message_url)

    # return body , status code : 200 - 응답성공
    return '',200


# debug
if __name__ == "__main__":
    app.run(debug=True)