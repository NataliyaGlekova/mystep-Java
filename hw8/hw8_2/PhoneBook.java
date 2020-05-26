package teach.homework.hw8.hw8_2;

public class PhoneBook {
    Contact[] arrContact = new Contact[5];

    public void printContact(int contactIndex){
        if (arrContact[contactIndex] != null){
            System.out.println(arrContact[contactIndex].name + " " + arrContact[contactIndex].number + " " + arrContact[contactIndex].type);
        }
    }
    public void swapContactType(int contactIndex1, int contactIndex2){
        String type0 = arrContact[contactIndex1].type;
        arrContact[contactIndex1].type = arrContact[contactIndex2].type;
        arrContact[contactIndex2].type = type0;
    }
    public void swapContacts(int contactIndex1, int contactIndex2){
        Contact c = arrContact[contactIndex1];
        arrContact[contactIndex1] = arrContact[contactIndex2];
        arrContact[contactIndex2] = c;
    }
    public void printContactByName(String name){
        for (int i = 0; i < arrContact.length; i++) {
            if(arrContact[i].name.equals(name)){ // почему equls а не ==
                System.out.println(arrContact[i].name + " " + arrContact[i].number);
            }
        }
    }
    public void printContactByType(String type){
        for (int i = 0; i < arrContact.length; i++) {
            if(arrContact[i].type.equals(type)){
                System.out.println(arrContact[i].name + " " + arrContact[i].number + " " + arrContact[i].type);
            }
        }
    }
    public void removeContact(int index){
        arrContact[index] = null;
    }
    public void printAllContactc(){
        for (int i = 0; i < arrContact.length; i++) {
            if(arrContact[i] != null){
                System.out.println(arrContact[i].name + " " + arrContact[i].number + " " + arrContact[i].type);
            }
        }
    }

}
