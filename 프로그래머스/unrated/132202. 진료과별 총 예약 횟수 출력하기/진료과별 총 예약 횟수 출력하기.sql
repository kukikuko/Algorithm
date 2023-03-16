SELECT MCDP_CD AS 진료과코드, count(*)
from appointment
where to_char(APNT_YMD, 'mm') = '05'
GROUP BY MCDP_CD
order by count(*), MCDP_CD