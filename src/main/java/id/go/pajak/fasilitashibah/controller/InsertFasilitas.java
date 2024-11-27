package id.go.pajak.fasilitashibah.controller;

import id.go.pajak.fasilitashibah.soa.SoaService;
import id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa.ReqInsertFasilitasType;
import id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa.ResGetBpeColl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class InsertFasilitas {

    @Autowired
    SoaService soaService;

    @GetMapping("/")
    public Object coba(){

        ReqInsertFasilitasType reqInsertFasilitasType = new ReqInsertFasilitasType();
        reqInsertFasilitasType.setNpwp("004420956012000");
        reqInsertFasilitasType.setIdRefJenisSurat("243");
        reqInsertFasilitasType.setIdRefJenisPemberitahuan("");
        reqInsertFasilitasType.setKeterangan("");
        reqInsertFasilitasType.setKeteranganTambahan("");
        reqInsertFasilitasType.setMasaPjkAwal("01");
        reqInsertFasilitasType.setMasaPjkAkhir("12");
        reqInsertFasilitasType.setTahunPajak(String.valueOf(LocalDate.now().getYear()));
        reqInsertFasilitasType.setNoSuratWp("");
        reqInsertFasilitasType.setData("");
        return soaService.getBpe(reqInsertFasilitasType);

//        return ResGetBpeColl;
    }
}
