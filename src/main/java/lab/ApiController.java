package lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ApiController {

    @Autowired
    BuddyInfoRepository repo;

    @GetMapping("/AddressBook/show")
    @ResponseBody
    public AddressBook showAllBuddies(){
        Iterable<BuddyInfo> buddies = repo.findAll();
        AddressBook aBook = new AddressBook();
        for (BuddyInfo buddy : buddies){
            aBook.addBuddy(buddy);
        }
        return aBook;
    }

    @PostMapping("/AddressBook/create")
    public String create(String name, Long phoneNumber, int age){
        repo.save(new BuddyInfo(name, phoneNumber, age));
        return "Success";
    }

    @GetMapping("/AddressBook/delete")
    public String delete(@RequestParam("id") Long id){
        String name = "Unknown";
        repo.deleteById(id);
        return "Success";
    }
}
