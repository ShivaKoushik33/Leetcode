# Write your MySQL query statement below
-- select customer_id from( 
-- select customer_id,((count(distinct product_key)/(select count(*) from Product))) as cnt from customer group by customer_id)as derived where cnt=1

select customer_id from
customer group by
customer_id 
having count(distinct product_key)=(select count(*) from product);