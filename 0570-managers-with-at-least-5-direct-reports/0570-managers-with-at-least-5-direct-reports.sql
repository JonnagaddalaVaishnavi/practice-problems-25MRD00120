# Write your MySQL query statement below
select e.name as name from employee e inner join employee b on e.id = b.managerId group by e.name,e.id having count(b.managerId) >= 5;