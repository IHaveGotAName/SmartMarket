package market.Utilites;

import market.dto.*;
import market.entity.*;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ivegotaname on 04.12.16.
 */
public class Transformer {
    public static AccessoriesDTO accessoriesToAccessoriesDTO(Accessories accessories){
        AccessoriesDTO accessoriesDTO = new AccessoriesDTO();
        accessoriesDTO.setId(accessories.getId());
        accessoriesDTO.setAccessoryType(accessories.getAccessoryType());
        accessoriesDTO.setCount(accessories.getCount());
        accessoriesDTO.setDescription(accessories.getDescription());
        accessoriesDTO.setModel(accessories.getModel());
        accessoriesDTO.setPrice(accessories.getPrice());
        accessoriesDTO.setSertificate(accessories.getSertificate());
        accessoriesDTO.setManufacturer(accessories.getManufacturer());
        return accessoriesDTO;
    }
    public static Accessories accessoriesDTOToAccessories(AccessoriesDTO accessoriesDTO){
        Accessories accessories = new Accessories();
        accessories.setId(accessoriesDTO.getId());
        accessories.setModel(accessoriesDTO.getModel());
        accessories.setSertificate(accessoriesDTO.getSertificate());
        accessories.setPrice(accessoriesDTO.getPrice());
        accessories.setAccessoryType(accessoriesDTO.getAccessoryType());
        accessories.setDescription(accessoriesDTO.getDescription());
        accessories.setCount(accessoriesDTO.getCount());
        accessories.setManufacturer(accessoriesDTO.getManufacturer());
        return accessories;
    }

    public static PhoneDTO phoneToPhoneDTO(Phone phone){
        PhoneDTO phoneDTO = new PhoneDTO();
        phoneDTO.setManufacturerID(phone.getManufacturerID());
        phoneDTO.setPrice(phone.getPrice());
        phoneDTO.setCount(phone.getCount());
        phoneDTO.setDescription(phone.getDescription());
        phoneDTO.setModel(phone.getModel());
        phoneDTO.setId(phone.getId());
        phoneDTO.setCode(phone.getCode());
        phoneDTO.setGarantyDays(phone.getGarantyDays());
        phoneDTO.setPricePolicy(phone.getPricePolicy());
        phoneDTO.setSizes(phone.getSizes());
        return phoneDTO;
    }

    public static Phone phoneDTOToPhone(PhoneDTO phoneDTO){
        Phone phone = new Phone();
        phoneDTO.setManufacturerID(phoneDTO.getManufacturerID());
        phone.setPrice(phoneDTO.getPrice());
        phone.setCount(phoneDTO.getCount());
        phone.setDescription(phoneDTO.getDescription());
        phone.setModel(phoneDTO.getModel());
        phone.setId(phoneDTO.getId());
        phone.setCode(phoneDTO.getCode());
        phone.setGarantyDays(phoneDTO.getGarantyDays());
        phone.setPricePolicy(phoneDTO.getPricePolicy());
        phone.setSizes(phoneDTO.getSizes());
        return phone;
    }

    public static ManufacturerDTO manufacturerToManufacturerDTO(Manufacturer manufacturer){
        ManufacturerDTO manufacturerDTO = new ManufacturerDTO();
        manufacturerDTO.setId(manufacturer.getId());
        manufacturerDTO.setCountry(manufacturer.getCountry());
        manufacturerDTO.setDeliveryDays(manufacturer.getDeliveryDays());
        manufacturerDTO.setDeliveryTpe(manufacturer.getDeliveryTpe());
        manufacturerDTO.setNameMan(manufacturer.getNameMan());
        return manufacturerDTO;
    }


    public static Manufacturer manufacturerDTOToManufacturer(ManufacturerDTO manufacturerDTO){
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(manufacturerDTO.getId());
        manufacturer.setCountry(manufacturerDTO.getCountry());
        manufacturer.setDeliveryDays(manufacturerDTO.getDeliveryDays());
        manufacturer.setDeliveryTpe(manufacturerDTO.getDeliveryTpe());
        manufacturer.setNameMan(manufacturerDTO.getNameMan());
        return manufacturer;
    }
    public static HistoryDTO historyToHistoryDTO(History history){
        HistoryDTO historyDTO = new HistoryDTO();
        historyDTO.setId(history.getId());
        historyDTO.setAccessories(history.getAccessories());
        historyDTO.setAccessoriesCount(history.getAccessoriesCount());
        historyDTO.setAccessoriesPrice(history.getAccessoriesPrice());
        historyDTO.setPhone(history.getPhone());
        historyDTO.setPhoneCount(history.getPhoneCount());
        historyDTO.setPhonePrice(history.getPhonePrice());
        historyDTO.setDate(history.getDate());
        historyDTO.setUserID(history.getUserID());
        return historyDTO;
    }

    public static History historyDTOToHistory(HistoryDTO historyDTO){
        History history = new History();
        history.setId(historyDTO.getId());
        history.setAccessories(historyDTO.getAccessories());
        history.setAccessoriesCount(historyDTO.getAccessoriesCount());
        history.setAccessoriesPrice(historyDTO.getAccessoriesPrice());
        history.setPhone(historyDTO.getPhone());
        history.setPhoneCount(historyDTO.getPhoneCount());
        history.setPhonePrice(historyDTO.getPhonePrice());
        history.setDate(historyDTO.getDate());
        history.setUserID(historyDTO.getUserID());
        return history;
    }
    public static UserDTO userToUserDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName(user.getFirstName());
        userDTO.setId(user.getId());
        userDTO.setBirthday(user.getBirthday());
        userDTO.setEmail(user.getEmail());
        userDTO.setLogin(user.getLogin());
        userDTO.setPassword(user.getPassword());
        userDTO.setSecondName(user.getSecondName());
        userDTO.setRole(user.getRole());
        userDTO.setSex(user.getSex());
        return userDTO;
    }

    public static User userDTOTouser(UserDTO userDTO) {
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setId(userDTO.getId());
        user.setBirthday(userDTO.getBirthday());
        user.setEmail(userDTO.getEmail());
        user.setLogin(userDTO.getLogin());
        user.setPassword(userDTO.getPassword());
        user.setSecondName(userDTO.getSecondName());
        user.setRole(userDTO.getRole());
        user.setSex(userDTO.getSex());
        return user;
    }
    public static List<UserDTO> listUserToListUserDto(List<User> users) {
        List<UserDTO> userDTOs = new LinkedList<>();
        for (User user : users) {
            UserDTO userDTO = userToUserDTO(user);
            userDTOs.add(userDTO);
        }
        return userDTOs;
    }
    public static List<PhoneDTO> listPhoneToListPhoneDto(List<Phone> phones) {
        List<PhoneDTO> phoneDTOs = new LinkedList<>();
        for (Phone phone : phones) {
            PhoneDTO phoneDTO = phoneToPhoneDTO(phone);
            phoneDTOs.add(phoneDTO);
        }
        return phoneDTOs;
    }
    public static List<ManufacturerDTO> listManufacturerToListManufacturerDto(List<Manufacturer> manufacturers) {
        List<ManufacturerDTO> manufacturerDTOs = new LinkedList<>();
        for (Manufacturer manufacturer : manufacturers) {
            ManufacturerDTO manufacturerDTO = manufacturerToManufacturerDTO(manufacturer);
            manufacturerDTOs.add(manufacturerDTO);
        }
        return manufacturerDTOs;
    }
    public static List<AccessoriesDTO> listAccessoriesToListAccessoriesDto(List<Accessories> accessoriess) {
        List<AccessoriesDTO> accessoriesDTOs = new LinkedList<>();
        for (Accessories accessories : accessoriess) {
            AccessoriesDTO accessoriesDTO = accessoriesToAccessoriesDTO(accessories);
            accessoriesDTOs.add(accessoriesDTO);
        }
        return accessoriesDTOs;
    }
    public static List<HistoryDTO> listHistoryToListHistoryDto(List<History> histories) {
        List<HistoryDTO> historyDTOs = new LinkedList<>();
        for (History history : histories) {
            HistoryDTO historyDTO = historyToHistoryDTO(history);
            historyDTOs.add(historyDTO);
        }
        return historyDTOs;
    }
}

