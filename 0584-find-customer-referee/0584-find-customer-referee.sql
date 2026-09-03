# Write your MySQL query statement below
select name from customer where referee_id != "2" or referee_id is null;
#referee_id = null doesn't work here , so we are using isNull(referee_id)