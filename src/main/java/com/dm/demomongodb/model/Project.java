package com.dm.demomongodb.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "project")
public class Project {
    @Id
    ObjectId databaseId;
    private int id;
    private String name;
    private int count;
}
