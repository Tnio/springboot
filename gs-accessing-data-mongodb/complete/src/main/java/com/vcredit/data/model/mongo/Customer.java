package com.vcredit.data.model.mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "user_info")
public class Customer {
    @Id
    public String id;

    @Indexed(unique = true)
    public String name;

    public String email;
}

