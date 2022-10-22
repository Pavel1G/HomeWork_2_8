public class Passport {
    // Не могу сообразить как передать id объекту классу Passport в main'e. Или уже не надо?
    private String id;
    private String secondName;
    private String firstName;
    private String thirdName;
    private String birthData;

    public Passport(String id, String secondName, String firstName, String thirdName, String birthData) throws Exception {
        this.id = id;
        setSecondName(secondName);
        setFirstName(firstName);
        setThirdName(thirdName);
        setBirthData(birthData);
    }


    public Passport(String id, String secondName, String firstName, String birthData) throws Exception {
        this(id, secondName, firstName, null, birthData);
    }

    public void setSecondName(String secondName) throws Exception {
        if (secondName != null || secondName.isBlank()) {
            this.secondName = secondName;
        } else {
            throw new Exception("Нельзя выдать паспорт. Укажите фамилию!");
        }
    }

    public void setFirstName(String firstName) throws Exception {
        if (firstName != null || firstName.isBlank()) {
            this.firstName = firstName;
        } else {
            throw new Exception("Нельзя выдать паспорт. Укажите имя!");
        }
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public void setBirthData(String birthData) throws Exception {
        if (birthData != null || birthData.isBlank()) {
            this.birthData = birthData;
        } else {
            throw new Exception("Нельзя выдать паспорт. Укажите дату рождения!");
        }
    }

    public String getId() {
        return id;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getBirthData() {
        return birthData;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id='" + id + '\'' +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", birthData='" + birthData + '\'' +
                '}';
    }
}
