package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {

    private String topic;


    // TODO:
    public CreateTopicMsg(MessageType msgType, String user, String topic ){
        super(msgType,user);
        this.topic = topic;
    }
    // Implement objectvariables, constructor, get/set-methods, and toString method


    @Override
    public String toString() {
        return super.toString() +  " createTopicMsg[ + " + topic + "]";
    }
}
