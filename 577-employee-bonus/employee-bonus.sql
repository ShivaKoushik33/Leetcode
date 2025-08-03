# Write your MySQL query statement below
select name,bonus from Employee as e left join Bonus on e.empId=Bonus.empId where
Bonus<1000 or Bonus is null