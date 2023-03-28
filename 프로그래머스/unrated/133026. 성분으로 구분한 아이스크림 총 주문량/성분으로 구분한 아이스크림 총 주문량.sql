-- 코드를 입력하세요
SELECT ingredient_type, sum(total_order) as "TOTAL_ORDER"
from FIRST_HALF f, ICECREAM_INFO i
where f.FLAVOR = i.FLAVOR
group by ingredient_type