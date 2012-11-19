package com.apress.springrecipes.court.domain;

public class SportType
{

public SportType() {}

public SportType(int id, String name) {
        this.id = id;
        this.name = name;
    }

private int id;
/**
 * @return the id
 */
public int getId()
{
   return id;
}
/**
 * @param id the id to set
 */
public void setId(int id)
{
   this.id = id;
}
/**
 * @return the name
 */
public String getName()
{
   return name;
}
/**
 * @param name the name to set
 */
public void setName(String name)
{
   this.name = name;
}
private String name;

}