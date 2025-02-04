package QUESTION_3;

import java.util.*;

public class Operations {
    private List<Company> companyData;

    public Operations() {
        this.companyData = new ArrayList<Company>();
    }

    public List<Company> CreateObjects() {
        /* companyData.add(new Company("ABC", "Mumbai", CompanyType.SMB, new ITDepartment(10, 400000)));
        companyData.add(new Company("XYZ", "Pune", CompanyType.MNC, new ITDepartment(200, 2000000)));
        companyData.add(new Company("MNO", "Bengaluru", CompanyType.SMB, new ITDepartment(35, 550000))); */
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
