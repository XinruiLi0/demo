package lab;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//import org.springframework.data.repository.CrudRepository;
@RepositoryRestResource(collectionResourceRel = "BuddyInfo", path = "BuddyInfo")
public interface BuddyInfoRepository extends PagingAndSortingRepository<BuddyInfo, Long> {

    List<BuddyInfo> findByName(@Param("name") String Name);

    BuddyInfo findById(@Param("id") long id);
}
