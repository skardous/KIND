# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table evenement (
  id                        bigint not null,
  titre                     varchar(255),
  lieu                      varchar(255),
  descriptif                varchar(255),
  createur                  varchar(255),
  mail                      varchar(255),
  dates                     varchar(255),
  heures                    varchar(255),
  constraint pk_evenement primary key (id))
;

create table personne (
  id                        bigint not null,
  nom                       varchar(255),
  constraint pk_personne primary key (id))
;


create table evenement_personne (
  evenement_id                   bigint not null,
  personne_id                    bigint not null,
  constraint pk_evenement_personne primary key (evenement_id, personne_id))
;
create sequence evenement_seq;

create sequence personne_seq;




alter table evenement_personne add constraint fk_evenement_personne_eveneme_01 foreign key (evenement_id) references evenement (id) on delete restrict on update restrict;

alter table evenement_personne add constraint fk_evenement_personne_personn_02 foreign key (personne_id) references personne (id) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists evenement;

drop table if exists evenement_personne;

drop table if exists personne;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists evenement_seq;

drop sequence if exists personne_seq;

