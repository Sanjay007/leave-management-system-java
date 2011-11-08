create database nhansu;

use nhansu;

create table nhanvien(
	MaNV nvarchar(8),
	TenNV nvarchar(25),
	Tuoi int
);

create table quequan(
	MaNV nvarchar(8),
	DiaChi nvarchar(30)
);

insert into nhanvien values ('NV1','Tran cuong 1',18);

insert into nhanvien values ('NV2','Tran cuong 2',18);

insert into nhanvien values ('NV3','Tran cuong 3',19);

insert into quequan values ('NV1','Vinh Phuc');
insert into quequan values ('NV2','Ha Noi');
insert into quequan values ('NV3','Phu Tho');

select * from nhanvien;
select * from quequan;