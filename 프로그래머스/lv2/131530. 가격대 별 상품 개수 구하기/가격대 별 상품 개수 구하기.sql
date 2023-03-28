-- 코드를 입력하세요
SELECT trunc(price, -4) as "PRICE_GROUP", count(trunc(price, -4))
from PRODUCT
group by trunc(price, -4)
order by PRICE_GROUP