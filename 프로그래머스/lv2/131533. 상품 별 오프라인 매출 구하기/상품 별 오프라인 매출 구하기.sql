-- 코드를 입력하세요
select PRODUCT_CODE, sum(p.PRICE * o.SALES_AMOUNT) as "SALES"
from product p, OFFLINE_SALE o
where p.PRODUCT_ID = o.PRODUCT_ID
group by p.PRODUCT_CODE
order by sales desc, p.PRODUCT_CODE