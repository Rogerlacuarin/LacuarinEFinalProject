/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;
import Model.Client;
import java.util.List;
/**
 *
 * @author admin
 */
public class SelectionSort {
    public static void sortByName(List<Client> clients, boolean ascending) {
        int n = clients.size();
        for (int i = 0; i < n - 1; i++) {
            int targetIndex = i;
            for (int j = i + 1; j < n; j++) {
                int compareResult = clients.get(j).getName()
                        .compareToIgnoreCase(clients.get(targetIndex).getName());

                if (ascending) {
                    if (compareResult < 0) targetIndex = j;
                } else {
                    if (compareResult > 0) targetIndex = j;
                }
            }
            if (targetIndex != i) {
                Client temp = clients.get(i);
                clients.set(i, clients.get(targetIndex));
                clients.set(targetIndex, temp);
            }
        }
    }
}
