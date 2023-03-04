-- 코드를 입력하세요
select *
from (
SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
from food_product
order by price desc
)
where rownum =1
;
