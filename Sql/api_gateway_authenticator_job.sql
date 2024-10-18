create table if not exists api_gateway_authenticator_job(
oauth_control_id Integer not null,
oauth_control_name varchar(255) null,
oauth_control_registry varchar(255) null,
oauth_control_start_time varchar(255) null,
oauth_control_approved_time varchar(255) null,
oauth_control_owner varchar(255) null,
authorized_device char null,
time_out_in_seconds varchar(255) null,
creation_date varchar(255) null,
modified_adte varchar(255) null,
entity_state varchar(255) null,
constraint api_gateway_authenticator_job_pk primary key(oauth_control_id));