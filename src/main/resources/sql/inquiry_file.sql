create table tbl_inquiry_file
(
    id         bigint unsigned not null
        primary key,
    inquiry_id bigint unsigned not null,
    constraint fk_inquiry_file_file
        foreign key (id) references tbl_file (id),
    constraint fk_inquiry_file_inquiry
        foreign key (inquiry_id) references tbl_inquiry (id)
);

select * from tbl_inquiry_file;

