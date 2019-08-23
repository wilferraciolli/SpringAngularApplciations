# Getting Started

### Reference Documentation
This project is a spring back end to have an admin daxh board.
It uses application.yml to manage the properties within the appllication


to use profiles set the default rpofile and run the application passing a profile flag

This has a region onfo properties set ont he applciations properties to show how to autowire properties set ont he applciations file.
See RegionInfoCOnfiguration and how it is autowired to the app server

To run for sa specif profile, run the following commoand;
    `mvn spring-boot:run -Dspring.profiles.active={profileName}`
   In the example here it is mvn spring-boot:run -Dspring.profiles.active=qa
