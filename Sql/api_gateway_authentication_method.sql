create table if not exists api_gateway_authentication_method(
api_auth_id Integer not null,
auth_method varchar(255) null,
oauth2_support char null,
jwt_subject varchar(255) null,
issuer varchar(255) null,
audience varchar(255) null,
issued_at bigint null,
federal_identity_support varchar(255) null,
creation_date varchar(255) null,
modified_adte varchar(255) null,
entity_state varchar(255) null,
constraint api_gateway_authentication_method_pk primary key(api_auth_id));