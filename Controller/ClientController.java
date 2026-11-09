/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Client;
import Sort.SelectionSort;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author admin
 */
public class ClientController {
    private final List<Client> clientList;

    public ClientController() {
        this.clientList = new ArrayList<>();
    }

    public void addClient(String name, String email, String phone, String address) {
        clientList.add(new Client(name, email, phone, address));
    }
    
    public void updateClient(int index, String name, String email, String phone, String address) {
        if (index >= 0 && index < clientList.size()) {
            Client client = clientList.get(index);
            client.setName(name);
            client.setEmail(email);
            client.setPhone(phone);
            client.setAddress(address);
        }
    }

    public void removeClient(int index) {
        if (index >= 0 && index < clientList.size()) {
            clientList.remove(index);
        }
    }

    public List<Client> getClients() {
        return clientList;
    }

    public void sortClients(boolean ascending) {
        SelectionSort.sortByName(clientList, ascending);
    }
}
