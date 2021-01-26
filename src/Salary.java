//checking the conditional operator
public class Salary {
    public static void main(String[] args) {
        int numOfPets = 5;
//        x = (boolean expression) ? value to assign if true : value to assign if false ;
        String status = (numOfPets < 4) ? "Pet limit not exceeded" : " too many pets";
        System.out.println(status);

        int sizeOfYard = 10;
//        conditional operator can be used in multiple places!!
        status = numOfPets < 4 ? "Pet count Ok" : (sizeOfYard > 8) ? " Pet limit on the edge" : "too many pets";
        System.out.println("Pet status is  " + status);
    }
}
