# Write your MySQL query statement below
select s2.product_id as product_id,s2.year as first_year,s2.quantity as quantity,s2.price as price from (
select product_id,min(year) as year from Sales group by product_id
) s1 left join sales s2 on s1.product_id=s2.product_id and s1.year=s2.year