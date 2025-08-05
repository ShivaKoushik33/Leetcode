# Write your MySQL query statement below
select s.user_id ,
coalesce(round(avg(case when action="confirmed" then 1 else 0 end),2),0 )
as confirmation_rate 
from signups as s left join  confirmations
using (user_id)
group by s.user_id