-- 코드를 입력하세요
SELECT c.car_id
from CAR_RENTAL_COMPANY_CAR c, CAR_RENTAL_COMPANY_RENTAL_HISTORY h
where c.CAR_ID = h.CAR_ID
and c.car_type = '세단'
and to_char(h.start_date, 'mm') = '10'
group by c.car_id
order by c.CAR_ID desc