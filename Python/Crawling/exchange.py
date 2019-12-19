import requests
from bs4 import BeautifulSoup as bs



url="https://finance.naver.com/marketindex/exchangeDetail.nhn?marketindexCd=FX_USDKRW"
res =requests.get(url).text
soup = bs(res,"html.parser")
kospi = soup.select_one("#content > div.spot > div.today > p.no_today > em > em")
print(kospi.text)


# print (f"현재 원/달러 환율은 {exc.text}입니다.")

# #파일 저장
# with open('text.txt','w',encoding='utf-8') as f:
#     f.write(f"현재 원/달러 환율은 {exc.text}입니다.")