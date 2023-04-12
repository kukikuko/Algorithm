-- 코드를 입력하세요
select user_id, nickname, CITY||' '||STREET_ADDRESS1||' '||STREET_ADDRESS2 as "전체주소", 
REGEXP_REPLACE(TLNO, '(.{3})(.+)(.{4})', '\1-\2-\3') as "전화번호" 
from USED_GOODS_USER 
where user_id in (
SELECT writer_id
from USED_GOODS_BOARD
group by writer_id
having count(writer_id) >= 3)
order by USER_ID desc