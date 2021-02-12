package lab;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@Entity
public class AddressBook {

	private long id;

	private Collection<BuddyInfo> lists;

	public AddressBook() {
		this.lists = new ArrayList<BuddyInfo>();
	}

	public void addBuddy(BuddyInfo a) {
		this.lists.add(a);
	}

	public void removeBuddy(BuddyInfo a) {
		this.lists.remove(a);
	}

//	public String toString() {
//		String s = "";
//		for (BuddyInfo i : this.lists) {
//			s = s + i.toString() + "\r\n";
//		}
//		return s;
//	}

	public int size() {
		return this.lists.size();
	}

	public void clear() {
		this.lists.clear();
	}

	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the id of this Player. The persistence provider should
	 * autogenerate a unique id for new player objects.
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}

	@OneToMany
	public Collection<BuddyInfo> getBuddyInfo() {
		return lists;
	}

	public void setBuddyInfo(Collection<BuddyInfo> lists) {
		this.lists = lists;
	}

	public static void init () {

	}

//	public static void main(String[] args) {
//		AddressBook aBook = new AddressBook();
////		BuddyInfo b1 = new BuddyInfo("Mike", 1234567890, 19);
////		BuddyInfo b2 = new BuddyInfo("John", 1111111111, 16);
////		aBook.addBuddy(b1);
////		aBook.addBuddy(b2);
//
//		System.out.println(aBook.toString());
//	}
}
