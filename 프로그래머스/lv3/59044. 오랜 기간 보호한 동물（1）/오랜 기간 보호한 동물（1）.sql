-- 코드를 입력하세요
select *
from (
SELECT ai.name, ai.datetime
from animal_ins ai, animal_outs ao
where ai.animal_id = ao.animal_id(+)
and ao.datetime is null
order by datetime
    )
where rownum <= 3