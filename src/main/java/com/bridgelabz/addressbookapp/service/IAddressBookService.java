package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDto;
import com.bridgelabz.addressbookapp.model.AddressBookModel;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookModel> getAddressBookData();

    AddressBookModel getAddressBookDataById(int personId);

    AddressBookModel createDataToAddressBook(AddressBookDto addressBookDto);

    AddressBookModel updateDataOfAddressBook(int personId, AddressBookDto addressBookDto);

    void deleteDataOfAddressBook(int personId);

    List<AddressBookModel> getAddressBookDataByIdEmail(String email);
}
