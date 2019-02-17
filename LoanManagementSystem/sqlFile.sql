create table Customer(
Customer_Id int(10) primary key,
Customer_Type varchar(30),
Occupation varchar(30),
Customer_Name varchar(30),
gender varchar(30),
age int(2),
address varchar(30)
)

show tables;
insert into Customer
values(11251557,'Family','Bussiness','Anurag Pathak','male',23,'delhi')
select *from Customer

select * from Customer where Customer_Name like '%Anu%' OR Customer_Id like '0'

update Customer set Customer_Type='gandu',Occupation='fucking engineer',Customer_Name='anurag',gender='female', age=89,address='randikhana' where Customer_Id=151

