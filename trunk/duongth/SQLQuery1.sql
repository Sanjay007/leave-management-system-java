create database duongth
go
use duongth

create table admin(
	id varchar(10) not null,
	password varchar(10) not null
)
go


create table [user](
	id varchar(10) primary key not null,
	password varchar(10) not null
)
go

create table nhanvien(
	name nvarchar(25),
	id varchar(10) constraint FK_nhanvien foreign key references [user](id),
	tel varchar(11),
	chucvu nvarchar(15)
)
go

insert into admin values ('admin','123')

insert into [user] values ('cuongtv','123')
insert into [user] values ('duongth','123')
insert into [user] values ('tuanut','123')
insert into [user] values ('hanhdth','123')
insert into [user] values ('duongnd','123')

insert into nhanvien values (N'trương hữu dương','duongth','0973111009','nhan vien')

delete from nhanvien where id='duongth'
select * from [user]
select * from admin
select * from nhanvien

create proc admin_SelectByAll
	@a varchar(10),
	@b varchar(10)
as
	select * from admin
	where admin.id = @a and admin.password =@b
go

execute admin_SelectByAll 'admin','123'

