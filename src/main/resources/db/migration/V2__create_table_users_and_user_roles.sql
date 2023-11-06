create table drivers
(
    category           varchar(255),
    driver_rank        double precision,
    driving_experience integer,
    transport_info     varchar(255),
    id                 bigint not null,
    primary key (id)
);
create table passengers
(
    passenger_rank double precision,
    id             bigint not null,
    primary key (id)
);
create table photos
(
    id                      bigserial not null,
    photo_as_array_of_bytes bytea,
    user_id                 bigint,
    primary key (id)
);
create table trips
(
    id              bigint not null,
    create_trip     timestamp,
    free_seat_count integer,
    from_point      varchar(255),
    start_trip      timestamp,
    to_point        varchar(255),
    transport_info  varchar(255),
    trip_info       varchar(255),
    view_count      integer,
    driver_id       bigint,
    passenger_id    bigint,
    primary key (id)
);
create table user_roles
(
    id   bigint not null,
    role varchar(255),
    primary key (id)
);
create table users
(
    id                bigint not null,
    birth_date        date,
    first_name        varchar(255),
    last_name         varchar(255),
    login             varchar(255),
    password          varchar(255),
    phone_number      varchar(255),
    registration_date timestamp,
    role_id           bigint,
    primary key (id)
);

alter table if exists user_roles
    drop constraint if exists UK_user_roles_role;

alter table if exists user_roles
    add constraint UK_user_roles_role unique (role);

alter table if exists users
    drop constraint if exists UK_users_login;

alter table if exists users
    add constraint UK_users_login unique (login);

alter table if exists drivers
    add constraint FK_drivers_users foreign key (id) references users;

alter table if exists passengers
    add constraint FK_passengers_users foreign key (id) references users;

alter table if exists photos
    add constraint FK_photos_users foreign key (user_id) references users;

alter table if exists trips
    add constraint FK_trips_drivers foreign key (driver_id) references drivers;

alter table if exists trips
    add constraint FK_trips_passenger foreign key (passenger_id) references passengers;

alter table if exists users
    add constraint FK_user_user_roles foreign key (role_id) references user_roles;
