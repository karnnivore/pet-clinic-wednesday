package petclinicwednesday.ca.gbc.services.map;

import org.springframework.stereotype.Service;
import petclinicwednesday.ca.gbc.model.Specialty;
import petclinicwednesday.ca.gbc.services.SpecialtiesService;

import java.util.Set;

@Service
public class SpecialitiesServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtiesService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
