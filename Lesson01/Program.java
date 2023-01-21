import javax.management.relation.Relation;

import OOP_Homework.Lesson01.Gender;

public class Program {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Person p = new Person("Александр", "Михайличенко", "04.11.1982", Gender.Male);
        Person m = new Person("Татьяна", "Михайличенко", "09.03.1980", Gender.Female);
        Person s = new Person("Dmitriy", "Leto", "27.09.2000", Gender.Male);
        Person d = new Person("Ирина", "Казинская", "06.08.2003", Gender.Female);

        tree.addLink(p, m, Relations.ExHusband, Relations.ExWife);
        tree.addLink(p, s, Relations.Father, Relations.Son);
        tree.addLink(p, d, Relations.Father, Relations.Daughter);

        tree.addLink(m, s, Relations.Mother, Relations.Son);
        tree.addLink(m, d, Relations.Mother, Relations.Daughter);

        tree.addLink(s, d, Relations.Brother, Relations.Sister);

        System.out.println("-------------------\n");

        Research.getRelation(s, tree);
    }
}
