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

create table horaire (
  id                        bigint not null,
  debut                     varchar(255),
  fin                       varchar(255),
  constraint pk_horaire primary key (id))
;

create table jour (
  id                        bigint not null,
  date                      varchar(255),
  constraint pk_jour primary key (id))
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

create table evenement_jour (
  evenement_id                   bigint not null,
  jour_id                        bigint not null,
  constraint pk_evenement_jour primary key (evenement_id, jour_id))
;

create table jour_horaire (
  jour_id                        bigint not null,
  horaire_id                     bigint not null,
  constraint pk_jour_horaire primary key (jour_id, horaire_id))
;

create table personne_horaire (
  personne_id                    bigint not null,
  horaire_id                     bigint not null,
  constraint pk_personne_horaire primary key (personne_id, horaire_id))
;

create table personne_jour (
  personne_id                    bigint not null,
  jour_id                        bigint not null,
  constraint pk_personne_jour primary key (personne_id, jour_id))
;
create sequence evenement_seq;

create sequence horaire_seq;

create sequence jour_seq;

create sequence personne_seq;




alter table evenement_personne add constraint fk_evenement_personne_eveneme_01 foreign key (evenement_id) references evenement (id) on delete restrict on update restrict;

alter table evenement_personne add constraint fk_evenement_personne_personn_02 foreign key (personne_id) references personne (id) on delete restrict on update restrict;

alter table evenement_jour add constraint fk_evenement_jour_evenement_01 foreign key (evenement_id) references evenement (id) on delete restrict on update restrict;

alter table evenement_jour add constraint fk_evenement_jour_jour_02 foreign key (jour_id) references jour (id) on delete restrict on update restrict;

alter table jour_horaire add constraint fk_jour_horaire_jour_01 foreign key (jour_id) references jour (id) on delete restrict on update restrict;

alter table jour_horaire add constraint fk_jour_horaire_horaire_02 foreign key (horaire_id) references horaire (id) on delete restrict on update restrict;

alter table personne_horaire add constraint fk_personne_horaire_personne_01 foreign key (personne_id) references personne (id) on delete restrict on update restrict;

alter table personne_horaire add constraint fk_personne_horaire_horaire_02 foreign key (horaire_id) references horaire (id) on delete restrict on update restrict;

alter table personne_jour add constraint fk_personne_jour_personne_01 foreign key (personne_id) references personne (id) on delete restrict on update restrict;

alter table personne_jour add constraint fk_personne_jour_jour_02 foreign key (jour_id) references jour (id) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists evenement;

drop table if exists evenement_personne;

drop table if exists evenement_jour;

drop table if exists horaire;

drop table if exists jour;

drop table if exists jour_horaire;

drop table if exists personne;

drop table if exists personne_horaire;

drop table if exists personne_jour;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists evenement_seq;

drop sequence if exists horaire_seq;

drop sequence if exists jour_seq;

drop sequence if exists personne_seq;

