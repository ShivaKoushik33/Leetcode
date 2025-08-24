# Write your MySQL query statement below
select customer_id from( 
select customer_id,((count(distinct product_key)/(select count(*) from Product))) as cnt from customer group by customer_id)as derived where cnt=1