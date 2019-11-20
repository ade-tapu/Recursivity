import com.sdacademy.oop.ConferenceRoom;
import com.sdacademy.oop.Members;
import org.junit.Test;

public class ConferenceRoomTest{

   @Test
    public void testConferenceRoomtest() {


        Members persoana1 = new Members();
        persoana1.setNume("Stefan");
        persoana1.setPrenume("Mihai");
        persoana1.setFunctia(".");

        Members persoana2 = new Members();
        persoana2.setNume("Stefan1");
        persoana2.setPrenume("Mihai1");
        persoana2.setFunctia("..");


        ConferenceRoom sala1 = new ConferenceRoom();
        sala1.AdaugareMembrii(persoana1);
        sala1.AdaugareMembrii(persoana2);

        sala1.AfisareMembrii();


    }
}
