package com.rpm.web.contents;

import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Component
@Entity
@Table(name = "CAR")
@Setter(AccessLevel.PROTECTED)
@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
@Builder
public class Cars implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull @Column(name = "CARCD", length = 12) private String carcd;
    @NotNull @Column(name = "OPTIONCD", length = 500) private String optioncd;
    @NotNull @Column(name = "CATEGORYCD", length = 3) private String categorycd;
    @NotNull @Column(name = "CENTER_CODE", length = 3) private String centerCode;
    @NotNull @Column(name = "MIDDLE_IMG", length = 100) private String middleImg;
    @NotNull @Column(name = "ELAN_PATH", length = 100) private String elanPath;
    @NotNull @Column(name = "EXTERIOR_COLORDCD", length = 10) private String exteriorColordcd;
    @NotNull @Column(name = "CENTER_REGION", length = 10) private String centerRegion;
    @NotNull @Column(name = "ECC_REG_DTM", length = 14) private String eccRegDtm;
    @NotNull @Column(name = "BEGIN_YEAR", length = 4) private String beginYear;
    @NotNull @Column(name = "MAKECD", length = 3) private String makecd;
    @NotNull @Column(name = "SMALL_IMG", length = 100) private String smallImg;
    @NotNull @Column(name = "MODELNM", length = 45) private String modelnm;
    @NotNull @Column(name = "OPTIONCD_NAME", length = 1500) private String optioncdName;
    @NotNull @Column(name = "CAR_TYPE", length = 3) private String carType;
    @NotNull @Column(name = "PN_MOBILE", length = 16) private String pnMobile;
    @NotNull @Column(name = "USERNM", length = 8) private String usernm;
    @NotNull @Column(name = "MILEAGE", length = 45) private String milage;
    @NotNull @Column(name = "SIMPLE_COMMENT", length = 6) private String simpleComment;
    @NotNull @Column(name = "MODELNM_TEXT", length = 45) private String modelnmText;
    @NotNull @Column(name = "TRANSMISSIONCD", length = 3) private String transmissioncd;
    @NotNull @Column(name = "CAR_NUMBER", length = 9) private String carNumber;
    @NotNull @Column(name = "PRICE", length = 5) private String price;
    @NotNull @Column(name = "FUEL_TYPED_NAME", length = 9) private String fuleTypedName;
    @NotNull @Column(name = "CAR_URL", length = 100) private String carUrl;
    @NotNull @Column(name = "FULE_TYPED", length = 3) private String fuelTyped;
    @NotNull @Column(name = "CENTER_REGION_CODE", length = 10) private String centerRegionCode;
    @NotNull @Column(name = "TRUCK_NAME", length = 100) private String truckName;
    @NotNull @Column(name = "CATEGORYNM", length = 10) private String categorynm;
    @NotNull @Column(name = "EXTERIOR_COLORNM", length = 10) private String exteriorColornm;
    @NotNull @Column(name = "HOT_MARKCD", length = 15) private String hotMarkcd;
    @NotNull @Column(name = "TRANSMISSIONCD_NAME", length = 10) private String transmissioncdName;
    @NotNull @Column(name = "PASS_CNT", length = 1) private String passCnt;
    @NotNull @Column(name = "MODELCD", length = 3) private String modelcd;
    @NotNull @Column(name = "REC_COMMENT_CD", length = 3) private String recCommentCd;
    @NotNull @Column(name = "MAKENM", length = 20) private String makenm;
    @NotNull @Column(name = "PN", length = 16) private String pn;
    @NotNull @Column(name = "MFR_DATE", length = 6) private String mfrDate;
    @NotNull @Column(name = "MODEL_GRP_CD", length = 3) private String modelGrpCd;
    @NotNull @Column(name = "CENTER_NAME", length = 20) private String centerName;
    @NotNull @Column(name = "MODEL_GRP_NM", length = 10) private String modelGrpNm;

    @Builder
    private Cars(
            String carcd, String optioncd, String categorycd, String centerCode, String middleImg, String elanPath,
            String exteriorColordcd, String centerRegion, String eccRegDtm, String beginYear, String makecd,
            String smallImg, String modelnm, String optioncdName, String carType, String pnMobile, String usernm,
            String milage, String simpleComment, String modelnmText, String transmissioncd, String carNumber,
            String price, String fuleTypedName, String carUrl, String fuelTyped, String centerRegionCode,
            String truckName, String categorynm, String exteriorColornm, String hotMarkcd, String transmissioncdName,
            String passCnt, String modelcd, String recCommentCd, String makenm, String pn, String mfrDate,
            String modelGrpCd, String centerName, String modelGrpNm
    ) {
        Assert.hasText(carcd, "carcd must not be empty");
        Assert.hasText(optioncd, "optioncd must not be empty");
        Assert.hasText(categorycd, "categorycd must not be empty");
        Assert.hasText(centerCode, "centerCode must not be empty");
        Assert.hasText(middleImg, "middleImg must not be empty");
        Assert.hasText(elanPath, "elanPath must not be empty");
        Assert.hasText(exteriorColordcd, "exteriorColordcd must not be empty");
        Assert.hasText(centerRegion, "centerRegion must not be empty");
        Assert.hasText(eccRegDtm, "eccRegDtm must not be empty");
        Assert.hasText(beginYear, "beginYear must not be empty");
        Assert.hasText(makecd, "makecd must not be empty");
        Assert.hasText(smallImg, "smallImg must not be empty");
        Assert.hasText(modelnm, "modelnm must not be empty");
        Assert.hasText(optioncdName, "optioncdName must not be empty");
        Assert.hasText(carType, "carType must not be empty");
        Assert.hasText(pnMobile, "pnMobile must not be empty");
        Assert.hasText(usernm, "usernm must not be empty");
        Assert.hasText(milage, "milage must not be empty");
        Assert.hasText(modelnmText, "modelnmText must not be empty");
        Assert.hasText(transmissioncd, "transmissioncd must not be empty");
        Assert.hasText(simpleComment, "simpleComment must not be empty");
        Assert.hasText(price, "price must not be empty");
        Assert.hasText(fuleTypedName, "fuleTypedName must not be empty");
        Assert.hasText(carUrl, "carUrl must not be empty");
        Assert.hasText(fuelTyped, "fuelTyped must not be empty");
        Assert.hasText(centerRegionCode, "centerRegionCode must not be empty");
        Assert.hasText(truckName, "truckName must not be empty");
        Assert.hasText(categorynm, "categorynm must not be empty");
        Assert.hasText(exteriorColornm, "exteriorColornm must not be empty");
        Assert.hasText(hotMarkcd, "hotMarkcd must not be empty");
        Assert.hasText(transmissioncdName, "transmissioncdName must not be empty");
        Assert.hasText(passCnt, "passCnt must not be empty");
        Assert.hasText(modelcd, "modelcd must not be empty");
        Assert.hasText(recCommentCd, "recCommentCd must not be empty");
        Assert.hasText(makenm, "makenm must not be empty");
        Assert.hasText(pn, "pn must not be empty");
        Assert.hasText(mfrDate, "mfrDate must not be empty");
        Assert.hasText(modelGrpCd, "modelGrpCd must not be empty");
        Assert.hasText(centerName, "centerName must not be empty");
        Assert.hasText(modelGrpNm, "modelGrpNm must not be empty");
        Assert.hasText(carNumber, "carNumber must not be empty");

        this.carcd = carcd;
        this.optioncd = optioncd;
        this.categorycd = categorycd;
        this.centerCode = centerCode;
        this.middleImg = middleImg;
        this.elanPath = elanPath;
        this.exteriorColordcd = exteriorColordcd;
        this.centerCode = centerCode;
        this.eccRegDtm = eccRegDtm;
        this.beginYear = beginYear;
        this.makecd = makecd;
        this.smallImg = smallImg;
        this.modelnm = modelnm;
        this.optioncdName = optioncdName;
        this.carType = carType;
        this.pnMobile = pnMobile;
        this.usernm = usernm;
        this.milage = milage;
        this.modelnmText = modelnmText;
        this.transmissioncd = transmissioncd;
        this.simpleComment = simpleComment;
        this.pnMobile = price;
        this.fuleTypedName = fuleTypedName;
        this.carUrl = carUrl;
        this.fuelTyped = fuelTyped;
        this.centerRegionCode = centerRegionCode;
        this.truckName = truckName;
        this.categorynm = categorynm;
        this.exteriorColornm = exteriorColornm;
        this.hotMarkcd = hotMarkcd;
        this.transmissioncdName = transmissioncdName;
        this.passCnt = passCnt;
        this.modelcd = modelcd;
        this.recCommentCd = recCommentCd;
        this.makenm = makenm;
        this.pn = pn;
        this.mfrDate = mfrDate;
        this.modelGrpCd = modelGrpCd;
        this.centerName = centerName;
        this.modelGrpCd = modelGrpCd;
        this.carNumber = carNumber;


    }



}
