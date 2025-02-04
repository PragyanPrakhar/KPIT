package QUESTION_3;

import java.util.*;

public class Main {
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
