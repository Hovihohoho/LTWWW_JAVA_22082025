-- Thêm dữ liệu mẫu cho NHACUNGCAP
INSERT INTO NHACUNGCAP (MANCC, TENNHACC, DIACHI, SODIENTHOAI) VALUES
                                                                  ('NCC001', N'Apple Store Vietnam', N'123 Nguyễn Huệ, Q1, TP.HCM', '0901234567'),
                                                                  ('NCC002', N'Samsung Electronics', N'456 Lê Lợi, Q1, TP.HCM', '0902345678'),
                                                                  ('NCC003', N'Xiaomi Vietnam', N'789 Trần Hưng Đạo, Q5, TP.HCM', '0903456789'),
                                                                  ('NCC004', N'Oppo Mobile', N'321 Võ Văn Tần, Q3, TP.HCM', '0904567890'),
                                                                  ('NCC005', N'Vivo Technology', N'654 Pasteur, Q1, TP.HCM', '0905678901');

-- Thêm dữ liệu mẫu cho DIENTHOAI
INSERT INTO DIENTHOAI (MADT, TENDT, NAMSANXUAT, CAUHINH, MANCC, HINHANH) VALUES
                                                                             ('DT001', N'iPhone 15 Pro Max', 2023, N'A17 Pro chip, 256GB, Camera 48MP, 6.7 inch', 'NCC001', 'iphone15promax.jpg'),
                                                                             ('DT002', N'iPhone 14', 2022, N'A15 Bionic chip, 128GB, Camera 12MP, 6.1 inch', 'NCC001', 'iphone14.jpg'),
                                                                             ('DT003', N'Samsung Galaxy S24 Ultra', 2024, N'Snapdragon 8 Gen 3, 512GB, Camera 200MP, 6.8 inch', 'NCC002', 'galaxys24ultra.jpg'),
                                                                             ('DT004', N'Samsung Galaxy A55', 2024, N'Exynos 1480, 128GB, Camera 50MP, 6.6 inch', 'NCC002', 'galaxya55.jpg'),
                                                                             ('DT005', N'Xiaomi 14 Ultra', 2024, N'Snapdragon 8 Gen 3, 512GB, Camera 50MP Leica, 6.73 inch', 'NCC003', 'xiaomi14ultra.jpg'),
                                                                             ('DT006', N'Xiaomi Redmi Note 13', 2023, N'Snapdragon 685, 128GB, Camera 108MP, 6.67 inch', 'NCC003', 'redminote13.jpg'),
                                                                             ('DT007', N'Oppo Find X7 Pro', 2024, N'Snapdragon 8 Gen 3, 256GB, Camera 50MP Hasselblad, 6.78 inch', 'NCC004', 'oppofindx7pro.jpg'),
                                                                             ('DT008', N'Oppo A78', 2023, N'Snapdragon 680, 128GB, Camera 50MP, 6.43 inch', 'NCC004', 'oppoa78.jpg'),
                                                                             ('DT009', N'Vivo V30 Pro', 2024, N'MediaTek Dimensity 8200, 256GB, Camera 50MP, 6.78 inch', 'NCC005', 'vivov30pro.jpg'),
                                                                             ('DT010', N'Vivo Y36', 2023, N'Snapdragon 680, 128GB, Camera 50MP, 6.64 inch', 'NCC005', 'vivoy36.jpg');