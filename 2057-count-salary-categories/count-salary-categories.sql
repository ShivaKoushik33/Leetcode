# Write your MySQL query statement below
-- select 
-- t.category,count(t.category) as accounts_count from(
        -- select 
        --                     case 
        --                         when income>50000 then "High Salary" 
        --                         when (income>=20000 and income<=50000) then "Average Salary" 
        --                         else "Low Salary" 
        --                         end as category ,
        --         count(*) as accounts_count
        -- from Accounts group by category
-- ) as t group by t.category


-- select 
--     sum(case  when income>50000 then 1 else 0 end  ) as  "High Salary",
--     sum(case when (income>=20000 and income<=50000) then 1 else 0 end ) as "Average Salary",
--     sum(case when income <20000 then 1 else 0 end )as "Low Salary" 
-- from accounts


select "High Salary" as category,sum(case  when income>50000 then 1 else 0 end  ) as accounts_count from Accounts
union

select "Average Salary" as category,sum(case when (income>=20000 and income<=50000) then 1 else 0 end ) as accounts_count from Accounts

union
select "Low Salary" as category,sum(case when income <20000 then 1 else 0 end ) as accounts_count from Accounts
