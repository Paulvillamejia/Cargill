package cargill_excersise_paul_villalobos.Model;

/**
 *
 * @author Paul Villalobos
 */
public class DateDimension {
   
    String dateKey;
    String year;
    String monthNum;
    String monthFull;
    String monthAbbr;
    String quarterNum;
    String quarterFull;
    String quarterAbbr;
    String yeatAndQuarterNum;
    String quarterAbbrAndYear;
    String monthAbbrAndYear;
    String monthAndYear;
    String monthName;
    String monthNameAbbr;
    String quarterAndYear;
    String quarterAndYearAbbr2;
    String yearAndMonthNum;

    public DateDimension(String dateKey, String year, String monthNum, String monthFull, String monthAbbr, String quarterNum, String quarterFull, String quarterAbbr, String yeatAndQuarterNum, String quarterAbbrAndYear, String monthAbbrAndYear, String monthAndYear, String monthName, String monthNameAbbr, String quarterAndYear, String quarterAndYearAbbr2, String yearAndMonthNum) {
        this.dateKey = dateKey;
        this.year = year;
        this.monthNum = monthNum;
        this.monthFull = monthFull;
        this.monthAbbr = monthAbbr;
        this.quarterNum = quarterNum;
        this.quarterFull = quarterFull;
        this.quarterAbbr = quarterAbbr;
        this.yeatAndQuarterNum = yeatAndQuarterNum;
        this.quarterAbbrAndYear = quarterAbbrAndYear;
        this.monthAbbrAndYear = monthAbbrAndYear;
        this.monthAndYear = monthAndYear;
        this.monthName = monthName;
        this.monthNameAbbr = monthNameAbbr;
        this.quarterAndYear = quarterAndYear;
        this.quarterAndYearAbbr2 = quarterAndYearAbbr2;
        this.yearAndMonthNum = yearAndMonthNum;
    }

    public String getDateKey() {
        return dateKey;
    }

    public String getYear() {
        return year;
    }

    public String getMonthNum() {
        return monthNum;
    }

    public String getMonthFull() {
        return monthFull;
    }

    public String getMonthAbbr() {
        return monthAbbr;
    }

    public String getQuarterNum() {
        return quarterNum;
    }

    public String getQuarterFull() {
        return quarterFull;
    }

    public String getQuarterAbbr() {
        return quarterAbbr;
    }

    public String getYeatAndQuarterNum() {
        return yeatAndQuarterNum;
    }

    public String getQuarterAbbrAndYear() {
        return quarterAbbrAndYear;
    }

    public String getMonthAbbrAndYear() {
        return monthAbbrAndYear;
    }

    public String getMonthAndYear() {
        return monthAndYear;
    }

    public String getMonthName() {
        return monthName;
    }

    public String getMonthNameAbbr() {
        return monthNameAbbr;
    }

    public String getQuarterAndYear() {
        return quarterAndYear;
    }

    public String getQuarterAndYearAbbr2() {
        return quarterAndYearAbbr2;
    }

    public String getYearAndMonthNum() {
        return yearAndMonthNum;
    }

    public void setDateKey(String dateKey) {
        this.dateKey = dateKey;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setMonthNum(String monthNum) {
        this.monthNum = monthNum;
    }

    public void setMonthFull(String monthFull) {
        this.monthFull = monthFull;
    }

    public void setMonthAbbr(String monthAbbr) {
        this.monthAbbr = monthAbbr;
    }

    public void setQuarterNum(String quarterNum) {
        this.quarterNum = quarterNum;
    }

    public void setQuarterFull(String quarterFull) {
        this.quarterFull = quarterFull;
    }

    public void setQuarterAbbr(String quarterAbbr) {
        this.quarterAbbr = quarterAbbr;
    }

    public void setYeatAndQuarterNum(String yeatAndQuarterNum) {
        this.yeatAndQuarterNum = yeatAndQuarterNum;
    }

    public void setQuarterAbbrAndYear(String quarterAbbrAndYear) {
        this.quarterAbbrAndYear = quarterAbbrAndYear;
    }

    public void setMonthAbbrAndYear(String monthAbbrAndYear) {
        this.monthAbbrAndYear = monthAbbrAndYear;
    }

    public void setMonthAndYear(String monthAndYear) {
        this.monthAndYear = monthAndYear;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public void setMonthNameAbbr(String monthNameAbbr) {
        this.monthNameAbbr = monthNameAbbr;
    }

    public void setQuarterAndYear(String quarterAndYear) {
        this.quarterAndYear = quarterAndYear;
    }

    public void setQuarterAndYearAbbr2(String quarterAndYearAbbr2) {
        this.quarterAndYearAbbr2 = quarterAndYearAbbr2;
    }

    public void setYearAndMonthNum(String yearAndMonthNum) {
        this.yearAndMonthNum = yearAndMonthNum;
    }

    @Override
    public String toString() {
        return "DateDimension{" + "dateKey=" + dateKey + ", year=" + year + ", monthNum=" + monthNum +
                ", monthFull=" + monthFull + ", monthAbbr=" + monthAbbr + ", quarterNum=" + quarterNum + 
                ", quarterFull=" + quarterFull + ", quarterAbbr=" + quarterAbbr +
                ", yeatAndQuarterNum=" + yeatAndQuarterNum + ", quarterAbbrAndYear=" + quarterAbbrAndYear +
                ", monthAbbrAndYear=" + monthAbbrAndYear + ", monthAndYear=" + monthAndYear + ", monthName=" + monthName +
                ", monthNameAbbr=" + monthNameAbbr + ", quarterAndYear=" + quarterAndYear +
                ", quarterAndYearAbbr2=" + quarterAndYearAbbr2 + ", yearAndMonthNum=" + yearAndMonthNum + '}';
    }
    
    
}
