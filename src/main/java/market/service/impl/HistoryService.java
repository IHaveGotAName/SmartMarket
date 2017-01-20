package market.service.impl;

import market.Utilites.Transformer;
import market.dao.impl.HistoryDAO;
import market.dto.HistoryDTO;
import market.entity.History;
import market.service.api.CrudService;

import java.util.List;

/**
 * Created by ivegotaname on 04.12.16.
 */
public class HistoryService implements CrudService<HistoryDTO> {
    private static HistoryDAO historyDAO = null;
    public static HistoryDAO getHistoryDAO(){
        if (historyDAO == null){
            historyDAO = new HistoryDAO();
        }
        return historyDAO;
    }
    @Override
    public HistoryDTO findById(int id) {
        HistoryDTO historyDTO = Transformer.historyToHistoryDTO(getHistoryDAO().findById(id));
        return historyDTO;
    }

    @Override
    public List<HistoryDTO> findAll() {
        List<HistoryDTO> historyDTOs = Transformer.listHistoryToListHistoryDto(getHistoryDAO().findAll());
        return historyDTOs;
    }

    @Override
    public void create(HistoryDTO historyDTO) {
        History history = Transformer.historyDTOToHistory(historyDTO);
        getHistoryDAO().create(history);
    }

    @Override
    public void update(HistoryDTO historyDTO) {
        getHistoryDAO().update(Transformer.historyDTOToHistory(historyDTO));
    }

    @Override
    public void delete(HistoryDTO historyDTO) {
        getHistoryDAO().delete(Transformer.historyDTOToHistory(historyDTO));
    }
    public HistoryDTO findHistoryByUser(HistoryDTO historyDTO){
        History history = Transformer.historyDTOToHistory(historyDTO);
        History history1 = getHistoryDAO().findByUserId(history.getId());
        HistoryDTO historyDTO1 = Transformer.historyToHistoryDTO(history1);
        return historyDTO1;
    }
}
