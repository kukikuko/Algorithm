-- 코드를 입력하세요
SELECT f.flavor
from FIRST_HALF f, ICECREAM_INFO i
where f.FLAVOR = i.FLAVOR
and ingredient_type = 'fruit_based'
and total_order >= 3000