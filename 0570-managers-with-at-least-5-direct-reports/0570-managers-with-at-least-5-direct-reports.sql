# Write your MySQL query statement below
select f.name from employee f where f.id in (select m.managerId from employee m group by m.managerId having count(m.managerId) >= 5);