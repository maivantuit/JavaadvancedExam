
create database ManageMachine
go
use ManageMachine
go

create table May(
	MaMay varchar(10) primary key,
	ViTri varchar(10),
	TrangThai varchar(20)
)
insert into May(MaMay,ViTri,TrangThai) values('M01','1','Online')
create table KhachHang(
	MaKH varchar(10) primary key,	
	TenKH nvarchar(40),
	DiaChi nvarchar(40),
	SoDienThoai varchar(20),
	DiaChiEmail varchar(30)
)
insert into KhachHang values('KH01',N'Mai Văn Tú',N'Quảng Trị','0977775487','maivantuit@gmail.com')
create table DichVu(
	MaDV varchar(10) primary key,
	TenDV nvarchar(30),
	DonViTinh nvarchar(30),
	DonGia decimal(18,0)
)
insert into DichVu(MaDV,TenDV,DonViTinh,DonGia) values('DV01',N'trái cây',N'quả','20000')
create table SuDungDichVu(
	MaKH varchar(10) foreign key references KhachHang(MaKH),
	MaDV varchar(10) foreign key references DichVu(MaDV),
	NgaySuDung date,
	GioSuDung varchar(20),
	SoLuong int,
	primary key(MaKh,MaDV,NgaySuDung,GioSuDung)
)
insert into SuDungDichVu(MaKH,MaDV,NgaySuDung,GioSuDung,SoLuong) values('KH01','DV01','03/03/2018','12h:30p','5')
create table SuDungMay(
	MaKH varchar(10) foreign key references KhachHang(MaKH),
	MaMay varchar(10) foreign key references May(MaMay),
	NgayBatDauSuDung date,
	GioBatDauSuDung varchar(20),
	ThoiGianSuDung varchar(20),
	primary key(MaKH,MaMay,NgayBatDauSuDung,GioBatDauSuDung)
)
insert into SuDungMay(MaKH,MaMay,NgayBatDauSuDung,GioBatDauSuDung,ThoiGianSuDung) values('KH01','M01','03/03/2019','16h30p','18h30')
create table NguoiDung(
	id varchar(30) primary key,
	password nvarchar(30)
)
insert into NguoiDung(id,password) values('cop','123')
create table LoaiNhanVien(
	MaLoaiNV varchar(10) primary key,
	TenLoaiNhanVien nvarchar(30)
)
insert into LoaiNhanVien(MaLoaiNV,TenLoaiNhanVien) values('LNV01',N'NV Trông Quán')
insert into LoaiNhanVien(MaLoaiNV,TenLoaiNhanVien) values('LNV02',N'NV Vệ Sinh')

create table NhanVien(
	MaNV varchar(10) primary key,
	MaLoaiNV varchar(10) foreign key references LoaiNhanVien(MaLoaiNV),
	TenNV nvarchar(20),
	DiaChi nvarchar(50),
	SoDienThoai varchar(20)
)
insert into NhanVien(MaNV,MaLoaiNV,TenNV,DiaChi,SoDienThoai) values('NV01','LNV01',N'Mai Văn Tú 2',N'Quảng Trị 2','0928382182')
insert into NhanVien(MaNV,MaLoaiNV,TenNV,DiaChi,SoDienThoai) values('NV02','LNV01',N'Mai Phước Quốc',N'Quảng Trị 2','0928382182')
insert into NhanVien(MaNV,MaLoaiNV,TenNV,DiaChi,SoDienThoai) values('NV03','LNV02',N'Anh Quốc',N'Quảng Trị 2','0928382182')


-----
select MaNV, TenNV,DiaChi,SoDienThoai,TenLoaiNhanVien
from NhanVien
join LoaiNhanVien on NhanVien.MaLoaiNV = LoaiNhanVien.MaLoaiNV

select MaNV,LoaiNhanVien.MaLoaiNV, TenNV,DiaChi,SoDienThoai,TenLoaiNhanVien from NhanVien join LoaiNhanVien on NhanVien.MaLoaiNV = LoaiNhanVien.MaLoaiNV
select MaNV,TenNV,DiaChi,SoDienThoai
from NhanVien
where 
MaLoaiNV = 'LNV01'

SELECT id FROM NguoiDung WHERE id = 'cop' AND password = '123'
select MaKH,TenKH from KhachHang
select MaDV,TenDV from DichVu
select KhachHang.MaKH,TenKH,May.MaMay,ViTri,TrangThai,NgayBatDauSuDung,GioBatDauSuDung,
ThoiGianSuDung,DichVu.MaDV,NgaySuDung,GioSuDung,SoLuong,DichVu.DonGia*SoLuong as TongTien
from KhachHang
join SuDungMay on KhachHang.MaKH = SuDungMay.MaKH
join SuDungDichVu on KhachHang.MaKH = SuDungDichVu.MaKH
join DichVu on DichVu.MaDV = SuDungDichVu.MaDV
join May on May.MaMay = SuDungMay.MaMay