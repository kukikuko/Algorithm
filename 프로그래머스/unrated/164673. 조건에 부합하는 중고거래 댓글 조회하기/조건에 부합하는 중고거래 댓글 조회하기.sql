-- 코드를 입력하세요
SELECT u.title, u.BOARD_ID, g.REPLY_ID, g.WRITER_ID, g.CONTENTS, 
to_char(g.CREATED_DATE, 'yyyy-mm-dd') as "CREATED_DATE"
from USED_GOODS_BOARD u, USED_GOODS_REPLY g
where u.BOARD_ID = g.BOARD_ID
and to_char(u.CREATED_DATE, 'yyyymm') = '202210'
order by g.CREATED_DATE, u.title