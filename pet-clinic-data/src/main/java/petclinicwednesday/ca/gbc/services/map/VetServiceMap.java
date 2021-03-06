package petclinicwednesday.ca.gbc.services.map;
import petclinicwednesday.ca.gbc.model.Specialty;
import petclinicwednesday.ca.gbc.model.Vet;
import petclinicwednesday.ca.gbc.services.SpecialtiesService;
import petclinicwednesday.ca.gbc.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialtiesService specialtiesService;

    public VetServiceMap(SpecialtiesService specialtiesService) {
        this.specialtiesService = specialtiesService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialties().size() > 0) {
            object.getSpecialties().forEach( specialty -> {
               if(specialty.getId() == null){
                   Specialty savedSpecialty = specialtiesService.save(specialty);
                   specialty.setId(savedSpecialty.getId());
               }
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}
