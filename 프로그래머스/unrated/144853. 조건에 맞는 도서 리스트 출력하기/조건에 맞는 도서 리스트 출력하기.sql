-- 코드를 입력하세요
SELECT book_id, to_char(PUBLISHED_DATE, 'yyyy-mm-dd') as "PUBLISHED_DATE"
from book
where to_char(PUBLISHED_DATE, 'yyyy') = '2021' and
category = '인문'
order by book_id desc