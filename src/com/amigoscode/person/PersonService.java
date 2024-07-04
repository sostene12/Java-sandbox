package com.amigoscode.person;

import static com.amigoscode.utils.StringUtils.isEmpty;

public class PersonService {

    public  int addPerson(Person person){
        if(isEmpty(person.getFirstName())){
            throw new IllegalArgumentException("First name can not be null or empty");
        }
        return  1;
    }
}
