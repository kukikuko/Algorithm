-- 코드를 입력하세요
select category, count(category) 
from (
SELECT substr(product_code, 0, 2) as category
from product
) 
group by category
order by category;