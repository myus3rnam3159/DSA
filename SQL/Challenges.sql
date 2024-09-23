select h.hacker_id, h.name, count(challenge_id)
from Hackers h
inner join Challenges c
on h.hacker_id = c.hacker_id
where h.hacker_id not in (
    select t1.hacker_id
    from(
        select hacker_id, count(challenge_id) as cnt
        from Challenges
        group by hacker_id
    ) as t1
    inner join
    (
        select hacker_id, count(challenge_id) as cnt
        from Challenges
        group by hacker_id
    ) as t2
    on t1.hacker_id != t2.hacker_id
    and t1.cnt = t2.cnt and t1.cnt != (select count(challenge_id) from Challenges group by hacker_id order by count(challenge_id) desc limit 1)
)
group by h.hacker_id, h.name
order by count(challenge_id) desc, h.hacker_id