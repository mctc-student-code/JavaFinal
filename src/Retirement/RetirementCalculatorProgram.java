package Retirement;

/*
 * Created by Jorri Carter on 12/3/17.
 * This is the final project for
 * Java Programming class with Clara James.
 * */

import static Retirement.DataProcessor.Proc;

//TODO UPDATE DATABASE ACCESS TO USE TRY WITH RESOURCE
//TODO how to create database (can java do it or does it need to be prepped)
//TODO how to check for if a database exists (DatabaseIO.dataExists(title))
//TODO how to check number of databases to know which one to load and which number to save new one as (DatabaseIO)
//TODO processes in Process for determining naming convention (Process.loadPrevious(title))
//TODO how to create database table (DatabaseIO)
//TODO how to put data into database table (DatabaseIO)
//TODO how to get data from database table (DatabaseIO)
//TODO how to insert data into JTable (CalculatorGUI.createTable)
//TODO how to convert from database format to JTable format (ToGenerator)
//TODO have load button tell processor to extract data from database
//TODO validate user input to not be blank and to be within ranges; manage floats.
//TODO make sure parse ints work from text like $ and ,
//TODO delete old comments and fix warnings in code
//TODO add comments to complicated parts
//TODO include instructions on how to prep database for this application
//TODO tidy up code and delete cluttering comments
//TODO add alternate rows
//TODO add way to select deletion of tables

class RetirementCalculatorProgram {

    public static void main(String[] args) {Proc.startProgram();}
}