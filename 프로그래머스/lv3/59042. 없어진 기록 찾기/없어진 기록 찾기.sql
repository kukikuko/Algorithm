-- 코드를 입력하세요
SELECT b.animal_id, b.name
from animal_ins a, ANIMAL_OUTS b
where a.ANIMAL_ID(+) = b.ANIMAL_ID
and a.animal_id is null
order by b.ANIMAL_ID