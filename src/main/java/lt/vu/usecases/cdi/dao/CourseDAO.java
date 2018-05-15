package lt.vu.usecases.cdi.dao;

import lt.vu.entities.Course;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class CourseDAO {
    @Inject
    private EntityManager em;

    public void create(Course course) {
        em.persist(course);
    }
}
