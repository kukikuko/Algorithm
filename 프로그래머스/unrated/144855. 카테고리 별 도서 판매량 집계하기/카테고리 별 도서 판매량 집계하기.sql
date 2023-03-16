-- 코드를 입력하세요
SELECT b.category, sum(sales) "total_sales"
from book b, book_sales bs
where b.book_id = bs.book_id
and to_char(bs.SALES_DATE, 'mm') = '01' 
group by b.category
order by category