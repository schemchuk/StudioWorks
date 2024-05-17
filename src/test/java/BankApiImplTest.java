import de.telran.extraHomeWorke.exepscens.bank.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BankApiImplTest {
    @Test
    public void testFindByUid_Success() throws UnauthorizedAccessException, AccessDeniedException {
        // Создаем список клиентов
        List<BankClient> clients = new ArrayList<>();
        BankClient client1 = new BankClient("1", "Opanas Sviridovich");
        BankClient client2 = new BankClient("2", "Stepan Perebuynis");
        clients.add(client1);
        clients.add(client2);

        // Создаем макет объекта UserCredentials с ролью CAN_SEARCH_CLIENTS
        UserCredentials mockCredentials = mock(UserCredentials.class);
        when(mockCredentials.getRoles()).thenReturn(List.of(Role.CAN_SEARCH_CLIENTS));

        // Создаем экземпляр BankApiImpl с нашим списком клиентов
        BankApiImpl bankApi = new BankApiImpl(clients);

        // Проверяем, что клиент с указанным UID найден
        assertEquals(client1, bankApi.findByUid(mockCredentials, "1").orElse(null));
    }

//    @Test
//    public void testFindByUid_UnauthorizedAccessException() {
//        // Создаем макет объекта UserCredentials без роли CAN_SEARCH_CLIENTS
//        UserCredentials mockCredentials = mock(UserCredentials.class);
//        when(mockCredentials.getRoles()).thenReturn(new ArrayList<>()); // пустой список ролей
//
//        // Создаем пустой список клиентов
//        List<BankClient> clients = new ArrayList<>();
//
//        // Создаем экземпляр BankApiImpl с пустым списком клиентов
//        BankApiImpl bankApi = new BankApiImpl(clients);
//
//        // Проверяем, что выбрасывается UnauthorizedAccessException, когда пользователь не имеет прав на поиск клиентов
//        assertThrows(UnauthorizedAccessException.class, () -> bankApi.findByUid(mockCredentials, "1"));
//    }
//
//    @Test
//    public void testFindByUid_ClientNotFound() throws UnauthorizedAccessException, AccessDeniedException {
//        // Создаем список клиентов
//        List<BankClient> clients = new ArrayList<>();
//        BankClient client = new BankClient("1", "John Doe");
//        clients.add(client);
//
//        // Создаем макет объекта UserCredentials с ролью CAN_SEARCH_CLIENTS
//        UserCredentials mockCredentials = mock(UserCredentials.class);
//        when(mockCredentials.getRoles()).thenReturn(List.of(Role.CAN_SEARCH_CLIENTS));
//
//        // Создаем экземпляр BankApiImpl с нашим списком клиентов
//        BankApiImpl bankApi = new BankApiImpl(clients);
//
//        // Проверяем, что выбрасывается AccessDeniedException, когда клиент с указанным UID не найден
//        assertThrows(AccessDeniedException.class, () -> bankApi.findByUid(mockCredentials, "2"));
//    }
}
