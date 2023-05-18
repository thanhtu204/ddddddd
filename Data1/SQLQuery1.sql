create database QlThuVien
ON Primary
(Name=QlThuVien_Data1,
FileName='D:\Data1\QlThuVien_Data1.MDF',
Size=2MB, Maxsize=5MB, FileGrowth=1MB)
LOG ON
(Name=QlThuVien_log,
FileName='D:\Data1\QlThuVien_log.LDF',
Size=2MB, Maxsize=5MB, FileGrowth=1MB)

create table BanDoc(MaBD char(10), TenBD nvarchar(100), DiaChi nvarchar(100), SoDT char(11), QueQuan nvarchar(50)
Constraint Pri_BanDoc primary key (MaBD))

create table Sach(MaSach char(10), TenSach nvarchar(100), TheLoai nvarchar(50), TacGia nvarchar(50), NamXB int,NhaXB nvarchar(100),
Constraint Pri_Sach primary key (MaSach))

create table MuonSach(STT int identity(1,1), MaBD char(10), MaSach char(10), NgayMuon smalldatetime, NgayHenTra smalldatetime,TraSach int,
constraint Pri_MuonSach primary key (MaBD,MaSach))

alter table MuonSach
add constraint For_MuonSach_BanDoc foreign key (MaBd) references BanDoc(MaBD),
constraint For_MuonSach_Sach foreign key (MaSach) references Sach(MaSach)

alter table BanDoc
add constraint C1 check (len(SoDT) between 6and 11)

alter table BanDoc
add constraint C2 unique (SoDT)

alter table BanDoc
add constraint C3 check (MaBD like N'BD_%_%_%')

alter table MuonSach
add constraint C4 check (NgayMuon<NgayHenTra)

alter table MuonSach
add constraint C5 check (DateDiff(dd,NgayMuon,NgayHenTra)<=5)

insert into BanDoc values('BD100',N'Nguyễn Trường An',N'23 Nguyễn Trãi','0978372612',N'TP.HCM')
insert into BanDoc values('BD101',N'Lê Văn Hiếu',N'441 Lê Lai','02837461210',N'Đà Nẵng')
insert into BanDoc values('BD102',N'Trần Thị Thanh',N'21 Bình Giã','0372819304',N'Đà Nẵng')
insert into BanDoc values('BD103',N'Nguyễn Minh Thùy',N'101 CMT8','0739271039',N'TP.HCM')
insert into BanDoc values('BD104',N'Lý Thùy Trang',N'9 Lê Văn Sĩ','02853671901',N'Đà Nẵng')
insert into BanDoc values('BD105',N'Nguyễn Nam',N'10 Nguyễn Thông','0394738291',N'TP.HCM')
insert into BanDoc values('BD106',N'Tô Hồng Vy',N'03 Thống Nhất','0729381732',N'Huế')
insert into BanDoc values('BD107',N'Bùi Vinh Tiến',N'123 Tự Lập','0903728471',N'Hà Nội')
insert into BanDoc values('BD108',N'Tạ Quang Bình',N'27 Lê Lợi','0946283912',N'TP.HCM')
insert into BanDoc values('BD109',N'Nguyễn Mai Kiên',N'01 Nguyễn Bình','0723910373',N'Đà Lạt')
insert into BanDoc values('BD110',N'Nguyễn Thị Hoa',N'14 CMT8','02736182012',N'Hà Nội')

insert into Sach values('KH111',N'Lược sử thời gian',N'Khoa học',N'Stephen Hawking',2020,N'NXB Trẻ')
insert into Sach values('KH112',N'Thông Điệp Của Nước',N'Khoa học',N'Masaru Emoto',2019,N'NXB Khoa học')
insert into Sach values('TT001',N'Tắt Đèn',N'Tiểu thuyết',N'Ngô Tất Tố',2022,N'NXBVăn học')
insert into Sach values('TT002',N'Những Người Hàng Xóm',N'Tiểu thuyết',N'Nguyễn Nhật Ánh',2019,N'NXB Trẻ')
insert into Sach values('TT003',N'Rừng Nauy',N'Tiểu thuyết',N'Nhã Nam',2020,N'NXB Hội nhà văn')
insert into Sach values('KH113',N'Cuộc Sống Của Một Nhà Du Hành Vũ Trụ',N'Khoa học',N'Nhiều TG',2021,N'NXB Thanh niên')
insert into Sach values('TN201',N'Gió Lạnh Đầu Mùa',N'Truyện ngắn',N'Thạch Lam',2020,N'NXBVăn học')
insert into Sach values('TN202',N'Truyện Ngắn Nguyễn Minh Châu',N'Truyện ngắn',N'Nguyễn Minh Châu',2022,N'NXB Kim Đồng')

insert into MuonSach values('BD102','KH111','2023-01-10','2023-01-13',1)
insert into MuonSach values('BD101','TN202','2023-01-20','2023-01-24',0)
insert into MuonSach values('BD102','KH113','2023-01-30','2023-02-02',1)
insert into MuonSach values('BD104','KH111','2023-01-20','2023-01-24',0)
insert into MuonSach values('BD108','TT001','2023-01-20','2023-01-24',0)
insert into MuonSach values('BD105','TT002','2023-03-03','2023-03-06',1)
insert into MuonSach values('BD110','KH112','2023-03-10','2023-03-14',1)
insert into MuonSach values('BD100','KH111','2023-03-22','2023-03-25',1)
insert into MuonSach values('BD100','TN201','2023-03-22','2023-03-25',1)
insert into MuonSach values('BD103','TN202','2023-03-27','2023-03-30',0)
insert into MuonSach values('BD103','TT001','2023-03-27','2023-03-30',0)

--1.Ban doc co ma BD102 da muon nhung quyen sach nao
select S.MaSach, TenSach from BanDoc BD, MuonSach MS, Sach S
where BD.MaBD=MS.MaBD and MS.MaSach=S.MaSach and BD.MaBD like 'BD102'
--2.
select count(*) from MuonSach where MaSach like 'TT%' and month(NgayMuon)=01
--3.
select count(BD.MaBD) from BanDoc BD, MuonSach MS where QueQuan like N'TP.HCM'
--6.
select BD.MaBD, TenBD, COUNT(BD.MaBD) from BanDoc BD, MuonSach MS
where BD.MaBD=MS.MaBD and QueQuan like N'Đà Nẵng' group by BD.MaBD, TenBD
having Count(BD.MaBD)>=All(select count(BD.MaBD) from BanDoc BD, MuonSach MS
where BD.MaBD=MS.MaBD and QueQuan like N'Đà Nẵng' group by BD.MaBD)
--7.
select TheLoai, count(MaSach) from Sach group by TheLoai
--9.
select * from BanDoc where MaBD not in (Select MaBD from MuonSach)
--10.
select BD.MaBD, TenBD, count(MaSach) from BanDoc BD, MuonSach MS where BD.MaBD=MS.MaBD
group by BD.MaBD,TenBD having count(MaSach)>1
--11.
select BD.MaBD, TenBD, count(MaSach) from BanDoc BD, MuonSach MS where BD.MaBD=MS.MaBD 
and MaSach like'KH%' and month(NgayMuon)=1
group by BD.MaBD, TenBD
having count (MaSach)>1
--12.
select count(MaSach) from Sach