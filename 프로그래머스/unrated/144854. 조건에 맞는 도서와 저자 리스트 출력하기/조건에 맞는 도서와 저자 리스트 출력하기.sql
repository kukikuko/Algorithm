-- 코드를 입력하세요
SELECT BOOK_ID, AUTHOR_NAME, to_char(PUBLISHED_DATE, 'yyyy-mm-dd') as "PUBLISHED_DATE"
from book b, author a
where b.AUTHOR_ID = a.AUTHOR_ID
and category = '경제'
order by PUBLISHED_DATE