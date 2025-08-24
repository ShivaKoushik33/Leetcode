# Write your MySQL query statement below
select e1.reports_to as employee_id,e2.name as name,count(e1.reports_to) as reports_count,
round(avg(e1.age)) as average_age
from employees as e1
cross join employees as e2
on e1.reports_to=e2.employee_id
where e1.reports_to is not null
 group by e1.reports_to 
 order by employee_id asc