# --- !Ups
create table dummy(
    id integer not null,
    name varchar(255),
    created_at datetime not null,
    updated_at datetime not null
);

# --- !Downs
drop table dummy
