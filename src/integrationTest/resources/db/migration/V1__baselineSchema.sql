create table if not exists resource_master (
    resource_id int AUTO_INCREMENT,
    resource_name VARCHAR(100),
    PRIMARY KEY (resource_id)
);

create procedure create_sample_data()
insert into resource_master (resource_name) values ('Resource1 from schema');
