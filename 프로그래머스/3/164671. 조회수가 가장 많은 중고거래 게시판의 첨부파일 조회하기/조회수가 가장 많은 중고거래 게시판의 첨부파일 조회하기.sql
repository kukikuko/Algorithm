SELECT '/home/grep/src/' || f.board_id || '/' || f.file_id || f.file_name || f.file_ext AS "FILE_PATH"
from used_goods_board b, used_goods_file f
where b.board_id = f.board_id
and b.views = (select max(views) from used_goods_board)
order by f.file_id desc;