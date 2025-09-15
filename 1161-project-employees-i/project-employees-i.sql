# Write your MySQL query statement below
select project_id,round(avg(experience_years),2) as average_years
from Project as P left join Employee as E 
using (employee_id)
group by p.project_id
