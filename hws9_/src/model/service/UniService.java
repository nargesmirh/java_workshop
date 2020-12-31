package model.service;

import model.entity.unientity;
import model.repository.UniRepository;

import java.util.List;

public class UniService {

    private static UniService uniService = new UniService();

    public static UniService getInstance() {
        return uniService;
    }

    private UniService() {

    }

    public void save(unientity unientity) throws Exception {
        try (UniRepository uniRepository = new UniRepository()) {
            uniRepository.insert(unientity);
            uniRepository.commit();
        }
    }

    public void edit(unientity unientity) throws Exception {
        try (UniRepository uniRepository = new UniRepository()) {
            uniRepository.update(unientity);
            uniRepository.commit();
        }
    }

    public void remove(int code) throws Exception {
        try (UniRepository uniRepository = new UniRepository()) {
            uniRepository.delete(code);
            uniRepository.commit();
        }
    }

    public List<unientity> report() throws Exception {
        List<unientity> storeEntities;
        try(UniRepository uniRepository = new UniRepository()) {
            storeEntities = uniRepository.select();
        }
        return storeEntities;
    }
}
