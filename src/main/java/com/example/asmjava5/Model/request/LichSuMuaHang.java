package com.example.asmjava5.Model.request;

import com.example.asmjava5.Model.DTO.ItemHoaDonChiTietDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LichSuMuaHang {
    String maHDBan;
    LocalDate ngayBan;
    Double tongTien;

}
