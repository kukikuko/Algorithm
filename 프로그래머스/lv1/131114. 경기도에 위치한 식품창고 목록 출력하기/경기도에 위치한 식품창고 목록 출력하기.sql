-- 코드를 입력하세요
SELECT WAREHOUSE_ID,WAREHOUSE_NAME,ADDRESS,nvl(FREEZER_YN, 'N') as FREEZER_YN
from food_warehouse
where WAREHOUSE_NAME like '%경기%'
order by WAREHOUSE_ID 
;