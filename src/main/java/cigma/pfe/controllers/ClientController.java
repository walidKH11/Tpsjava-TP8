package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.IClientService;

public class ClientController {
    private IClientService service ;
    public ClientController(IClientService service) {
        this.service = service;
    }
    public void save(Client c){
        service.save(c);
    }
    public void modify(Client c){
        service.modify(c);
    }

    public void removeById(long id){
        service.removeById(id);
    }

    public Client getById(long id){
        return service.getById(id);
    }
}
