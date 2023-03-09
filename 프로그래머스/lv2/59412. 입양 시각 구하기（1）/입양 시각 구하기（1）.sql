-- 코드를 입력하세요
select hour, count(*) as count
from (

SELECT TO_NUMBER(to_char(DATETIME, 'hH24')) as hour
from animal_outs
    
    )
group by hour
having hour between 09 and 19

order by hour
;