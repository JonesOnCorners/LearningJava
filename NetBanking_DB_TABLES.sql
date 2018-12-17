//DDL of the people table which is the master repo of all the users of the netbanking whether they be an employee or a customer.
create table people
(
id number,
name varchar2(50),
surname varchar2(50),
age number,
address varchar2(100),
mobile_number number,
type varchar2(1),
user_add varchar2(50),
date_add date,
user_change varchar2(50),
date_change date,
CONSTRAINT PEOPLE_PK PRIMARY KEY(ID),
CONSTRAINT PEOPLE_CHECK_AGE CHECK(age>=18 and age<=65)
);
