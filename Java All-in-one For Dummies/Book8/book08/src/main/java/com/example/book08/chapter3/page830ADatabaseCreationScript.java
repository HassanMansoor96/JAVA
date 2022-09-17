/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.book08.chapter3;

/**
 *
 * @author Hassan
 */
public class page830ADatabaseCreationScript {

}
/*
drop database if exists movies; →1
create database movies; →2
use movies; →3
create table movie ( →4
id int not null auto_increment, →5
title varchar(50), →6
year int, →7
price decimal(8,2), →8
primary key(id) →9
);
insert into movie (title, year, price) →11
values ("It's a Wonderful Life", 1946, 14.95);
insert into movie (title, year, price)
values ("Young Frankenstein", 1974, 16.95);
insert into movie (title, year, price)
values ("Star Wars", 1977, 17.95);
insert into movie (title, year, price)
values ("The Princess Bride", 1987, 16.95);
insert into movie (title, year, price)
values ("Glory", 1989, 14.95);
insert into movie (title, year, price)
values("The Game",1997,14.95);
insert into movie (title, year, price)
values("Shakespeare in Love",1998,19.95);
insert into movie (title, year, price)
values("Zombieland",2009,18.95);
insert into movie (title, year, price)
values("The King's Speech",2010,17.85);
insert into movie (title, year, price)
values("Star Trek Into Darkness",2013,19.95);
*/