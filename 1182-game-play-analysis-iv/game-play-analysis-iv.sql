# Write your MySQL query statement below


select round(count(distinct a2.player_id)/count(distinct a1.player_id),2) as fraction from (
select player_id,min(event_date) as event_date from Activity 
group by player_id
) a1 left join Activity a2 on a1.player_id=a2.player_id and datediff(a1.event_date,a2.event_date)=-1