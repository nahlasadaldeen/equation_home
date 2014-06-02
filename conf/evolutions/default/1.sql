# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table equation (
  a                         double,
  b                         double,
  c                         double)
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists equation;

SET REFERENTIAL_INTEGRITY TRUE;

