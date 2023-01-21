public class Research {
    public static void getRelation(Person person, Relation relation, Tree tree) {
        for (Link el : tree.getLinks()) {
            if (el.getPeople().getFirstName().equals(person.getFirstName())&& el.getPeople().getSurname().equals(person.getSurname()) && el.getRelationType() == relation) {
                System.out.println(el);
            }
        }
    }
    public static void getRelation(Relations relation, Tree tree) {
        for (Link el : tree.getLinks()) {
            if (el.getRelationType() == relation) {
                System.out.println(el);
            }
        }
    }
    public static void getRelation(Person person, Tree tree) {
        for (Link el : tree.getLinks()) {
            if (el.getPeople().getFirstName().equals(person.getFirstName())&& el.getPeople().getSurname().equals(person.getSurname())) {
                System.out.println(el);
            }
        }
    }                 
}
