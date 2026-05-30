interface Notifications
{
    void SendMessages(String Normalmsg);
    void Whasapp(String Wpmessage);
    void Email(String Emailmsg);
}
interface Calls
{
    void MakeCalls(int MBnumber);
    
}
class Mobile implements Notifications, Calls
{
    public void SendMessages(String Normalmsg)
    {
        System.out.println("Messages sent: " + Normalmsg);
    }
    public void MakeCalls(int MBnumber)
    {
        System.out.println("Calls made to: " + MBnumber);
    }
    public void Whasapp(String Wpmessage)
    {
        System.out.println("Whatsapp is used: " + Wpmessage);
    }
    public void Email(String Emailmsg)
    {
        System.out.println("Email sent: " + Emailmsg);
    }

}
class Inter
{
    public static void main(String args[])
    {
        Mobile m = new Mobile();
        m.SendMessages("Hello, how are you?");
        m.MakeCalls(1234567890);
        m.Whasapp("This is a Whatsapp message.");
        m.Email("This is an email message.");

    }
}
