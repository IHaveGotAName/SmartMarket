package market.service.impl;

import market.Utilites.Transformer;
import market.dao.impl.PhoneDAO;
import market.dto.PhoneDTO;
import market.entity.Phone;
import market.service.api.CrudService;

import java.util.List;

/**
 * Created by ivegotaname on 04.12.16.
 */
public class PhoneService implements CrudService<PhoneDTO> {
    private static PhoneDAO phoneDAO = null;
    public static PhoneDAO getPhoneDAO(){
        if (phoneDAO == null){
            phoneDAO = new PhoneDAO();
        }
        return phoneDAO;
    }
    @Override
    public PhoneDTO findById(int id) {
        PhoneDTO phoneDTO = Transformer.phoneToPhoneDTO(getPhoneDAO().findById(id));
        return phoneDTO;
    }

    @Override
    public List<PhoneDTO> findAll() {
        List<PhoneDTO> phoneDTOs = Transformer.listPhoneToListPhoneDto(getPhoneDAO().findAll());
        return phoneDTOs;
    }

    @Override
    public void create(PhoneDTO phoneDTO) {
        Phone phone = Transformer.phoneDTOToPhone(phoneDTO);
        getPhoneDAO().create(phone);
    }

    @Override
    public void update(PhoneDTO phoneDTO) {
        getPhoneDAO().update(Transformer.phoneDTOToPhone(phoneDTO));
    }

    @Override
    public void delete(PhoneDTO phoneDTO) {
        getPhoneDAO().delete(Transformer.phoneDTOToPhone(phoneDTO));
    }
}
