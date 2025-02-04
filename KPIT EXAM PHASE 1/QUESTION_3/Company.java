package QUESTION_3;

enum CompanyType {
    SMB,MNC,NATIONAL
}

public class Company {
    private String regName;
    private String baseLocation;
    private CompanyType companyType;
    private ITDepartment itDepartment;

    //generating source actions for the class Company.
    public Company(String regName, String baseLocation, CompanyType companyType, ITDepartment itDepartment) {
        this.regName = regName;
        this.baseLocation = baseLocation;
        this.companyType = companyType;
        this.itDepartment = itDepartment;
    }

    //getter and setter methods of Company class.

    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    public String getBaseLocation() {
        return baseLocation;
    }

    public void setBaseLocation(String baseLocation) {
        this.baseLocation = baseLocation;
    }

    public CompanyType getCompanyType() {
        return companyType;
    }

    public void setCompanyType(CompanyType companyType) {
        this.companyType = companyType;
    }

    public ITDepartment getCompanyItDepartment() {
        return itDepartment;
    }

    public void setItDepartment(ITDepartment itDepartment) {
        this.itDepartment = itDepartment;
    }

    
    
}
