# Write your MySQL query statement below
select p.product_name, sum(o.unit) as unit
from products p
left join orders o
on p.product_id = o.product_id
where year(order_date) = 2020 and month (order_date) = '02'
group by o.product_id
having unit>=100;