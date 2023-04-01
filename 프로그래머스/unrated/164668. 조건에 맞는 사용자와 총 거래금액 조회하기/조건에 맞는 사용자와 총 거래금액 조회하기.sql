-- 코드를 입력하세요
SELECT u.user_id, u.nickname, sum(b.price) as "TOTAL_SALES"
from USED_GOODS_BOARD b, USED_GOODS_USER u
where b.writer_id = u.user_id
and status = 'DONE'
group by u.user_id, u.nickname
having sum(b.price) >= 700000
order by TOTAL_SALES 