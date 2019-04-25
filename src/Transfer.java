public class Transfer {
    public String port_send;
    public String to_port;
    public double distance;
    public double time;
    public double speed;
    public double max_weight;

    public Transfer(){
        port_send="";
        to_port="";
        distance=0.0;
        time=0.0;
        speed=0.0;
        max_weight = 0.0;
    }

    public Transfer(String port_end, String to_port, double distance,double speed, double max_weight){
        this.port_send=port_end;
        this.to_port=to_port;
        this.distance=distance;
        this.time=distance/speed;
        this.speed=speed;
        this.max_weight=max_weight;
    }

    public void Display(){
        System.out.println("Порт-відправник = " + port_send + " Порт-приймач = " + to_port + " Відстань = " + distance + " Час = " + time + " Швидкість = " + speed + " Максимальна вага товару = " + max_weight );
    }



}
