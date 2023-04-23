-- 코드를 입력하세요
SELECT ai.animal_id, ai.animal_type, ai.name
from ANIMAL_INS ai, ANIMAL_OUTS ao
where ai.ANIMAL_ID = ao.ANIMAL_ID
and ai.sex_upon_intake not like 'Spayed%' 
and ai.sex_upon_intake not like 'Neutered%'
and (ao.SEX_UPON_OUTCOME like 'Spayed%' 
or ao.SEX_UPON_OUTCOME like 'Neutered%')
order by ai.animal_id
