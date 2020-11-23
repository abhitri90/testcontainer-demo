### Testcontainer with spring boot demo app

###### Requirement:

H2 replicates MySQL / PostGreSQL closely but still falls short and does not provide all functionalities which are provided by actual databases. e.g. procedures/triggers. Also there are some syntactical differences namely, TIMESTAMPTZ in PostGreSQL becomes TIMESTAMP WITH TIME ZONE in H2 which makes it difficult to test db migration scripts.

Test containers help to spin-up a throwaway DB instance with some extra coding in application. It pulls DB image and start a temporary local DB instance to execute tests.

###### Steps to follow:

1. Install docker on machine as this is a pre-requisite
2. Import project in IDE
3. For main application, H2 has been used. Ideally this will be an Aurora or any other DB instance on cloud environment
4. For integrationTest, test container has been implemented. Test container pulls docker image of MySQL and start a throwaway DB instance to execute integration tests.
5. Upon start of integrationsTest, flyway creates DB objects as mentioned in resources:db/migration. This includes a table and a stored procedure later used in integration tests.

Use following command to run integration test for better idea of containerized test execution,

./gradlew integrationTest --info (might be slightly different for windows)
