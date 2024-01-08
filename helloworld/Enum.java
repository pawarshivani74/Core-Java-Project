package helloworld;

public class Enum {

	class EmpComparatorFactory {
	    public static Comparator<Employee> getComparator(EmpSort sortType) {
	        switch (sortType) {
	            case NAME_ASC:
	                return new EmpComparatorName();
	            case NAME_DSC:
	                return new EmpComparatorName().reversed();
	            case SALARY_ASC:
	                return new EmpComparatorSalary();
	            case SALARY_DSC:
	                return new EmpComparatorSalary().reversed();
	            default:
	                return null;
	        }
	    }

	    static class EmpComparatorName implements Comparator<Employee> {
	        @Override
	        public int compare(Employee o1, Employee o2) {
	            return o1.name.compareTo(o2.name);
	        }
	    }

	    static class EmpComparatorSalary implements Comparator<Employee> {
	        @Override
	        public int compare(Employee o1, Employee o2) {
	            return Integer.compare(o1.salary, o2.salary);
	        }
	    }
	}

	enum EmpSort {
	    NAME_ASC, NAME_DSC, SALARY_ASC, SALARY_DSC
	}

}
