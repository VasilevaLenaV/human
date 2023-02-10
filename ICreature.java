public interface ICreature {
    void sit();
    void standup();
    void move();
    void stop();
    void say(String message);

    default String getGender(byte gender) {
         return gender == 0 ? "M" : "F";
    }
}
