-- 코드를 입력하세요
SELECT BOARD_ID,	WRITER_ID,	TITLE,	PRICE,
decode(status, 'SALE', '판매중', 'DONE', '거래완료', '예약중') as "STATUS"
from USED_GOODS_BOARD
where to_char(CREATED_DATE, 'yyyy-mm-dd') = '2022-10-05'
order by BOARD_ID desc
