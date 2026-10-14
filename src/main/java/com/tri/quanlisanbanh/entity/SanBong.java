package com.tri.quanlisanbanh.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "SanBong")
public class SanBong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten_san", nullable = false)
    private String tenSan;

    @Column(name = "loai_san")
    private String loaiSan; // Ví dụ: Sân 5, Sân 7, Sân 11

    @Column(name = "gia_thue")
    private Double giaThue;

    @Column(name = "trang_thai")
    private String trangThai; // Ví dụ: Trống, Đã đặt, Bảo trì

    public SanBong() {}

    public SanBong(String tenSan, String loaiSan, Double giaThue, String trangThai) {
        this.tenSan = tenSan;
        this.loaiSan = loaiSan;
        this.giaThue = giaThue;
        this.trangThai = trangThai;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTenSan() { return tenSan; }
    public void setTenSan(String tenSan) { this.tenSan = tenSan; }

    public String getLoaiSan() { return loaiSan; }
    public void setLoaiSan(String loaiSan) { this.loaiSan = loaiSan; }

    public Double getGiaThue() { return giaThue; }
    public void setGiaThue(Double giaThue) { this.giaThue = giaThue; }

    public String getTrangThai() { return trangThai; }
    public void setTrangThai(String trangThai) { this.trangThai = trangThai; }
}
