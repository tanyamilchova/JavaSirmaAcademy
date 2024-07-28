
import java.util.ArrayList;
import java.util.Arrays;

public class Manager {
    private Service service;

    public Manager(Service service) {
        this.service = service;
    }
    protected void execute(String command) {
        String[] parts = command.split(" ");
        ArrayList<String> commands = trimArray(parts);

        if (commands.isEmpty()) {
            System.out.println(("Empty command list"));
        } else {
            String partComand = commands.get(0);
            switch (partComand) {
                case "Add" -> service.addEmployee();
                case "Edit" -> {
                    if (parts.length >= 2) {
                        Long id = Util.getLongInput(commands.get(1));
                        service.editEmployee(id);
                    } else {
                        Service.displayComands();
                    }
                }
                case "Fire" -> {
                    if (parts.length >= 2) {
                        Long id = Util.getLongInput(commands.get(1));
                        service.fire(id);
                    } else {
                        Service.displayComands();
                    }
                }
                case "Search" -> {
                    if (parts.length >= 3) {
                        if (commands.get(1).equals("Id")) {
                            Long id = Util.getLongInput(commands.get(2));
                            service.searchById(id);
                        }
                        if (commands.get(1).equals("Name")) {
                            service.searchByName(commands.get(2));
                        }
                    } else {
                        Service.displayComands();
                    }
                }
                case "List"->service.listEmployees();
                case "Save" -> {
                    System.out.println("All the data will be saved to src/output.txt");
                }
//                case "Map" -> service.printMap();
                default -> {
                    System.out.println("Enter a valid command");
                }
            }
        }
    }
    private ArrayList<String> trimArray(String[]arr){
        ArrayList<String>trimmedComands=new ArrayList<>();
        for (String string:arr){
            if(string.isEmpty()){
                continue;
            }
            trimmedComands.add(string.trim());
        }
        return trimmedComands;
    }
}
