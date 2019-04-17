create table cart
(
  id  bigint not null
    primary key,
  sum double null
);

create table cart_products
(
  cart_id     bigint not null,
  products_id bigint not null,
  constraint UK_3kg5kx19f8oy0lo76hdhc1uw1
  unique (products_id)
);
create index FKnlhjc091rdu9k5c8u9xwp280w
  on cart_products (cart_id);

create table hibernate_sequence
(
  next_val bigint null
);
create table office
(
  id         bigint       not null
    primary key,
  city       varchar(255) null,
  counyry    varchar(255) null,
  e_mail     varchar(255) null,
  first_name varchar(255) null,
  last_name  varchar(255) null,
  password   varchar(255) null
);
create table orders
(
  id        bigint not null
    primary key,
  payment   bit    not null,
  sum       double null,
  office_id bigint null
);

create index FKjkd0c600rsk0fe3mqrarh6ra8
  on orders (office_id);

create table product
(
  id                  bigint       not null
    primary key,
  color               varchar(255) null,
  comment             varchar(255) null,
  name                varchar(255) null,
  price               double       null,
  size                varchar(255) null,
  product_category_id bigint       null
);

create index FKcwclrqu392y86y0pmyrsi649r
  on product (product_category_id);

create table product_category
(
  id   bigint       not null
    primary key,
  name varchar(255) null
);

create table role
(
  id   bigint       not null
    primary key,
  name varchar(255) null
);
create table role_users
(
  role_id  bigint not null,
  users_id bigint not null,
  primary key (role_id, users_id)
);

create index FK9bybxrnjl6xpb73hruvlvaw71
  on role_users (users_id);

create table users
(
  id       bigint       not null
    primary key,
  login    varchar(255) null,
  password varchar(255) null
);

create table users_roles
(
  user_id  bigint not null,
  roles_id bigint not null,
  primary key (user_id, roles_id)
);

create index FK15d410tj6juko0sq9k4km60xq
  on users_roles (roles_id);
