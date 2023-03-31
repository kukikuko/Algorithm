-- 코드를 입력하세요
select food_type, rest_id, rest_name, favorites
from (
SELECT food_type, REST_ID, REST_NAME, FAVORITES,
row_number() over(partition by FOOD_TYPE order by FAVORITES desc) as rn
from REST_INFO
)
where rn = 1
order by FOOD_TYPE desc