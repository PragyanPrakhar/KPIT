package QUESTION_3;

class ITDepartment {
    private int employeeCount;
    private int departmentBudget;

    // constructor ITDepartment class.
    public ITDepartment(int employeeCount, int departmentBudget) {
        this.employeeCount = employeeCount;
        this.departmentBudget = departmentBudget;
    }

    // getter and setter methods of ITDepartment class.
    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public int getDepartmentBudget() {
        return departmentBudget;
    }

    public void setDepartmentBudget(int departmentBudget) {
        this.departmentBudget = departmentBudget;
    }

}

enum CompanyType {
    SMB, MNC, NATIONAL
}

class Company {
    private String regName;
    private String baseLocation;
    private CompanyType companyType;
    private ITDepartment itDepartment;

    // generating source actions for the class Company.
    public Company(String regName, String baseLocation, CompanyType companyType, ITDepartment itDepartment) {
        this.regName = regName;
        this.baseLocation = baseLocation;
        this.companyType = companyType;
        this.itDepartment = itDepartment;
    }

    // getter and setter methods of Company class.

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

class Operations {
    private List<Company> companyData;

    public Operations() {
        this.companyData = new ArrayList<Company>();
    }

    public List<Company> CreateObjects() {
        /*
         * companyData.add(new Company("ABC", "Mumbai", CompanyType.SMB, new
         * ITDepartment(10, 400000)));
         * companyData.add(new Company("XYZ", "Pune", CompanyType.MNC, new
         * ITDepartment(200, 2000000)));
         * companyData.add(new Company("MNO", "Bengaluru", CompanyType.SMB, new
         * ITDepartment(35, 550000)));
         */
        // System.out.println("Company objects created successfully");
        return companyData;
    }

    public void FilterDepartments(List<Company> list, String regName) {
        for (Company com : list) {
            if (com.getRegName().equalsIgnoreCase(regName)) {
                System.out.println(com.getCompanyItDepartment().getDepartmentBudget());
                return;
            }
        }
    }

    public void SearchBaseLocationByType(List<Company> list, CompanyType companyType) {
        for (Company com : list) {
            if (com.getCompanyType().equals(companyType)) {
                System.out.println(com.getBaseLocation());
            }
        }
    }

}

class Main {
    public static void main(String[] args) {
        // Create Operations object
        ITDepartment itDepartment1 = new ITDepartment(500, 500000);
        Company company1 = new Company("XYZ", "Bangalore", CompanyType.SMB, itDepartment1);
        ITDepartment itDepartment2 = new ITDepartment(200, 2000000);
        Company company2 = new Company("ABC", "Mumbai", CompanyType.MNC, itDepartment2);
        ITDepartment itDepartment3 = new ITDepartment(100, 1000000);
        Company company3 = new Company("MNO", "Pune", CompanyType.NATIONAL, itDepartment3);
        // Create a list of companies
        List<Company> companyData = new ArrayList<Company>();
        companyData.add(company1);
        companyData.add(company2);
        companyData.add(company3);

        Operations operations = new Operations();
        operations.CreateObjects();
        operations.FilterDepartments(companyData, "XYZ");
        operations.SearchBaseLocationByType(companyData, CompanyType.SMB);

    }
}
