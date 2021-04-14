package lections.lesson1;

public class Room {

    Desk desk;
    Outlet outlet1;
    Outlet outlet2;
    Door door;
    Window window1;
    Window window2;

    static class Desk {
        int h;
        String material;
    }

    static class Outlet {
        int voltage;
        String type;
    }

    static class Door {
        DoorHandle doorHandle;
        String material;

        static class DoorHandle {
            String material;
        }
    }

    static class Window {
        String size;
    }

    public static void main(String[] args) {
        Room room = new Room();
        room.desk = new Desk();
        room.desk.material = "Дерево";
        room.outlet1 = new Outlet();
        room.outlet1.voltage = 220;
        room.outlet1.type = "Силовая розетка";
        room.door = new Door();
        room.door.material = "Дерево";
        room.door.doorHandle = new Door.DoorHandle();
        room.door.doorHandle.material = "Пластик";
       // room.window1 = new Window();
       // room.window1.size = "180x120";
        System.out.println(room.window1.size);
    }

}
