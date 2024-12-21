# Write your MySQL query statement below

select e2.name as name
from employee e1
join
employee e2
on e1.managerid = e2.id
group by e1.managerid
having count(*) >= 5