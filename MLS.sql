create database MLS

go

use MLS

go

create table Employee(
	EmId int primary key,
	EmNameLogin nvarchar(25),
	EmPassLogin	nvarchar(8),
	EmName nvarchar(25),
	EmAge int,
	EmLevel nvarchar(25),
	EmEmail nvarchar(25),
	EmPhone nvarchar(14),
	EmJoinDay datetime,
	EmDayOfLeave int
);

go

create table Level(
	LvName nvarchar(25)foreign key references Employee(EmName),
	LvLevel int primary key,
	LvComment nvarchar(25),
	LvPosition nvarchar(15)
);

go

create table Reply(
	ReId int,
	MrId int,
	EmId int,
	ReStatus int,
	ReDayReply datetime
);

go

create table SystemMessenger(
	SmId int primary key,
	MtId int,
	EmId int,
	SmTitle nvarchar(25)
	SmContent nvarchar(25)
	SmDay datetime
);

go

create table MessengerType(
	MtId int primary key,
	MtName nvarchar(25)
);

go

create table MessengerRequest(
	MrId int primary key,
	EmId int,
	MrStatus int,	
	MrDayStart datetime,
	MrDayEnd datetime,
	MrAddress nvarchar(60),
	MrResoin nvarchar(60),
	MrDayRequest datetime
);
