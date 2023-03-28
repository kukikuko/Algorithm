-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, to_char(DATE_OF_BIRTH, 'yyyy-mm-dd')
from member_profile
where tlno is not null 
and gender = 'W'
and to_char(date_of_birth, 'mm') = '03'
order by member_id 